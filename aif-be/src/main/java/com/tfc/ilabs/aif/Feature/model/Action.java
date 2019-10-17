package com.tfc.ilabs.aif.Feature.model;

import com.tfc.ilabs.aif.Application.model.Application;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Blob;

/**
 * Created by rajasekhar on 19-Dec-18.
 */

@Entity(name="feature_action")
public class Action {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String actionName;


    @NotNull
    private String actionType;

    @Lob
    @Column(columnDefinition="BLOB")
    private Blob action;

    @NotNull
    @ManyToOne
    @JoinColumn(name="feature_id")
    private Feature feature;

    public Action() {
    }

    public Action(@NotNull String actionName, @NotNull String actionType, Blob action, @NotNull Feature feature) {
        this.actionName = actionName;
        this.actionType = actionType;
        this.action = action;
        this.feature = feature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Blob getAction() {
        return action;
    }

    public void setAction(Blob action) {
        this.action = action;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
