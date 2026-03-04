package com.mpconnect.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "plan_today_events")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
