package com.mpconnect.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Table(name = "scheduled_tours")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledTour {

    @Id
    private String id;

    private String date;
    private String startTime;
    private String packageId;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "scheduled_tour_id")
    private List<ScheduledTourDestination> destinations;

    @ElementCollection
    private List<String> participants;

    @Column(columnDefinition = "TEXT")
    private String specialInstructions;
}
