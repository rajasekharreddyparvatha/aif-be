package com.tfc.ilabs.aif.Application.service.api;

import com.tfc.ilabs.aif.Application.model.Application;
import com.tfc.ilabs.aif.Application.model.ApplicationDTO;

import java.util.List;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
public interface ApplicationService {

    ApplicationDTO get(String appId);

    List<ApplicationDTO> get();

    String add(ApplicationDTO applicationDTO);

    String update(ApplicationDTO applicationDTO);

    String delete(String appId);
}
