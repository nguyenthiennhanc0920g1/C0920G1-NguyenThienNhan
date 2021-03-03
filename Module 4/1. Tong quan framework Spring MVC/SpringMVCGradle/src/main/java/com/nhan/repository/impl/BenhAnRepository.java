package com.nhan.repository.impl;

import com.nhan.repository.IbenhAnRepository;
import com.nhan.repository.models.BenhAnChiTietSdo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Primary
public class BenhAnRepository extends BaseRepository implements IbenhAnRepository {
    private static final String SELECT_ALL_BENH_AN = "select * from benh_nhan inner join benh_an on benh_nhan.ma_benh_nhan = benh_an.ma_benh_nhan;";
    private static final String SELECT_BENH_AN_BY_ID = "select ba.*, bn.ten_benh_nhan from benh_nhan as bn inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan where ma_benh_an = ?";
    private static final String UPDATE_BENH_AN = "UPDATE benh_an SET bac_si_dieu_tri = ? WHERE ma_benh_an = ?;";

    public List<BenhAnChiTietSdo> getListChiTietBenhAn() {
        Connection connect = this.getConnection();
        List<BenhAnChiTietSdo> benhAnChiTietSdoList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connect.prepareCall(SELECT_ALL_BENH_AN);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String maBenhAn = rs.getString("ma_benh_an");
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                Date ngayNhapVien = rs.getDate("ngay_nhap_vien");
                Date ngayRaVien = rs.getDate("ngay_ra_vien");
                String lyDoNhapVien = rs.getString("ly_do_nhap_vien");
                String phuongPhapDieuTri = rs.getString("phuong_phap_dieu_tri");
                String bacSiDieuTri = rs.getString("bac_si_dieu_tri");
                benhAnChiTietSdoList.add(new BenhAnChiTietSdo(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phuongPhapDieuTri, bacSiDieuTri));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return benhAnChiTietSdoList;
    }

    public BenhAnChiTietSdo getChiTietBenhAn(String maBenhAnInput) {
        Connection connect = this.getConnection();
        BenhAnChiTietSdo benhAnChiTietSdo = new BenhAnChiTietSdo();
        try {
            PreparedStatement preparedStatement = connect.prepareCall(SELECT_BENH_AN_BY_ID);
            preparedStatement.setString(1, maBenhAnInput);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String maBenhAn = rs.getString("ma_benh_an");
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                Date ngayNhapVien = rs.getDate("ngay_nhap_vien");
                Date ngayRaVien = rs.getDate("ngay_ra_vien");
                String lyDoNhapVien = rs.getString("ly_do_nhap_vien");
                String phuongPhapDieuTri = rs.getString("phuong_phap_dieu_tri");
                String bacSiDieuTri = rs.getString("bac_si_dieu_tri");
                benhAnChiTietSdo = new BenhAnChiTietSdo(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phuongPhapDieuTri, bacSiDieuTri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return benhAnChiTietSdo;
    }

    public void updateBenhAnChiTiet(String maBenhAn, String bacis){
        Connection connect = this.getConnection();
        BenhAnChiTietSdo benhAnChiTietSdo = new BenhAnChiTietSdo();
        try {
            PreparedStatement preparedStatement = connect.prepareCall(UPDATE_BENH_AN);
            preparedStatement.setString(1, bacis);
            preparedStatement.setString(2, maBenhAn);
           preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
    }
}
