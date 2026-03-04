package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    private String id;

    private String name;
    private String designation;
    private String organization;
    private String photoUrl;

    // Flattened ContactLocation
    private String state;
    private String zilla;
    private String taluk;
    private String gp;
    private String village;

    private String mobile;
    private String whatsapp;
    private String email;
    private String category;

    private Boolean isVip;
    private String birthday;
    private String anniversary;

    private LocalDateTime addedAt = LocalDateTime.now();
}
