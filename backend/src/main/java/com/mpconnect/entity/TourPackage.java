package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Column;
import java.util.List;

@Entity
@Table(name = "tour_packages")
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

    public TourPackage() {}

    public TourPackage(String id, String name, String description, String standardDuration, List<String> activities, List<String> resources, String status, List<String> mappedDestinationIds, List<String> images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.standardDuration = standardDuration;
        this.activities = activities;
        this.resources = resources;
        this.status = status;
        this.mappedDestinationIds = mappedDestinationIds;
        this.images = images;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStandardDuration() {
        return standardDuration;
    }

    public void setStandardDuration(String standardDuration) {
        this.standardDuration = standardDuration;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getMappedDestinationIds() {
        return mappedDestinationIds;
    }

    public void setMappedDestinationIds(List<String> mappedDestinationIds) {
        this.mappedDestinationIds = mappedDestinationIds;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public static TourPackageBuilder builder() {
        return new TourPackageBuilder();
    }
    
    public static class TourPackageBuilder {
        private String id;
        private String name;
        private String description;
        private String standardDuration;
        private List<String> activities;
        private List<String> resources;
        private String status;
        private List<String> mappedDestinationIds;
        private List<String> images;

        public TourPackageBuilder id(String id) {
            this.id = id;
            return this;
        }
        public TourPackageBuilder name(String name) {
            this.name = name;
            return this;
        }
        public TourPackageBuilder description(String description) {
            this.description = description;
            return this;
        }
        public TourPackageBuilder standardDuration(String standardDuration) {
            this.standardDuration = standardDuration;
            return this;
        }
        public TourPackageBuilder activities(List<String> activities) {
            this.activities = activities;
            return this;
        }
        public TourPackageBuilder resources(List<String> resources) {
            this.resources = resources;
            return this;
        }
        public TourPackageBuilder status(String status) {
            this.status = status;
            return this;
        }
        public TourPackageBuilder mappedDestinationIds(List<String> mappedDestinationIds) {
            this.mappedDestinationIds = mappedDestinationIds;
            return this;
        }
        public TourPackageBuilder images(List<String> images) {
            this.images = images;
            return this;
        }

        public TourPackage build() {
            TourPackage instance = new TourPackage();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setDescription(this.description);
            instance.setStandardDuration(this.standardDuration);
            instance.setActivities(this.activities);
            instance.setResources(this.resources);
            instance.setStatus(this.status);
            instance.setMappedDestinationIds(this.mappedDestinationIds);
            instance.setImages(this.images);
            return instance;
        }
    }
}
