package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "plan_today_attendees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanTodayAttendee {
    @Id
    private String id;

    private String name;
    private String designation;
    private String contact;

    // many-to-one not defined explicitly to keep it simple or use element
    // collection if we just store string
    // Let's use @ManyToOne mapping on this side if we want a relationship
}
