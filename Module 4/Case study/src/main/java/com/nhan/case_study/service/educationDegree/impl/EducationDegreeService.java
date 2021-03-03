package com.nhan.case_study.service.educationDegree.impl;

import com.nhan.case_study.model.EducationDegree;
import com.nhan.case_study.repository.educationDegree.IEducationDegreeRepository;
import com.nhan.case_study.service.educationDegree.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    IEducationDegreeRepository iEducationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return iEducationDegreeRepository.findAll();
    }
}
