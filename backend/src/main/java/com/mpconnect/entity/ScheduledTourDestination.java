package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "scheduled_tour_destinations")
public class ScheduledTourDestination {

    @Id
    private String id;

    private String destinationId;
    private Integer sequence;
    private String arrivalTime;
    private String duration;

    public ScheduledTourDestination() {}

    public ScheduledTourDestination(String id, String destinationId, Integer sequence, String arrivalTime, String duration) {
        this.id = id;
        this.destinationId = destinationId;
        this.sequence = sequence;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public static ScheduledTourDestinationBuilder builder() {
        return new ScheduledTourDestinationBuilder();
    }
    
    public static class ScheduledTourDestinationBuilder {
        private String id;
        private String destinationId;
        private Integer sequence;
        private String arrivalTime;
        private String duration;

        public ScheduledTourDestinationBuilder id(String id) {
            this.id = id;
            return this;
        }
        public ScheduledTourDestinationBuilder destinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public ScheduledTourDestinationBuilder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public ScheduledTourDestinationBuilder arrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public ScheduledTourDestinationBuilder duration(String duration) {
            this.duration = duration;
            return this;
        }

        public ScheduledTourDestination build() {
            ScheduledTourDestination instance = new ScheduledTourDestination();
            instance.setId(this.id);
            instance.setDestinationId(this.destinationId);
            instance.setSequence(this.sequence);
            instance.setArrivalTime(this.arrivalTime);
            instance.setDuration(this.duration);
            return instance;
        }
    }
}
