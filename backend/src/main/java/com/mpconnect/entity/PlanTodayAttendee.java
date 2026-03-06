package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "plan_today_attendees")
public class PlanTodayAttendee {
    @Id
    private String id;

    private String name;
    private String designation;
    private String contact;

    // many-to-one not defined explicitly to keep it simple or use element
    // collection if we just store string
    // Let's use @ManyToOne mapping on this side if we want a relationship

    public PlanTodayAttendee() {}

    public PlanTodayAttendee(String id, String name, String designation, String contact) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.contact = contact;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public static PlanTodayAttendeeBuilder builder() {
        return new PlanTodayAttendeeBuilder();
    }
    
    public static class PlanTodayAttendeeBuilder {
        private String id;
        private String name;
        private String designation;
        private String contact;

        public PlanTodayAttendeeBuilder id(String id) {
            this.id = id;
            return this;
        }
        public PlanTodayAttendeeBuilder name(String name) {
            this.name = name;
            return this;
        }
        public PlanTodayAttendeeBuilder designation(String designation) {
            this.designation = designation;
            return this;
        }
        public PlanTodayAttendeeBuilder contact(String contact) {
            this.contact = contact;
            return this;
        }

        public PlanTodayAttendee build() {
            PlanTodayAttendee instance = new PlanTodayAttendee();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setDesignation(this.designation);
            instance.setContact(this.contact);
            return instance;
        }
    }
}
