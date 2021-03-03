package com.nhan.repositories.Implement;

import com.nhan.repositories.IHoSoBenhAnRepository;
import com.nhan.repositories.models.HoSoBenhAnEDM;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class HoSoBenhAnRepository extends DBConnection implements IHoSoBenhAnRepository {
    private static final String SELECT_ALL_HOSOBENHAN = "select ba.*, bn.ten_benh_nhan from benh_nhan as bn" +
            " inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan;";
    private static final String SELECT_HOSOBENHAN = "select ba.*, bn.ten_benh_nhan from benh_nhan as bn" +
            " inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan where bn.ma_benh_nhan = ?;";
    private static final String UPDATE_HOSOBENHAN = "update benh_nhan as bn, benh_an as ba set bn.ten_benh_nhan = ?," +
            " ba.ngay_nhap_vien = ?, ba.ngay_xuat_vien = ?, ba.ly_do_nhap_vien = ?, ba.phuong_phap_dieu_tri = ?," +
            " ba.bac_si_dieu_tri = ? where ba.ma_benh_nhan = bn.ma_benh_nhan and bn.ma_benh_nhan = ?;";
    private static final String DELETE_BENHAN = "DELETE from benh_an where ma_benh_nhan = ?;";
    private static final String DELETE_BENHNHAN = "DELETE from benh_nhan where ma_benh_nhan = ?;";

    @Override
    public List<HoSoBenhAnEDM> getListHoSoBenhAnEDM() {
        Connection connection = this.getConnection();
        List<HoSoBenhAnEDM> hoSoBenhAnEDMList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(SELECT_ALL_HOSOBENHAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_nhan");
                Date ngayNhapVien = resultSet.getDate("ngay_nhap_vien");
                Date ngayXuatVien = resultSet.getDate("ngay_xuat_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                String phuongPhapDieuTri = resultSet.getString("phuong_phap_dieu_tri");
                String bacSiDieuTri = resultSet.getString("bac_si_dieu_tri");
                HoSoBenhAnEDM hoSoBenhAnEDM = new HoSoBenhAnEDM(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien,
                        ngayXuatVien, lyDoNhapVien, phuongPhapDieuTri, bacSiDieuTri);
                hoSoBenhAnEDMList.add(hoSoBenhAnEDM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return hoSoBenhAnEDMList;
    }

    @Override
    public HoSoBenhAnEDM getHoSoBenhAnByID(String id) {
        Connection connection = this.getConnection();
        HoSoBenhAnEDM hoSoBenhAnEDM = new HoSoBenhAnEDM();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(SELECT_HOSOBENHAN);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_nhan");
                Date ngayNhapVien = resultSet.getDate("ngay_nhap_vien");
                Date ngayXuatVien = resultSet.getDate("ngay_xuat_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                String phuongPhapDieuTri = resultSet.getString("phuong_phap_dieu_tri");
                String bacSiDieuTri = resultSet.getString("bac_si_dieu_tri");
                hoSoBenhAnEDM = new HoSoBenhAnEDM(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien,
                        ngayXuatVien, lyDoNhapVien, phuongPhapDieuTri, bacSiDieuTri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return hoSoBenhAnEDM;
    }

    @Override
    public void updateHoSoBenhAn(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayXuatVien,
                                 String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri) {
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(UPDATE_HOSOBENHAN);
            preparedStatement.setString(1, tenBenhNhan);
            preparedStatement.setString(2, ngayNhapVien);
            preparedStatement.setString(3, ngayXuatVien);
            preparedStatement.setString(4, lyDoNhapVien);
            preparedStatement.setString(5, phuongPhapDieuTri);
            preparedStatement.setString(6, bacSiDieuTri);
            preparedStatement.setString(7, maBenhNhan);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
    }

    @Override
    public void deleteBenhAn(String maBenhNhan) {
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(DELETE_BENHAN);
            preparedStatement.setString(1, maBenhNhan);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
    }

    @Override
    public void deleteBenhNhan(String maBenhNhan) {
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(DELETE_BENHNHAN);
            preparedStatement.setString(1, maBenhNhan);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
    }
}
