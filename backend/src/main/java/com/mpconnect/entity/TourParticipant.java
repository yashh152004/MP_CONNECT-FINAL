package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tour_participants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourParticipant {

    @Id
    private String id;

    private String name;
    private String role;
    private String contact;
    private Boolean isNodalOfficer;
    private Boolean notified;
    private Boolean present;
}
