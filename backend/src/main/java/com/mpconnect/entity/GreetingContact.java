package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "greeting_contacts")
public class GreetingContact {
    @Id
    private String id;

    private String name;
    private String designation;
    private String event;
    private String date; // MM-DD
    private String phone;
    private String email;
    private Integer lastGreetedYear;

    public GreetingContact() {}

    public GreetingContact(String id, String name, String designation, String event, String date, String phone, String email, Integer lastGreetedYear) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.event = event;
        this.date = date;
        this.phone = phone;
        this.email = email;
        this.lastGreetedYear = lastGreetedYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLastGreetedYear() {
        return lastGreetedYear;
    }

    public void setLastGreetedYear(Integer lastGreetedYear) {
        this.lastGreetedYear = lastGreetedYear;
    }

    public static GreetingContactBuilder builder() {
        return new GreetingContactBuilder();
    }
    
    public static class GreetingContactBuilder {
        private String id;
        private String name;
        private String designation;
        private String event;
        private String date;
        private String phone;
        private String email;
        private Integer lastGreetedYear;

        public GreetingContactBuilder id(String id) {
            this.id = id;
            return this;
        }
        public GreetingContactBuilder name(String name) {
            this.name = name;
            return this;
        }
        public GreetingContactBuilder designation(String designation) {
            this.designation = designation;
            return this;
        }
        public GreetingContactBuilder event(String event) {
            this.event = event;
            return this;
        }
        public GreetingContactBuilder date(String date) {
            this.date = date;
            return this;
        }
        public GreetingContactBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public GreetingContactBuilder email(String email) {
            this.email = email;
            return this;
        }
        public GreetingContactBuilder lastGreetedYear(Integer lastGreetedYear) {
            this.lastGreetedYear = lastGreetedYear;
            return this;
        }

        public GreetingContact build() {
            GreetingContact instance = new GreetingContact();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setDesignation(this.designation);
            instance.setEvent(this.event);
            instance.setDate(this.date);
            instance.setPhone(this.phone);
            instance.setEmail(this.email);
            instance.setLastGreetedYear(this.lastGreetedYear);
            return instance;
        }
    }
}
