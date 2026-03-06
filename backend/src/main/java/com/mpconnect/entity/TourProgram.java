package com.mpconnect.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tour_programs")
public class TourProgram {

    @Id
    private String id;

    private String title;
    private String type;
    private String startDate; // YYYY-MM-DD
    private String startTime; // HH:MM
    private String duration;

    // Location Flattened
    private String locName;
    private String locAddress;
    private Double locLat;
    private Double locLng;

    private String status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id")
    private List<TourParticipant> participants;

    @Column(columnDefinition = "TEXT")
    private String instructions;

    // Documentation subfields flattened
    private String actualStartTime;
    private String actualEndTime;

    @Column(columnDefinition = "TEXT")
    private String docSummary;

    @Column(columnDefinition = "TEXT")
    private String docOutcomes;

    @Column(columnDefinition = "TEXT")
    private String docFeedback;

    @ElementCollection
    private List<String> docAttachments;

    private LocalDateTime createdAt = LocalDateTime.now();
    private String createdBy;

    public TourProgram() {}

    public TourProgram(String id, String title, String type, String startDate, String startTime, String duration, String locName, String locAddress, Double locLat, Double locLng, String status, List<TourParticipant> participants, String instructions, String actualStartTime, String actualEndTime, String docSummary, String docOutcomes, String docFeedback, List<String> docAttachments, LocalDateTime createdAt, String createdBy) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.startDate = startDate;
        this.startTime = startTime;
        this.duration = duration;
        this.locName = locName;
        this.locAddress = locAddress;
        this.locLat = locLat;
        this.locLng = locLng;
        this.status = status;
        this.participants = participants;
        this.instructions = instructions;
        this.actualStartTime = actualStartTime;
        this.actualEndTime = actualEndTime;
        this.docSummary = docSummary;
        this.docOutcomes = docOutcomes;
        this.docFeedback = docFeedback;
        this.docAttachments = docAttachments;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocAddress() {
        return locAddress;
    }

    public void setLocAddress(String locAddress) {
        this.locAddress = locAddress;
    }

    public Double getLocLat() {
        return locLat;
    }

    public void setLocLat(Double locLat) {
        this.locLat = locLat;
    }

    public Double getLocLng() {
        return locLng;
    }

    public void setLocLng(Double locLng) {
        this.locLng = locLng;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TourParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<TourParticipant> participants) {
        this.participants = participants;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public String getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(String actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    public String getDocSummary() {
        return docSummary;
    }

    public void setDocSummary(String docSummary) {
        this.docSummary = docSummary;
    }

    public String getDocOutcomes() {
        return docOutcomes;
    }

    public void setDocOutcomes(String docOutcomes) {
        this.docOutcomes = docOutcomes;
    }

    public String getDocFeedback() {
        return docFeedback;
    }

    public void setDocFeedback(String docFeedback) {
        this.docFeedback = docFeedback;
    }

    public List<String> getDocAttachments() {
        return docAttachments;
    }

    public void setDocAttachments(List<String> docAttachments) {
        this.docAttachments = docAttachments;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public static TourProgramBuilder builder() {
        return new TourProgramBuilder();
    }
    
    public static class TourProgramBuilder {
        private String id;
        private String title;
        private String type;
        private String startDate;
        private String startTime;
        private String duration;
        private String locName;
        private String locAddress;
        private Double locLat;
        private Double locLng;
        private String status;
        private List<TourParticipant> participants;
        private String instructions;
        private String actualStartTime;
        private String actualEndTime;
        private String docSummary;
        private String docOutcomes;
        private String docFeedback;
        private List<String> docAttachments;
        private LocalDateTime createdAt;
        private String createdBy;

        public TourProgramBuilder id(String id) {
            this.id = id;
            return this;
        }
        public TourProgramBuilder title(String title) {
            this.title = title;
            return this;
        }
        public TourProgramBuilder type(String type) {
            this.type = type;
            return this;
        }
        public TourProgramBuilder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public TourProgramBuilder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public TourProgramBuilder duration(String duration) {
            this.duration = duration;
            return this;
        }
        public TourProgramBuilder locName(String locName) {
            this.locName = locName;
            return this;
        }
        public TourProgramBuilder locAddress(String locAddress) {
            this.locAddress = locAddress;
            return this;
        }
        public TourProgramBuilder locLat(Double locLat) {
            this.locLat = locLat;
            return this;
        }
        public TourProgramBuilder locLng(Double locLng) {
            this.locLng = locLng;
            return this;
        }
        public TourProgramBuilder status(String status) {
            this.status = status;
            return this;
        }
        public TourProgramBuilder participants(List<TourParticipant> participants) {
            this.participants = participants;
            return this;
        }
        public TourProgramBuilder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }
        public TourProgramBuilder actualStartTime(String actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public TourProgramBuilder actualEndTime(String actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public TourProgramBuilder docSummary(String docSummary) {
            this.docSummary = docSummary;
            return this;
        }
        public TourProgramBuilder docOutcomes(String docOutcomes) {
            this.docOutcomes = docOutcomes;
            return this;
        }
        public TourProgramBuilder docFeedback(String docFeedback) {
            this.docFeedback = docFeedback;
            return this;
        }
        public TourProgramBuilder docAttachments(List<String> docAttachments) {
            this.docAttachments = docAttachments;
            return this;
        }
        public TourProgramBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public TourProgramBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public TourProgram build() {
            TourProgram instance = new TourProgram();
            instance.setId(this.id);
            instance.setTitle(this.title);
            instance.setType(this.type);
            instance.setStartDate(this.startDate);
            instance.setStartTime(this.startTime);
            instance.setDuration(this.duration);
            instance.setLocName(this.locName);
            instance.setLocAddress(this.locAddress);
            instance.setLocLat(this.locLat);
            instance.setLocLng(this.locLng);
            instance.setStatus(this.status);
            instance.setParticipants(this.participants);
            instance.setInstructions(this.instructions);
            instance.setActualStartTime(this.actualStartTime);
            instance.setActualEndTime(this.actualEndTime);
            instance.setDocSummary(this.docSummary);
            instance.setDocOutcomes(this.docOutcomes);
            instance.setDocFeedback(this.docFeedback);
            instance.setDocAttachments(this.docAttachments);
            instance.setCreatedAt(this.createdAt);
            instance.setCreatedBy(this.createdBy);
            return instance;
        }
    }
}
