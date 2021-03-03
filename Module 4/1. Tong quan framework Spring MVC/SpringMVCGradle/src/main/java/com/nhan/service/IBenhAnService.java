package com.nhan.service;

import com.nhan.service.models.BenhAnChiTietDto;

import java.util.List;

public interface IBenhAnService {
    List<BenhAnChiTietDto> getListBenhAnChiTiet();
    BenhAnChiTietDto getBenhAnChiTiet(String maBenhAn);
    void updateBenhAnChiTiet(String maBenhAn, String bacis);
}
