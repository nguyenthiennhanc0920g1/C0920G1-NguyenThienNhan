package com.nhan.services;

import com.nhan.repositories.models.HoSoBenhAnEDM;
import com.nhan.services.models.HoSoBenhAnDTO;

import java.util.List;

public interface IHoSoBenhAnService {
    List<HoSoBenhAnDTO> getListHoSoBenhAnDTO();

    HoSoBenhAnDTO getHoSoBenhAnDTO(String id);

    void updateHoSoBenhAn(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayXuatVien,
                          String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri);

    void deleteBenhAn(String maBenhNhan);

    void deleteBenhNhan(String maBenhNhan);
}
