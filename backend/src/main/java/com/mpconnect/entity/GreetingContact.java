package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "greeting_contacts")
@Data
public class GreetingContact {
    @Id
    private String id;

    private String name;
    private String designation;
    private String event;
    private String date; // MM-DD
    private String phone;
    private String email;
    private Integer lastGreetedYear;
}
