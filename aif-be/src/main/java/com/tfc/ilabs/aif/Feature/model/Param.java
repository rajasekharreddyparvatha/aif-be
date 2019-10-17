package com.tfc.ilabs.aif.Feature.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by rajasekhar on 19-Dec-18.
 */

@Entity(name="feature_param")
public class Param {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String paramName;

    @NotNull
    private  String paramValue;

    @NotNull
    @ManyToOne
    @JoinColumn(name="feature_id")
    private Feature feature;

    public Param() {
    }

    public Param(@NotNull String paramName, @NotNull String paramValue, @NotNull Feature feature) {
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.feature = feature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
