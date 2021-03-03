package DAO.connection;

import model.BenhAn;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BenhAnDAO {
    private static final String SELECT_BENHAN_BY_ID = "SELECT * FROM benh_nhan JOIN benh_an ON benh_nhan.ma_benh_an = benh_an.ma_benh_an" +
            " where benh_an.ma_benh_an = ?";
    private static final String SELECT_ALL_BENHAN = "SELECT * FROM benh_nhan JOIN benh_an ON benh_nhan.ma_benh_an = benh_an.ma_benh_an";
    private static final String DELETE_BENHAN_SQL = "delete from benh_an where benh_an.ma_benh_an = ?;";
    private static final String UPDATE_BENHAN_SQL = "update benh_an set ngay_nhap_vien = ?," +
            "ngay_ra_vien= ?, ly_do_nhap_vien =?,phuong_phap_dieu_tri = ?, bac_si_dieu_tri = ? where benh_an.ma_benh_an = ?;";

    public BenhAnDAO() {
    }

    public static List<BenhAn> selectAllBenhAn() {
        List<BenhAn> arrayListBenhAn = new ArrayList<>();
        try {
            Connection connection = DBconnection.getConnection();
            CallableStatement preparedStatement = connection.prepareCall(SELECT_ALL_BENHAN);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String maBenhAn = rs.getString("ma_benh_an");
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                String ngayNhapVien = rs.getString("ngay_nhap_vien");
                String ngayRaVien = rs.getString("ngay_ra_vien");
                String lyDoNhapVien = rs.getString("ly_do_nhap_vien");
                String phuongPhapDieuTri = rs.getString("phuong_phap_dieu_tri");
                String bacSiDieuTri = rs.getString("bac_si_dieu_tri");
                arrayListBenhAn.add(new BenhAn(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phuongPhapDieuTri, bacSiDieuTri));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayListBenhAn;
    }

    public boolean deleteBenhAn(String id) throws SQLException {
        boolean rowDeleted = false;
        try {
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_BENHAN_SQL);
            statement.setString(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    public BenhAn getBenhAnById(String id) {
        BenhAn benhAn = null;
        try {
            Connection connection = DBconnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareCall(SELECT_BENHAN_BY_ID);
            preparedStatement.setString(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String maBenhAn = rs.getString("maBenhAn");
                String maBenhNhan = rs.getString("maBenhNhan");
                String tenBenhNhan = rs.getString("tenBenhNhan");
                String ngayNhapVien = rs.getString("ngayNhapVien");
                String ngayRaVien = rs.getString("ngayRaVien");
                String lyDoNhapVien = rs.getString("lyDoNhapVien");
                String phuongPhapDieuTri = rs.getString("phuongPhapDieuTri");
                String bacSiDieuTri = rs.getString("bacSiDieuTri");
                benhAn = new BenhAn(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phuongPhapDieuTri, bacSiDieuTri);
            }
        } catch (SQLException e) {
        }
        return benhAn;
    }

}
