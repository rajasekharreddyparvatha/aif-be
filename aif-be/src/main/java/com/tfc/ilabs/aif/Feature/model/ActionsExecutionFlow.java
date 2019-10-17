package com.tfc.ilabs.aif.Feature.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
@Entity(name = "feature_actions_execution_flow")
public class ActionsExecutionFlow {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer orderNum;

    @NotNull
    private String actionName;

    @NotNull
    @ManyToOne
    @JoinColumn(name="feature_id")
    private Feature feature;

    public ActionsExecutionFlow() {
    }

    public ActionsExecutionFlow(@NotNull Integer orderNum, @NotNull String actionName, @NotNull Feature feature) {
        this.orderNum = orderNum;
        this.actionName = actionName;
        this.feature = feature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
