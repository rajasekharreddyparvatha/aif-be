package com.tfc.ilabs.aif.Application.service.impl;

import com.tfc.ilabs.aif.Application.model.Application;
import com.tfc.ilabs.aif.Application.model.ApplicationDTO;
import com.tfc.ilabs.aif.Application.repository.ApplicationRepository;
import com.tfc.ilabs.aif.Application.service.api.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
@Transactional
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;
    public ApplicationServiceImpl(){}


    @Override
    public ApplicationDTO get(String appId) {
        return null;
    }

    @Override
    public List<ApplicationDTO> get() {
        return ObjectConverter.toApplicationDTO(applicationRepository.findAll());
    }

    @Override
    public String add(ApplicationDTO applicationDTO) {
        if(ApplicationDTOValidator.isValid(applicationDTO)){
            Application application = ObjectConverter.toApplication(applicationDTO);
            applicationRepository.save(application);
        }
        return null;
    }

    @Override
    public String update(ApplicationDTO applicationDTO) {
        return null;
    }

    @Override
    public String delete(String appId) {
        return null;
    }
}
