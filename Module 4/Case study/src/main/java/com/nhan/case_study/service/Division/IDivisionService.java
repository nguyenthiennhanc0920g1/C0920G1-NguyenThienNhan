package com.nhan.case_study.service.Division;

import com.nhan.case_study.model.Division;
import com.nhan.case_study.service.customer.model.CustomerDTO;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();
}
