package com.tfc.ilabs.aif.Application.repository;

import com.tfc.ilabs.aif.Application.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajasekhar on 20-Dec-18.
 */
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
