package com.tfc.ilabs.aif.Feature.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
@Entity(name ="feature_keyword")
public class Keyword {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String keyword;

    @NotNull
    @ManyToOne
    @JoinColumn(name="feature_id")
    private Feature feature;

    public Keyword() {
    }

    public Keyword(@NotNull String keyword, @NotNull Feature feature) {
        this.keyword = keyword;
        this.feature = feature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
