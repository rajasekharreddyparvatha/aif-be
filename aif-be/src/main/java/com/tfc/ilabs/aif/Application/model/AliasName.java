package com.tfc.ilabs.aif.Application.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajasekhar on 17-Dec-18.
 */
@Entity(name="alias_name")
public class AliasName {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String aliasName;

    @NotNull
    @ManyToOne
    @JoinColumn(name="app_id")
    private Application application;

    public AliasName() {
    }

    public AliasName(@NotNull String aliasName, @NotNull Application application) {
        this.aliasName = aliasName;
        this.application = application;
    }

    public AliasName(@NotNull String aliasName) {
        this.aliasName = aliasName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Application getApplications() {
        return application;
    }

    public void setApplications(Application applications) {
        this.application = applications;
    }
}
