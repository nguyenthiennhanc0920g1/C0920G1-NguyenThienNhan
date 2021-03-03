package com.nhan.services.models;

import java.util.Date;

public class HoSoBenhAnDTO {
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenhNhan;
    private Date ngayNhapVien;
    private Date ngayXuatVien;
    private String lyDoNhapVien;
    private String phuongPhapDieuTri;
    private String bacSiDieuTri;

    public HoSoBenhAnDTO() {
    }

    public HoSoBenhAnDTO(String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien,
                         Date ngayXuatVien, String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayXuatVien = ngayXuatVien;
        this.lyDoNhapVien = lyDoNhapVien;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.bacSiDieuTri = bacSiDieuTri;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public Date getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(Date ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public Date getNgayXuatVien() {
        return ngayXuatVien;
    }

    public void setNgayXuatVien(Date ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String getPhuongPhapDieuTri() {
        return phuongPhapDieuTri;
    }

    public void setPhuongPhapDieuTri(String phuongPhapDieuTri) {
        this.phuongPhapDieuTri = phuongPhapDieuTri;
    }

    public String getBacSiDieuTri() {
        return bacSiDieuTri;
    }

    public void setBacSiDieuTri(String bacSiDieuTri) {
        this.bacSiDieuTri = bacSiDieuTri;
    }
}
