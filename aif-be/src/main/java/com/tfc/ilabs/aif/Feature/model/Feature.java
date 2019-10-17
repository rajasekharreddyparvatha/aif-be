package com.tfc.ilabs.aif.Feature.model;

import com.tfc.ilabs.aif.Application.model.Application;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by rajasekhar on 17-Dec-18.
 */
@Entity(name="feature")
public class Feature {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String label;

    @NotNull
    private String url;

    @ManyToOne
    @JoinColumn(name="app_id")
    private Application application;

    @NotNull
    @Column(unique = true , updatable = false)
    private String featureId;

    @NotNull
    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private List<Param> params;

    @NotNull
    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private  List<Keyword> keywords;

    @NotNull
    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private  List<Action> actions;

    @NotNull
    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private  List<ActionsExecutionFlow> actionsExecutionFlow;

    public Feature() {
    }

    public Feature(@NotNull String label, @NotNull String url, Application application, @NotNull String featureId, @NotNull List<Param> params, @NotNull List<Keyword> keywords, @NotNull List<Action> actions, @NotNull List<ActionsExecutionFlow> actionsExecutionFlow) {
        this.label = label;
        this.url = url;
        this.application = application;
        this.featureId = featureId;
        this.params = params;
        this.keywords = keywords;
        this.actions = actions;
        this.actionsExecutionFlow = actionsExecutionFlow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public List<Param> getParams() {
        return params;
    }

    public void setParams(List<Param> params) {
        this.params = params;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<ActionsExecutionFlow> getActionsExecutionFlow() {
        return actionsExecutionFlow;
    }

    public void setActionsExecutionFlow(List<ActionsExecutionFlow> actionsExecutionFlow) {
        this.actionsExecutionFlow = actionsExecutionFlow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feature)) return false;

        Feature feature = (Feature) o;

        return getFeatureId().equals(feature.getFeatureId());
    }

    @Override
    public int hashCode() {
        return getFeatureId().hashCode();
    }
}
