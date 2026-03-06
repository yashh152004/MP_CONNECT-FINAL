package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "projects")
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

    public Project() {}

    public Project(String id, String name, String category, String status, Double progress, Double budget, String village, String sanctionOrderNo, String startDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.status = status;
        this.progress = progress;
        this.budget = budget;
        this.village = village;
        this.sanctionOrderNo = sanctionOrderNo;
        this.startDate = startDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getSanctionOrderNo() {
        return sanctionOrderNo;
    }

    public void setSanctionOrderNo(String sanctionOrderNo) {
        this.sanctionOrderNo = sanctionOrderNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public static ProjectBuilder builder() {
        return new ProjectBuilder();
    }
    
    public static class ProjectBuilder {
        private String id;
        private String name;
        private String category;
        private String status;
        private Double progress;
        private Double budget;
        private String village;
        private String sanctionOrderNo;
        private String startDate;

        public ProjectBuilder id(String id) {
            this.id = id;
            return this;
        }
        public ProjectBuilder name(String name) {
            this.name = name;
            return this;
        }
        public ProjectBuilder category(String category) {
            this.category = category;
            return this;
        }
        public ProjectBuilder status(String status) {
            this.status = status;
            return this;
        }
        public ProjectBuilder progress(Double progress) {
            this.progress = progress;
            return this;
        }
        public ProjectBuilder budget(Double budget) {
            this.budget = budget;
            return this;
        }
        public ProjectBuilder village(String village) {
            this.village = village;
            return this;
        }
        public ProjectBuilder sanctionOrderNo(String sanctionOrderNo) {
            this.sanctionOrderNo = sanctionOrderNo;
            return this;
        }
        public ProjectBuilder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Project build() {
            Project instance = new Project();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setCategory(this.category);
            instance.setStatus(this.status);
            instance.setProgress(this.progress);
            instance.setBudget(this.budget);
            instance.setVillage(this.village);
            instance.setSanctionOrderNo(this.sanctionOrderNo);
            instance.setStartDate(this.startDate);
            return instance;
        }
    }
}
