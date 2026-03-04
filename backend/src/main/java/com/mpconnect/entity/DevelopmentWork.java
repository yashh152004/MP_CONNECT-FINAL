package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "development_works")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevelopmentWork {

    @Id
    private String id;

    private String title;
    private String sector;
    private String type;
    private String status;

    // Description properties
    @Column(columnDefinition = "TEXT")
    private String descProject;

    @Column(columnDefinition = "TEXT")
    private String descHistory;

    @Column(columnDefinition = "TEXT")
    private String descWorkDone;

    // Location properties
    private String zilla;
    private String taluk;
    private String gp;
    private String village;
    private String address;
    private Double lat;
    private Double lng;

    // Metrics properties
    private Integer beneficiaries;
    private Double budget;
    private String fundingSource;
    private String otherFundingSource;
    private String startDate;
    private String completionDate;

    // Visibility properties
    private Boolean publicPortal;
    private Boolean featureOnHomepage;

    // Media URLs
    @ElementCollection
    private List<String> photoUrls;

    @ElementCollection
    private List<String> videoUrls;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
