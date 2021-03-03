package com.nhan.services.Implement;

import com.nhan.repositories.IHoSoBenhAnRepository;
import com.nhan.repositories.models.HoSoBenhAnEDM;
import com.nhan.services.IHoSoBenhAnService;
import com.nhan.services.models.HoSoBenhAnDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoSoBenhAnService implements IHoSoBenhAnService {
    @Autowired
    IHoSoBenhAnRepository hoSoBenhAnRepository;

    @Override
    public List<HoSoBenhAnDTO> getListHoSoBenhAnDTO() {
        List<HoSoBenhAnEDM> hoSoBenhAnEDMList = this.hoSoBenhAnRepository.getListHoSoBenhAnEDM();
        List<HoSoBenhAnDTO> hoSoBenhAnDTOList = new ArrayList<>();
        for (HoSoBenhAnEDM edm : hoSoBenhAnEDMList) {
            HoSoBenhAnDTO dto = new HoSoBenhAnDTO(edm.getMaBenhAn(), edm.getMaBenhNhan(), edm.getTenBenhNhan(),
                    edm.getNgayNhapVien(), edm.getNgayXuatVien(), edm.getLyDoNhapVien(), edm.getPhuongPhapDieuTri(),
                    edm.getBacSiDieuTri());
            hoSoBenhAnDTOList.add(dto);
        }
        return hoSoBenhAnDTOList;
    }

    @Override
    public HoSoBenhAnDTO getHoSoBenhAnDTO(String id) {
        HoSoBenhAnEDM hoSoBenhAnEDM = this.hoSoBenhAnRepository.getHoSoBenhAnByID(id);
        return new HoSoBenhAnDTO(hoSoBenhAnEDM.getMaBenhAn(), hoSoBenhAnEDM.getMaBenhNhan(),
                hoSoBenhAnEDM.getTenBenhNhan(), hoSoBenhAnEDM.getNgayNhapVien(), hoSoBenhAnEDM.getNgayXuatVien(),
                hoSoBenhAnEDM.getLyDoNhapVien(), hoSoBenhAnEDM.getPhuongPhapDieuTri(), hoSoBenhAnEDM.getBacSiDieuTri());
    }

    @Override
    public void updateHoSoBenhAn(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayXuatVien,
                                 String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri) {
        this.hoSoBenhAnRepository.updateHoSoBenhAn(maBenhNhan, tenBenhNhan, ngayNhapVien, ngayXuatVien, lyDoNhapVien,
                phuongPhapDieuTri, bacSiDieuTri);
    }

    @Override
    public void deleteBenhAn(String maBenhNhan) {
        this.hoSoBenhAnRepository.deleteBenhAn(maBenhNhan);
    }

    @Override
    public void deleteBenhNhan(String maBenhNhan) {
        this.hoSoBenhAnRepository.deleteBenhNhan(maBenhNhan);
    }
}
