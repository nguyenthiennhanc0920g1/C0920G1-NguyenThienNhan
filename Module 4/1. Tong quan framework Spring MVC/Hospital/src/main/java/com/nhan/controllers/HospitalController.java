package com.nhan.controllers;

import com.nhan.services.IHoSoBenhAnService;
import com.nhan.services.models.HoSoBenhAnDTO;
import com.nhan.viewmodels.UpdateBenhAnViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HospitalController {
    @Autowired
    IHoSoBenhAnService hoSoBenhAnService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView hoSoBenhAnList() {
        List<HoSoBenhAnDTO> hoSoBenhAnDTOList = this.hoSoBenhAnService.getListHoSoBenhAnDTO();
        return new ModelAndView("list", "HoSoBenhAnList", hoSoBenhAnDTOList);
    }

    @RequestMapping(value = "/benhAnById/{maBenhNhan}", method = RequestMethod.GET)
    public ModelAndView hoSoBenhAn(@PathVariable String maBenhNhan) {
        HoSoBenhAnDTO hoSoBenhAnDTO = this.hoSoBenhAnService.getHoSoBenhAnDTO(maBenhNhan);
        return new ModelAndView("edit", "hoSoBenhAn", hoSoBenhAnDTO);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editHoSoBenhAn(UpdateBenhAnViewModel updateBenhAnViewModel) {
        this.hoSoBenhAnService.updateHoSoBenhAn(updateBenhAnViewModel.getMaBenhNhan(),
                updateBenhAnViewModel.getTenBenhNhan(),
                updateBenhAnViewModel.getNgayNhapVien(),
                updateBenhAnViewModel.getNgayXuatVien(),
                updateBenhAnViewModel.getLyDoNhapVien(),
                updateBenhAnViewModel.getPhuongPhapDieuTri(),
                updateBenhAnViewModel.getBacSiDieuTri());
        List<HoSoBenhAnDTO> hoSoBenhAnDTOList = this.hoSoBenhAnService.getListHoSoBenhAnDTO();
        return new ModelAndView("list", "HoSoBenhAnList", hoSoBenhAnDTOList);
    }

    @RequestMapping(value = "/delete/{maBenhNhan}", method = RequestMethod.GET)
    public ModelAndView deleteHoSoBenhAn(@PathVariable String maBenhNhan) {
        this.hoSoBenhAnService.deleteBenhAn(maBenhNhan);
        this.hoSoBenhAnService.deleteBenhNhan(maBenhNhan);
        List<HoSoBenhAnDTO> hoSoBenhAnDTOList = this.hoSoBenhAnService.getListHoSoBenhAnDTO();
        return new ModelAndView("list", "HoSoBenhAnList", hoSoBenhAnDTOList);
    }
}
