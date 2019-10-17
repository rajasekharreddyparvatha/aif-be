package com.tfc.ilabs.aif.Application.model;

import com.tfc.ilabs.aif.Feature.model.Feature;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajasekhar on 17-Dec-18.
 */

@Entity(name="application")
public class Application {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(unique = true , updatable = false)
    private String appId;

    @NotNull
    private String appTitle;

    @NotNull
    private String domain;

    @NotNull
    private String   baseURL;


    @NotNull
    private String adminName;

    @NotNull
    private String adminMail;

    @NotNull
    private String homePageURL;

    @NotNull
    @OneToMany(mappedBy="application", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    List<AliasName> aliasNames ;

    @OneToMany(mappedBy="application", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    List<Feature> features ;

    public Application() {
    }

    public Application(@NotNull String appId, @NotNull String appTitle, @NotNull String domain, @NotNull String baseURL, @NotNull String adminName, @NotNull String adminMail, @NotNull String homePageURL, @NotNull List<AliasName> aliasNames, @NotNull List<Feature> features) {
        this.appId = appId;
        this.appTitle = appTitle;
        this.domain = domain;
        this.baseURL = baseURL;
        this.adminName = adminName;
        this.adminMail = adminMail;
        this.homePageURL = homePageURL;
        this.aliasNames = aliasNames;
        this.features = features;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminMail() {
        return adminMail;
    }

    public void setAdminMail(String adminMail) {
        this.adminMail = adminMail;
    }

    public String getHomePageURL() {
        return homePageURL;
    }

    public void setHomePageURL(String homePageURL) {
        this.homePageURL = homePageURL;
    }

    public List<AliasName> getAliasNames() {
        return aliasNames;
    }

    public void setAliasNames(List<AliasName> aliasNames) {
        this.aliasNames = aliasNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Application)) return false;

        Application that = (Application) o;

        return getAppId().equals(that.getAppId());
    }

    @Override
    public int hashCode() {
        return getAppId().hashCode();
    }
}
