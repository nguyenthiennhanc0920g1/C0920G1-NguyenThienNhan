package com.nhan.repository;

import com.nhan.repository.models.BenhAnChiTietSdo;

import java.util.List;

public interface IbenhAnRepository {
    List<BenhAnChiTietSdo> getListChiTietBenhAn();
    BenhAnChiTietSdo getChiTietBenhAn(String maBenhAn);
    void updateBenhAnChiTiet(String maBenhAn, String bacis);
}
