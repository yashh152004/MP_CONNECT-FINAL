import os
import re

directories = [
    r"d:\MP_CONNECT_FINAL\backend\src\main\java\com\mpconnect\entity",
    r"d:\MP_CONNECT_FINAL\backend\src\main\java\com\mpconnect\dto"
]

def capitalize(s):
    return s[0].upper() + s[1:]

for d in directories:
    if not os.path.exists(d): continue
    for filename in os.listdir(d):
        if not filename.endswith(".java"): continue
        path = os.path.join(d, filename)
        with open(path, "r", encoding="utf-8") as f:
            content = f.read()
            
        if "enum " in content: continue
        
        # Avoid rewriting twice
        if "public " + filename.replace(".java", "") + "()" in content and "get" in content:
            continue
            
        # extract fields with types, e.g private String name;
        fields = re.findall(r'private\s+([A-Za-z0-9_<>,\s\?]+)\s+([A-Za-z0-9_]+)\s*(?:=|;)', content)
        
        class_name_match = re.search(r'public\s+class\s+([A-Za-z0-9_]+)', content)
        if not class_name_match: continue
        class_name = class_name_match.group(1)
        
        # Remove lombok imports
        content = re.sub(r'import\s+lombok\.[A-Za-z0-9_]+;\n*', '', content)
        
        # Remove lombok annotations
        content = re.sub(r'@Data\s*\n*', '', content)
        content = re.sub(r'@Builder\s*\n*', '', content)
        content = re.sub(r'@NoArgsConstructor\s*\n*', '', content)
        content = re.sub(r'@AllArgsConstructor\s*\n*', '', content)
        content = re.sub(r'@Getter\s*\n*', '', content)
        content = re.sub(r'@Setter\s*\n*', '', content)
        
        # Method generation
        methods = []
        
        # No args constructor
        methods.append(f"    public {class_name}() {{}}")
        
        # All args constructor
        if fields:
            args = ", ".join([f"{t.strip()} {n.strip()}" for t, n in fields])
            assigns = "\n".join([f"        this.{n.strip()} = {n.strip()};" for t, n in fields])
            methods.append(f"    public {class_name}({args}) {{\n{assigns}\n    }}")
            
        # Getters and setters
        for t, n in fields:
            t = t.strip()
            n = n.strip()
            capitalized_n = capitalize(n)
            methods.append(f"    public {t} get{capitalized_n}() {{\n        return {n};\n    }}")
            methods.append(f"    public void set{capitalized_n}({t} {n}) {{\n        this.{n} = {n};\n    }}")
            
        # Builder pattern
        builder_fields = "\n".join([f"        private {t.strip()} {n.strip()};" for t, n in fields])
        builder_methods = "\n".join([f"        public {class_name}Builder {n.strip()}({t.strip()} {n.strip()}) {{\n            this.{n.strip()} = {n.strip()};\n            return this;\n        }}" for t, n in fields])
        build_assigns = "\n".join([f"            instance.set{capitalize(n.strip())}(this.{n.strip()});" for t, n in fields])
        
        methods.append(f"""    public static {class_name}Builder builder() {{
        return new {class_name}Builder();
    }}
    
    public static class {class_name}Builder {{
{builder_fields}

{builder_methods}

        public {class_name} build() {{
            {class_name} instance = new {class_name}();
{build_assigns}
            return instance;
        }}
    }}""")

        last_brace_idx = content.rfind('}')
        if last_brace_idx != -1:
            all_methods = "\n\n".join(methods)
            new_content = content[:last_brace_idx] + "\n" + all_methods + "\n" + content[last_brace_idx:]
            with open(path, "w", encoding="utf-8") as f:
                f.write(new_content)
