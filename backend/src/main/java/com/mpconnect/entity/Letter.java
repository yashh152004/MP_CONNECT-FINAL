package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "letters")
public class Letter {

    @Id
    private String id;

    private String type;
    private String department;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String status;
    private Integer version = 1;

    @ElementCollection
    private List<String> tags;

    private String attachmentUrl;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    private String senderId;

    public Letter() {}

    public Letter(String id, String type, String department, String title, String content, String status, Integer version, List<String> tags, String attachmentUrl, LocalDateTime createdAt, LocalDateTime updatedAt, String senderId) {
        this.id = id;
        this.type = type;
        this.department = department;
        this.title = title;
        this.content = content;
        this.status = status;
        this.version = version;
        this.tags = tags;
        this.attachmentUrl = attachmentUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.senderId = senderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public static LetterBuilder builder() {
        return new LetterBuilder();
    }
    
    public static class LetterBuilder {
        private String id;
        private String type;
        private String department;
        private String title;
        private String content;
        private String status;
        private Integer version;
        private List<String> tags;
        private String attachmentUrl;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String senderId;

        public LetterBuilder id(String id) {
            this.id = id;
            return this;
        }
        public LetterBuilder type(String type) {
            this.type = type;
            return this;
        }
        public LetterBuilder department(String department) {
            this.department = department;
            return this;
        }
        public LetterBuilder title(String title) {
            this.title = title;
            return this;
        }
        public LetterBuilder content(String content) {
            this.content = content;
            return this;
        }
        public LetterBuilder status(String status) {
            this.status = status;
            return this;
        }
        public LetterBuilder version(Integer version) {
            this.version = version;
            return this;
        }
        public LetterBuilder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
        public LetterBuilder attachmentUrl(String attachmentUrl) {
            this.attachmentUrl = attachmentUrl;
            return this;
        }
        public LetterBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public LetterBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public LetterBuilder senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }

        public Letter build() {
            Letter instance = new Letter();
            instance.setId(this.id);
            instance.setType(this.type);
            instance.setDepartment(this.department);
            instance.setTitle(this.title);
            instance.setContent(this.content);
            instance.setStatus(this.status);
            instance.setVersion(this.version);
            instance.setTags(this.tags);
            instance.setAttachmentUrl(this.attachmentUrl);
            instance.setCreatedAt(this.createdAt);
            instance.setUpdatedAt(this.updatedAt);
            instance.setSenderId(this.senderId);
            return instance;
        }
    }
}
