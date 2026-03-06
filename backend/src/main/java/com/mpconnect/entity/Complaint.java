package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "complaints")
public class Complaint {
    @Id
    private String id;

    private String category;
    private String location;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String citizenName;
    private String priority;
    private String assignedTo;

    @ElementCollection
    private List<String> attachments;

    @Column(columnDefinition = "TEXT")
    private String staffNotes;

    @Column(columnDefinition = "TEXT")
    private String paInstructions;

    public Complaint() {}

    public Complaint(String id, String category, String location, String description, String status, LocalDateTime createdAt, String citizenName, String priority, String assignedTo, List<String> attachments, String staffNotes, String paInstructions) {
        this.id = id;
        this.category = category;
        this.location = location;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.citizenName = citizenName;
        this.priority = priority;
        this.assignedTo = assignedTo;
        this.attachments = attachments;
        this.staffNotes = staffNotes;
        this.paInstructions = paInstructions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public String getStaffNotes() {
        return staffNotes;
    }

    public void setStaffNotes(String staffNotes) {
        this.staffNotes = staffNotes;
    }

    public String getPaInstructions() {
        return paInstructions;
    }

    public void setPaInstructions(String paInstructions) {
        this.paInstructions = paInstructions;
    }

    public static ComplaintBuilder builder() {
        return new ComplaintBuilder();
    }
    
    public static class ComplaintBuilder {
        private String id;
        private String category;
        private String location;
        private String description;
        private String status;
        private LocalDateTime createdAt;
        private String citizenName;
        private String priority;
        private String assignedTo;
        private List<String> attachments;
        private String staffNotes;
        private String paInstructions;

        public ComplaintBuilder id(String id) {
            this.id = id;
            return this;
        }
        public ComplaintBuilder category(String category) {
            this.category = category;
            return this;
        }
        public ComplaintBuilder location(String location) {
            this.location = location;
            return this;
        }
        public ComplaintBuilder description(String description) {
            this.description = description;
            return this;
        }
        public ComplaintBuilder status(String status) {
            this.status = status;
            return this;
        }
        public ComplaintBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public ComplaintBuilder citizenName(String citizenName) {
            this.citizenName = citizenName;
            return this;
        }
        public ComplaintBuilder priority(String priority) {
            this.priority = priority;
            return this;
        }
        public ComplaintBuilder assignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public ComplaintBuilder attachments(List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public ComplaintBuilder staffNotes(String staffNotes) {
            this.staffNotes = staffNotes;
            return this;
        }
        public ComplaintBuilder paInstructions(String paInstructions) {
            this.paInstructions = paInstructions;
            return this;
        }

        public Complaint build() {
            Complaint instance = new Complaint();
            instance.setId(this.id);
            instance.setCategory(this.category);
            instance.setLocation(this.location);
            instance.setDescription(this.description);
            instance.setStatus(this.status);
            instance.setCreatedAt(this.createdAt);
            instance.setCitizenName(this.citizenName);
            instance.setPriority(this.priority);
            instance.setAssignedTo(this.assignedTo);
            instance.setAttachments(this.attachments);
            instance.setStaffNotes(this.staffNotes);
            instance.setPaInstructions(this.paInstructions);
            return instance;
        }
    }
}
