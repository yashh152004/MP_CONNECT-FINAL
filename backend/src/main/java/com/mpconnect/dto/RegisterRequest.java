package com.mpconnect.dto;

public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private String role;
    private String constituency;

    public RegisterRequest() {}

    public RegisterRequest(String name, String email, String password, String role, String constituency) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.constituency = constituency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public static RegisterRequestBuilder builder() {
        return new RegisterRequestBuilder();
    }
    
    public static class RegisterRequestBuilder {
        private String name;
        private String email;
        private String password;
        private String role;
        private String constituency;

        public RegisterRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        public RegisterRequestBuilder email(String email) {
            this.email = email;
            return this;
        }
        public RegisterRequestBuilder password(String password) {
            this.password = password;
            return this;
        }
        public RegisterRequestBuilder role(String role) {
            this.role = role;
            return this;
        }
        public RegisterRequestBuilder constituency(String constituency) {
            this.constituency = constituency;
            return this;
        }

        public RegisterRequest build() {
            RegisterRequest instance = new RegisterRequest();
            instance.setName(this.name);
            instance.setEmail(this.email);
            instance.setPassword(this.password);
            instance.setRole(this.role);
            instance.setConstituency(this.constituency);
            return instance;
        }
    }
}
