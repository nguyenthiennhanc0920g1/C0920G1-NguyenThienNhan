package com.nhan.service;

import com.nhan.model.Smartphone;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();
    Smartphone findById(Integer id);
    Smartphone save(Smartphone phone);
    Smartphone remove(Integer id);
}
