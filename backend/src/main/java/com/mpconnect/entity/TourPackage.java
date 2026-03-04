package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tour_packages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourPackage {

    @Id
    private String id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String standardDuration;

    @ElementCollection
    private List<String> activities;

    @ElementCollection
    private List<String> resources;

    private String status;

    @ElementCollection
    private List<String> mappedDestinationIds;

    @ElementCollection
    private List<String> images;
}
