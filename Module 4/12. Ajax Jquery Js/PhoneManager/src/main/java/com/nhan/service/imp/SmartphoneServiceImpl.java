package com.nhan.service.imp;

import com.nhan.model.Smartphone;
import com.nhan.repository.SmartphoneRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class SmartphoneServiceImpl {
    @Autowired
    private SmartphoneRepo smartphoneRepo;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepo.findAll();
    }

    @Override
    public Smartphone findById(Integer id) {
        Smartphone smartphone = smartphoneRepo.findOne(id);
        if(smartphone == null){
            return null;
        }
        return smartphone;
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return smartphoneRepo.save(phone);
    }

    @Override
    public Smartphone remove(Integer id) {
        Smartphone smartphone = findById(id);
        smartphoneRepo.delete(id);
        return smartphone;
    }
}
