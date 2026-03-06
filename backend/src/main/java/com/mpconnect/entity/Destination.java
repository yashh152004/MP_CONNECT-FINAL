package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "destinations")
public class Destination {

    @Id
    private String id;

    private String name;
    private String district;
    private String block;
    private String village;
    private String contactPerson;
    private String contactPhone;
    private String accessibility;

    public Destination() {}

    public Destination(String id, String name, String district, String block, String village, String contactPerson, String contactPhone, String accessibility) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.block = block;
        this.village = village;
        this.contactPerson = contactPerson;
        this.contactPhone = contactPhone;
        this.accessibility = accessibility;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public static DestinationBuilder builder() {
        return new DestinationBuilder();
    }
    
    public static class DestinationBuilder {
        private String id;
        private String name;
        private String district;
        private String block;
        private String village;
        private String contactPerson;
        private String contactPhone;
        private String accessibility;

        public DestinationBuilder id(String id) {
            this.id = id;
            return this;
        }
        public DestinationBuilder name(String name) {
            this.name = name;
            return this;
        }
        public DestinationBuilder district(String district) {
            this.district = district;
            return this;
        }
        public DestinationBuilder block(String block) {
            this.block = block;
            return this;
        }
        public DestinationBuilder village(String village) {
            this.village = village;
            return this;
        }
        public DestinationBuilder contactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public DestinationBuilder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public DestinationBuilder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        public Destination build() {
            Destination instance = new Destination();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setDistrict(this.district);
            instance.setBlock(this.block);
            instance.setVillage(this.village);
            instance.setContactPerson(this.contactPerson);
            instance.setContactPhone(this.contactPhone);
            instance.setAccessibility(this.accessibility);
            return instance;
        }
    }
}
