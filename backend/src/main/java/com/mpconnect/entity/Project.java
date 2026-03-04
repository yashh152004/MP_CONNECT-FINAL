package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    private String id;

    private String name;
    private String category;
    private String status;
    private Double progress;
    private Double budget;
    private String village;
    private String sanctionOrderNo;
    private String startDate;
}
