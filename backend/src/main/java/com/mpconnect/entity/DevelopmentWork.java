package com.mpconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "development_works")
public class DevelopmentWork {

    @Id
    private String id;

    private String title;
    private String sector;
    private String type;
    private String status;

    // Description properties
    @Column(columnDefinition = "TEXT")
    private String descProject;

    @Column(columnDefinition = "TEXT")
    private String descHistory;

    @Column(columnDefinition = "TEXT")
    private String descWorkDone;

    // Location properties
    private String zilla;
    private String taluk;
    private String gp;
    private String village;
    private String address;
    private Double lat;
    private Double lng;

    // Metrics properties
    private Integer beneficiaries;
    private Double budget;
    private String fundingSource;
    private String otherFundingSource;
    private String startDate;
    private String completionDate;

    // Visibility properties
    private Boolean publicPortal;
    private Boolean featureOnHomepage;

    // Media URLs
    @ElementCollection
    private List<String> photoUrls;

    @ElementCollection
    private List<String> videoUrls;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    public DevelopmentWork() {}

    public DevelopmentWork(String id, String title, String sector, String type, String status, String descProject, String descHistory, String descWorkDone, String zilla, String taluk, String gp, String village, String address, Double lat, Double lng, Integer beneficiaries, Double budget, String fundingSource, String otherFundingSource, String startDate, String completionDate, Boolean publicPortal, Boolean featureOnHomepage, List<String> photoUrls, List<String> videoUrls, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.sector = sector;
        this.type = type;
        this.status = status;
        this.descProject = descProject;
        this.descHistory = descHistory;
        this.descWorkDone = descWorkDone;
        this.zilla = zilla;
        this.taluk = taluk;
        this.gp = gp;
        this.village = village;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.beneficiaries = beneficiaries;
        this.budget = budget;
        this.fundingSource = fundingSource;
        this.otherFundingSource = otherFundingSource;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.publicPortal = publicPortal;
        this.featureOnHomepage = featureOnHomepage;
        this.photoUrls = photoUrls;
        this.videoUrls = videoUrls;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescProject() {
        return descProject;
    }

    public void setDescProject(String descProject) {
        this.descProject = descProject;
    }

    public String getDescHistory() {
        return descHistory;
    }

    public void setDescHistory(String descHistory) {
        this.descHistory = descHistory;
    }

    public String getDescWorkDone() {
        return descWorkDone;
    }

    public void setDescWorkDone(String descWorkDone) {
        this.descWorkDone = descWorkDone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(Integer beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getFundingSource() {
        return fundingSource;
    }

    public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }

    public String getOtherFundingSource() {
        return otherFundingSource;
    }

    public void setOtherFundingSource(String otherFundingSource) {
        this.otherFundingSource = otherFundingSource;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public Boolean getPublicPortal() {
        return publicPortal;
    }

    public void setPublicPortal(Boolean publicPortal) {
        this.publicPortal = publicPortal;
    }

    public Boolean getFeatureOnHomepage() {
        return featureOnHomepage;
    }

    public void setFeatureOnHomepage(Boolean featureOnHomepage) {
        this.featureOnHomepage = featureOnHomepage;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<String> getVideoUrls() {
        return videoUrls;
    }

    public void setVideoUrls(List<String> videoUrls) {
        this.videoUrls = videoUrls;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static DevelopmentWorkBuilder builder() {
        return new DevelopmentWorkBuilder();
    }
    
    public static class DevelopmentWorkBuilder {
        private String id;
        private String title;
        private String sector;
        private String type;
        private String status;
        private String descProject;
        private String descHistory;
        private String descWorkDone;
        private String zilla;
        private String taluk;
        private String gp;
        private String village;
        private String address;
        private Double lat;
        private Double lng;
        private Integer beneficiaries;
        private Double budget;
        private String fundingSource;
        private String otherFundingSource;
        private String startDate;
        private String completionDate;
        private Boolean publicPortal;
        private Boolean featureOnHomepage;
        private List<String> photoUrls;
        private List<String> videoUrls;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public DevelopmentWorkBuilder id(String id) {
            this.id = id;
            return this;
        }
        public DevelopmentWorkBuilder title(String title) {
            this.title = title;
            return this;
        }
        public DevelopmentWorkBuilder sector(String sector) {
            this.sector = sector;
            return this;
        }
        public DevelopmentWorkBuilder type(String type) {
            this.type = type;
            return this;
        }
        public DevelopmentWorkBuilder status(String status) {
            this.status = status;
            return this;
        }
        public DevelopmentWorkBuilder descProject(String descProject) {
            this.descProject = descProject;
            return this;
        }
        public DevelopmentWorkBuilder descHistory(String descHistory) {
            this.descHistory = descHistory;
            return this;
        }
        public DevelopmentWorkBuilder descWorkDone(String descWorkDone) {
            this.descWorkDone = descWorkDone;
            return this;
        }
        public DevelopmentWorkBuilder zilla(String zilla) {
            this.zilla = zilla;
            return this;
        }
        public DevelopmentWorkBuilder taluk(String taluk) {
            this.taluk = taluk;
            return this;
        }
        public DevelopmentWorkBuilder gp(String gp) {
            this.gp = gp;
            return this;
        }
        public DevelopmentWorkBuilder village(String village) {
            this.village = village;
            return this;
        }
        public DevelopmentWorkBuilder address(String address) {
            this.address = address;
            return this;
        }
        public DevelopmentWorkBuilder lat(Double lat) {
            this.lat = lat;
            return this;
        }
        public DevelopmentWorkBuilder lng(Double lng) {
            this.lng = lng;
            return this;
        }
        public DevelopmentWorkBuilder beneficiaries(Integer beneficiaries) {
            this.beneficiaries = beneficiaries;
            return this;
        }
        public DevelopmentWorkBuilder budget(Double budget) {
            this.budget = budget;
            return this;
        }
        public DevelopmentWorkBuilder fundingSource(String fundingSource) {
            this.fundingSource = fundingSource;
            return this;
        }
        public DevelopmentWorkBuilder otherFundingSource(String otherFundingSource) {
            this.otherFundingSource = otherFundingSource;
            return this;
        }
        public DevelopmentWorkBuilder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public DevelopmentWorkBuilder completionDate(String completionDate) {
            this.completionDate = completionDate;
            return this;
        }
        public DevelopmentWorkBuilder publicPortal(Boolean publicPortal) {
            this.publicPortal = publicPortal;
            return this;
        }
        public DevelopmentWorkBuilder featureOnHomepage(Boolean featureOnHomepage) {
            this.featureOnHomepage = featureOnHomepage;
            return this;
        }
        public DevelopmentWorkBuilder photoUrls(List<String> photoUrls) {
            this.photoUrls = photoUrls;
            return this;
        }
        public DevelopmentWorkBuilder videoUrls(List<String> videoUrls) {
            this.videoUrls = videoUrls;
            return this;
        }
        public DevelopmentWorkBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public DevelopmentWorkBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public DevelopmentWork build() {
            DevelopmentWork instance = new DevelopmentWork();
            instance.setId(this.id);
            instance.setTitle(this.title);
            instance.setSector(this.sector);
            instance.setType(this.type);
            instance.setStatus(this.status);
            instance.setDescProject(this.descProject);
            instance.setDescHistory(this.descHistory);
            instance.setDescWorkDone(this.descWorkDone);
            instance.setZilla(this.zilla);
            instance.setTaluk(this.taluk);
            instance.setGp(this.gp);
            instance.setVillage(this.village);
            instance.setAddress(this.address);
            instance.setLat(this.lat);
            instance.setLng(this.lng);
            instance.setBeneficiaries(this.beneficiaries);
            instance.setBudget(this.budget);
            instance.setFundingSource(this.fundingSource);
            instance.setOtherFundingSource(this.otherFundingSource);
            instance.setStartDate(this.startDate);
            instance.setCompletionDate(this.completionDate);
            instance.setPublicPortal(this.publicPortal);
            instance.setFeatureOnHomepage(this.featureOnHomepage);
            instance.setPhotoUrls(this.photoUrls);
            instance.setVideoUrls(this.videoUrls);
            instance.setCreatedAt(this.createdAt);
            instance.setUpdatedAt(this.updatedAt);
            return instance;
        }
    }
}
