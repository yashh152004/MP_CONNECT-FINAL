package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "complaints")
@Data
public class Complaint {
    @Id
    private String id;

    private String category;
    private String location;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String citizenName;
    private String priority;
    private String assignedTo;

    @ElementCollection
    private List<String> attachments;

    @Column(columnDefinition = "TEXT")
    private String staffNotes;

    @Column(columnDefinition = "TEXT")
    private String paInstructions;
}
