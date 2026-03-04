package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "scheduled_tour_destinations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledTourDestination {

    @Id
    private String id;

    private String destinationId;
    private Integer sequence;
    private String arrivalTime;
    private String duration;
}
