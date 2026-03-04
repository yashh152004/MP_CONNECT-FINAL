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
@Table(name = "letters")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Letter {

    @Id
    private String id;

    private String type;
    private String department;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String status;
    private Integer version = 1;

    @ElementCollection
    private List<String> tags;

    private String attachmentUrl;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    private String senderId;
}
