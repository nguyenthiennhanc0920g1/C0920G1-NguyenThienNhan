package com.nhan.repository.models;

import java.util.Date;

public class BenhAnChiTietSdo {
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenhNhan;
    private Date ngayNhapVien;
    private Date ngayRaVien;
    private String lyDoNhapVien;
    private String phuongPhapDieuTri;
    private String bacSiDieuTri;

    public BenhAnChiTietSdo() {
    }

    public BenhAnChiTietSdo(String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.bacSiDieuTri = bacSiDieuTri;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public Date getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(Date ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public Date getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(Date ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
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

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }
}
