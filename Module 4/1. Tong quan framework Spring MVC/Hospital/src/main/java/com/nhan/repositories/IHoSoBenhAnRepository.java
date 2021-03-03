package com.nhan.repositories;

import com.nhan.repositories.models.HoSoBenhAnEDM;

import java.util.List;
import java.util.SplittableRandom;

public interface IHoSoBenhAnRepository {
    List<HoSoBenhAnEDM> getListHoSoBenhAnEDM();

    HoSoBenhAnEDM getHoSoBenhAnByID(String id);

    void updateHoSoBenhAn(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayXuatVien,
                          String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri);

    void deleteBenhAn(String maBenhNhan);

    void deleteBenhNhan(String maBenhNhan);
}