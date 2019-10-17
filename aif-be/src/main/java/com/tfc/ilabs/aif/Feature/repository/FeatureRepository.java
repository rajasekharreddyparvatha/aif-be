package com.tfc.ilabs.aif.Feature.repository;

import com.tfc.ilabs.aif.Feature.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajasekhar on 20-Dec-18.
 */
public interface FeatureRepository extends JpaRepository<Feature, Integer> {
}
