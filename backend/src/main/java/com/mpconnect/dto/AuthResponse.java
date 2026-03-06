package com.mpconnect.dto;

public class AuthResponse {
    private String token;
    private String userId;
    private String name;
    private String role;

    public AuthResponse() {}

    public AuthResponse(String token, String userId, String name, String role) {
        this.token = token;
        this.userId = userId;
        this.name = name;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static AuthResponseBuilder builder() {
        return new AuthResponseBuilder();
    }
    
    public static class AuthResponseBuilder {
        private String token;
        private String userId;
        private String name;
        private String role;

        public AuthResponseBuilder token(String token) {
            this.token = token;
            return this;
        }
        public AuthResponseBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }
        public AuthResponseBuilder name(String name) {
            this.name = name;
            return this;
        }
        public AuthResponseBuilder role(String role) {
            this.role = role;
            return this;
        }

        public AuthResponse build() {
            AuthResponse instance = new AuthResponse();
            instance.setToken(this.token);
            instance.setUserId(this.userId);
            instance.setName(this.name);
            instance.setRole(this.role);
            return instance;
        }
    }
}
