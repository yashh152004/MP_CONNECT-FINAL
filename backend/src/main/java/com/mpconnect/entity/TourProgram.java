package com.mpconnect.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tour_programs")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
