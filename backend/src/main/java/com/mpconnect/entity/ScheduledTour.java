package com.mpconnect.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "scheduled_tours")
public class ScheduledTour {

    @Id
    private String id;

    private String date;
    private String startTime;
    private String packageId;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "scheduled_tour_id")
    private List<ScheduledTourDestination> destinations;

    @ElementCollection
    private List<String> participants;

    @Column(columnDefinition = "TEXT")
    private String specialInstructions;

    public ScheduledTour() {}

    public ScheduledTour(String id, String date, String startTime, String packageId, String status, List<ScheduledTourDestination> destinations, List<String> participants, String specialInstructions) {
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.packageId = packageId;
        this.status = status;
        this.destinations = destinations;
        this.participants = participants;
        this.specialInstructions = specialInstructions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ScheduledTourDestination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<ScheduledTourDestination> destinations) {
        this.destinations = destinations;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public static ScheduledTourBuilder builder() {
        return new ScheduledTourBuilder();
    }
    
    public static class ScheduledTourBuilder {
        private String id;
        private String date;
        private String startTime;
        private String packageId;
        private String status;
        private List<ScheduledTourDestination> destinations;
        private List<String> participants;
        private String specialInstructions;

        public ScheduledTourBuilder id(String id) {
            this.id = id;
            return this;
        }
        public ScheduledTourBuilder date(String date) {
            this.date = date;
            return this;
        }
        public ScheduledTourBuilder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public ScheduledTourBuilder packageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public ScheduledTourBuilder status(String status) {
            this.status = status;
            return this;
        }
        public ScheduledTourBuilder destinations(List<ScheduledTourDestination> destinations) {
            this.destinations = destinations;
            return this;
        }
        public ScheduledTourBuilder participants(List<String> participants) {
            this.participants = participants;
            return this;
        }
        public ScheduledTourBuilder specialInstructions(String specialInstructions) {
            this.specialInstructions = specialInstructions;
            return this;
        }

        public ScheduledTour build() {
            ScheduledTour instance = new ScheduledTour();
            instance.setId(this.id);
            instance.setDate(this.date);
            instance.setStartTime(this.startTime);
            instance.setPackageId(this.packageId);
            instance.setStatus(this.status);
            instance.setDestinations(this.destinations);
            instance.setParticipants(this.participants);
            instance.setSpecialInstructions(this.specialInstructions);
            return instance;
        }
    }
}
