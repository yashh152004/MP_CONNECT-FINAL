package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "contacts")
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

    public Contact() {}

    public Contact(String id, String name, String designation, String organization, String photoUrl, String state, String zilla, String taluk, String gp, String village, String mobile, String whatsapp, String email, String category, Boolean isVip, String birthday, String anniversary, LocalDateTime addedAt) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.organization = organization;
        this.photoUrl = photoUrl;
        this.state = state;
        this.zilla = zilla;
        this.taluk = taluk;
        this.gp = gp;
        this.village = village;
        this.mobile = mobile;
        this.whatsapp = whatsapp;
        this.email = email;
        this.category = category;
        this.isVip = isVip;
        this.birthday = birthday;
        this.anniversary = anniversary;
        this.addedAt = addedAt;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZilla() {
        return zilla;
    }

    public void setZilla(String zilla) {
        this.zilla = zilla;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(String anniversary) {
        this.anniversary = anniversary;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }
    
    public static class ContactBuilder {
        private String id;
        private String name;
        private String designation;
        private String organization;
        private String photoUrl;
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
        private LocalDateTime addedAt;

        public ContactBuilder id(String id) {
            this.id = id;
            return this;
        }
        public ContactBuilder name(String name) {
            this.name = name;
            return this;
        }
        public ContactBuilder designation(String designation) {
            this.designation = designation;
            return this;
        }
        public ContactBuilder organization(String organization) {
            this.organization = organization;
            return this;
        }
        public ContactBuilder photoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }
        public ContactBuilder state(String state) {
            this.state = state;
            return this;
        }
        public ContactBuilder zilla(String zilla) {
            this.zilla = zilla;
            return this;
        }
        public ContactBuilder taluk(String taluk) {
            this.taluk = taluk;
            return this;
        }
        public ContactBuilder gp(String gp) {
            this.gp = gp;
            return this;
        }
        public ContactBuilder village(String village) {
            this.village = village;
            return this;
        }
        public ContactBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public ContactBuilder whatsapp(String whatsapp) {
            this.whatsapp = whatsapp;
            return this;
        }
        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }
        public ContactBuilder category(String category) {
            this.category = category;
            return this;
        }
        public ContactBuilder isVip(Boolean isVip) {
            this.isVip = isVip;
            return this;
        }
        public ContactBuilder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public ContactBuilder anniversary(String anniversary) {
            this.anniversary = anniversary;
            return this;
        }
        public ContactBuilder addedAt(LocalDateTime addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        public Contact build() {
            Contact instance = new Contact();
            instance.setId(this.id);
            instance.setName(this.name);
            instance.setDesignation(this.designation);
            instance.setOrganization(this.organization);
            instance.setPhotoUrl(this.photoUrl);
            instance.setState(this.state);
            instance.setZilla(this.zilla);
            instance.setTaluk(this.taluk);
            instance.setGp(this.gp);
            instance.setVillage(this.village);
            instance.setMobile(this.mobile);
            instance.setWhatsapp(this.whatsapp);
            instance.setEmail(this.email);
            instance.setCategory(this.category);
            instance.setIsVip(this.isVip);
            instance.setBirthday(this.birthday);
            instance.setAnniversary(this.anniversary);
            instance.setAddedAt(this.addedAt);
            return instance;
        }
    }
}
