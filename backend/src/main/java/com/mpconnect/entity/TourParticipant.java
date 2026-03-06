package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tour_participants")
public class TourParticipant {

    @Id
    private String id;

    private String name;
    private String role;
    private String contact;
    private Boolean isNodalOfficer;
    private Boolean notified;
    private Boolean present;

    public TourParticipant() {}

    public TourParticipant(String id, String name, String role, String contact, Boolean isNodalOfficer, Boolean notified, Boolean present) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.isNodalOfficer = isNodalOfficer;
        this.notified = notified;
        this.present = present;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Boolean getIsNodalOfficer() {
        return isNodalOfficer;
    }

    public void setIsNodalOfficer(Boolean isNodalOfficer) {
        this.isNodalOfficer = isNodalOfficer;
    }

    public Boolean getNotified() {
        return notified;
    }

    public void setNotified(Boolean notified) {
        this.notified = notified;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public static TourParticipantBuilder builder() {
        return new TourParticipantBuilder();
    }
    
    public static class TourParticipantBuilder {
        private String id;
        private String name;
        private String role;
        private String contact;
        private Boolean isNodalOfficer;
        private Boolean notified;
        private Boolean present;

        public TourParticipantBuilder id(String id) {
            this.id = id;
            return this;
        }
        public TourParticipantBuilder name(String name) {
            this.name = name;
            return this;
        }
        public TourParticipantBuilder role(String role) {
            this.role = role;
            return this;
        }
        public TourParticipantBuilder contact(String contact) {
            this.contact = contact;
            return this;
        }
        public TourParticipantBuilder isNodalOfficer(Boolean isNodalOfficer) {
            this.isNodalOfficer = isNodalOfficer;
            return this;
        }
        public TourParticipantBuilder notified(Boolean notified) {
            this.notified = notified;
            return this;
        }
        public TourParticipantBuilder present(Boolean present) {
            this.present = present;
            return this;
        }

        public TourParticipant build() {
            TourParticipant instance = new TourParticipant();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setRole(this.role);
            instance.setContact(this.contact);
            instance.setIsNodalOfficer(this.isNodalOfficer);
            instance.setNotified(this.notified);
            instance.setPresent(this.present);
            return instance;
        }
    }
}
