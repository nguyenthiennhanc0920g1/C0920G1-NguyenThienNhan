package com.nhan.case_study.service.Position.impl;

import com.nhan.case_study.model.Position;
import com.nhan.case_study.repository.Position.IPositionRepository;
import com.nhan.case_study.service.Position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionRepository iPositionRepository;
    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }
}
