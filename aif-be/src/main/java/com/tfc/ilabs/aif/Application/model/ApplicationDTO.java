package com.tfc.ilabs.aif.Application.model;

import com.tfc.ilabs.aif.Feature.model.FeatureDTO;

import java.util.List;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
public class ApplicationDTO {

    private String appId;

    private String appTitle;

    private String domain;

    private String   baseURL;

    private String adminName;

    private String adminMail;

    private String homePageURL;

    List<String> aliasNames ;

    List<FeatureDTO> features;

    public ApplicationDTO(){

    }

    public ApplicationDTO(String appId, String appTitle, String domain, String baseURL, String adminName, String adminMail, String homePageURL, List<String> aliasNames, List<FeatureDTO> features) {
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

    public List<String> getAliasNames() {
        return aliasNames;
    }

    public void setAliasNames(List<String> aliasNames) {
        this.aliasNames = aliasNames;
    }

    public List<FeatureDTO> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureDTO> features) {
        this.features = features;
    }
}
