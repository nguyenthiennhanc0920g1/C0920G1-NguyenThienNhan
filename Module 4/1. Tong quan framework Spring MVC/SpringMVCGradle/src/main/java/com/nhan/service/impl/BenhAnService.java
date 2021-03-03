package com.nhan.service.impl;

import com.nhan.repository.IbenhAnRepository;
import com.nhan.repository.models.BenhAnChiTietSdo;
import com.nhan.service.IBenhAnService;
import com.nhan.service.models.BenhAnChiTietDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class BenhAnService implements IBenhAnService {
    @Autowired
    IbenhAnRepository benhAnRepository;

    public List<BenhAnChiTietDto> getListBenhAnChiTiet() {
        List<BenhAnChiTietSdo> list = this.benhAnRepository.getListChiTietBenhAn();
        List<BenhAnChiTietDto> res = new ArrayList<>();
        for (BenhAnChiTietSdo sdo : list
        ) {
            BenhAnChiTietDto dto = new BenhAnChiTietDto(sdo.getMaBenhAn(), sdo.getMaBenhNhan(), sdo.getTenBenhNhan(), sdo.getNgayNhapVien().toString(), sdo.getNgayRaVien().toString(), sdo.getLyDoNhapVien(), sdo.getPhuongPhapDieuTri(), sdo.getBacSiDieuTri());
            res.add(dto);
        }
        return res;
    }
    public BenhAnChiTietDto getBenhAnChiTiet(String maBenhAn) {
        BenhAnChiTietSdo benhAnChiTietSdo = this.benhAnRepository.getChiTietBenhAn(maBenhAn);
        BenhAnChiTietDto res = new BenhAnChiTietDto(benhAnChiTietSdo.getMaBenhAn(), benhAnChiTietSdo.getMaBenhAn(),benhAnChiTietSdo.getTenBenhNhan(),benhAnChiTietSdo.getNgayNhapVien().toString(),benhAnChiTietSdo.getNgayRaVien().toString(),benhAnChiTietSdo.getLyDoNhapVien(),benhAnChiTietSdo.getPhuongPhapDieuTri(),benhAnChiTietSdo.getBacSiDieuTri());
        return res;
    }

    public void updateBenhAnChiTiet(String maBenhAn, String bacis) {
       this.benhAnRepository.updateBenhAnChiTiet(maBenhAn, bacis);
    }
}
