package com.mpconnect.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "plan_today_events")
public class PlanTodayEvent {

    @Id
    private String id;

    private String title;
    private String type;
    private String date; // YYYY-MM-DD
    private String startTime; // HH:MM
    private String duration; // e.g., "1h 30m"

    private String locName;
    private String locAddress;
    private Double locLat;
    private Double locLng;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private List<PlanTodayAttendee> attendees;

    @Column(columnDefinition = "TEXT")
    private String purpose;
    private String status;

    // Documentation subfields flattened
    private String docActualStartTime;
    private String docActualEndTime;

    @ElementCollection
    private List<String> docActualAttendees;

    @Column(columnDefinition = "TEXT")
    private String docSummary;

    @Column(columnDefinition = "TEXT")
    private String docOutcomes;

    @ElementCollection
    private List<String> docActionItems;

    @Column(columnDefinition = "TEXT")
    private String docTextNotes;
    private Boolean docHasVoiceNote;
    private String docVoiceNoteDuration;

    private LocalDateTime createdAt = LocalDateTime.now();
    private String createdBy;

    public PlanTodayEvent() {}

    public PlanTodayEvent(String id, String title, String type, String date, String startTime, String duration, String locName, String locAddress, Double locLat, Double locLng, List<PlanTodayAttendee> attendees, String purpose, String status, String docActualStartTime, String docActualEndTime, List<String> docActualAttendees, String docSummary, String docOutcomes, List<String> docActionItems, String docTextNotes, Boolean docHasVoiceNote, String docVoiceNoteDuration, LocalDateTime createdAt, String createdBy) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
        this.locName = locName;
        this.locAddress = locAddress;
        this.locLat = locLat;
        this.locLng = locLng;
        this.attendees = attendees;
        this.purpose = purpose;
        this.status = status;
        this.docActualStartTime = docActualStartTime;
        this.docActualEndTime = docActualEndTime;
        this.docActualAttendees = docActualAttendees;
        this.docSummary = docSummary;
        this.docOutcomes = docOutcomes;
        this.docActionItems = docActionItems;
        this.docTextNotes = docTextNotes;
        this.docHasVoiceNote = docHasVoiceNote;
        this.docVoiceNoteDuration = docVoiceNoteDuration;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public List<PlanTodayAttendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<PlanTodayAttendee> attendees) {
        this.attendees = attendees;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocActualStartTime() {
        return docActualStartTime;
    }

    public void setDocActualStartTime(String docActualStartTime) {
        this.docActualStartTime = docActualStartTime;
    }

    public String getDocActualEndTime() {
        return docActualEndTime;
    }

    public void setDocActualEndTime(String docActualEndTime) {
        this.docActualEndTime = docActualEndTime;
    }

    public List<String> getDocActualAttendees() {
        return docActualAttendees;
    }

    public void setDocActualAttendees(List<String> docActualAttendees) {
        this.docActualAttendees = docActualAttendees;
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

    public List<String> getDocActionItems() {
        return docActionItems;
    }

    public void setDocActionItems(List<String> docActionItems) {
        this.docActionItems = docActionItems;
    }

    public String getDocTextNotes() {
        return docTextNotes;
    }

    public void setDocTextNotes(String docTextNotes) {
        this.docTextNotes = docTextNotes;
    }

    public Boolean getDocHasVoiceNote() {
        return docHasVoiceNote;
    }

    public void setDocHasVoiceNote(Boolean docHasVoiceNote) {
        this.docHasVoiceNote = docHasVoiceNote;
    }

    public String getDocVoiceNoteDuration() {
        return docVoiceNoteDuration;
    }

    public void setDocVoiceNoteDuration(String docVoiceNoteDuration) {
        this.docVoiceNoteDuration = docVoiceNoteDuration;
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

    public static PlanTodayEventBuilder builder() {
        return new PlanTodayEventBuilder();
    }
    
    public static class PlanTodayEventBuilder {
        private String id;
        private String title;
        private String type;
        private String date;
        private String startTime;
        private String duration;
        private String locName;
        private String locAddress;
        private Double locLat;
        private Double locLng;
        private List<PlanTodayAttendee> attendees;
        private String purpose;
        private String status;
        private String docActualStartTime;
        private String docActualEndTime;
        private List<String> docActualAttendees;
        private String docSummary;
        private String docOutcomes;
        private List<String> docActionItems;
        private String docTextNotes;
        private Boolean docHasVoiceNote;
        private String docVoiceNoteDuration;
        private LocalDateTime createdAt;
        private String createdBy;

        public PlanTodayEventBuilder id(String id) {
            this.id = id;
            return this;
        }
        public PlanTodayEventBuilder title(String title) {
            this.title = title;
            return this;
        }
        public PlanTodayEventBuilder type(String type) {
            this.type = type;
            return this;
        }
        public PlanTodayEventBuilder date(String date) {
            this.date = date;
            return this;
        }
        public PlanTodayEventBuilder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public PlanTodayEventBuilder duration(String duration) {
            this.duration = duration;
            return this;
        }
        public PlanTodayEventBuilder locName(String locName) {
            this.locName = locName;
            return this;
        }
        public PlanTodayEventBuilder locAddress(String locAddress) {
            this.locAddress = locAddress;
            return this;
        }
        public PlanTodayEventBuilder locLat(Double locLat) {
            this.locLat = locLat;
            return this;
        }
        public PlanTodayEventBuilder locLng(Double locLng) {
            this.locLng = locLng;
            return this;
        }
        public PlanTodayEventBuilder attendees(List<PlanTodayAttendee> attendees) {
            this.attendees = attendees;
            return this;
        }
        public PlanTodayEventBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }
        public PlanTodayEventBuilder status(String status) {
            this.status = status;
            return this;
        }
        public PlanTodayEventBuilder docActualStartTime(String docActualStartTime) {
            this.docActualStartTime = docActualStartTime;
            return this;
        }
        public PlanTodayEventBuilder docActualEndTime(String docActualEndTime) {
            this.docActualEndTime = docActualEndTime;
            return this;
        }
        public PlanTodayEventBuilder docActualAttendees(List<String> docActualAttendees) {
            this.docActualAttendees = docActualAttendees;
            return this;
        }
        public PlanTodayEventBuilder docSummary(String docSummary) {
            this.docSummary = docSummary;
            return this;
        }
        public PlanTodayEventBuilder docOutcomes(String docOutcomes) {
            this.docOutcomes = docOutcomes;
            return this;
        }
        public PlanTodayEventBuilder docActionItems(List<String> docActionItems) {
            this.docActionItems = docActionItems;
            return this;
        }
        public PlanTodayEventBuilder docTextNotes(String docTextNotes) {
            this.docTextNotes = docTextNotes;
            return this;
        }
        public PlanTodayEventBuilder docHasVoiceNote(Boolean docHasVoiceNote) {
            this.docHasVoiceNote = docHasVoiceNote;
            return this;
        }
        public PlanTodayEventBuilder docVoiceNoteDuration(String docVoiceNoteDuration) {
            this.docVoiceNoteDuration = docVoiceNoteDuration;
            return this;
        }
        public PlanTodayEventBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public PlanTodayEventBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public PlanTodayEvent build() {
            PlanTodayEvent instance = new PlanTodayEvent();
            instance.setId(this.id);
            instance.setTitle(this.title);
            instance.setType(this.type);
            instance.setDate(this.date);
            instance.setStartTime(this.startTime);
            instance.setDuration(this.duration);
            instance.setLocName(this.locName);
            instance.setLocAddress(this.locAddress);
            instance.setLocLat(this.locLat);
            instance.setLocLng(this.locLng);
            instance.setAttendees(this.attendees);
            instance.setPurpose(this.purpose);
            instance.setStatus(this.status);
            instance.setDocActualStartTime(this.docActualStartTime);
            instance.setDocActualEndTime(this.docActualEndTime);
            instance.setDocActualAttendees(this.docActualAttendees);
            instance.setDocSummary(this.docSummary);
            instance.setDocOutcomes(this.docOutcomes);
            instance.setDocActionItems(this.docActionItems);
            instance.setDocTextNotes(this.docTextNotes);
            instance.setDocHasVoiceNote(this.docHasVoiceNote);
            instance.setDocVoiceNoteDuration(this.docVoiceNoteDuration);
            instance.setCreatedAt(this.createdAt);
            instance.setCreatedBy(this.createdBy);
            return instance;
        }
    }
}
