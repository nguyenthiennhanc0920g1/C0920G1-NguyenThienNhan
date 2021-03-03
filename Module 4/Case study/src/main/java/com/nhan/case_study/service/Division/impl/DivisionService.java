package com.nhan.case_study.service.Division.impl;

import com.nhan.case_study.model.Division;
import com.nhan.case_study.repository.division.IDivisionRepository;
import com.nhan.case_study.service.Division.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    IDivisionRepository iDivisionRepository;
    @Override
    public List<Division> findAll() {
        return iDivisionRepository.findAll();
    }
}
