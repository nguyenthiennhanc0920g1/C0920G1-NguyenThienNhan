package test_ending_module_2.information;

import test_ending_module_2.manager.ManagerCustomer;
import utilites_regex_exception_read_write_file.check_input_output.CheckInStringData;

public class Customer {
    private int maKhachHang;
    private String tenKhachHang;
    private String ngaySinh;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;
    private static int count = 1;

    public Customer() {
    }

    public Customer(int maKhachHang, String tenKhachHang, String ngaySinh, String gioiTinh, String soDienThoai, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getCount() {
        return count++;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "" + maKhachHang + ',' + tenKhachHang + ',' + ngaySinh + ','
                + gioiTinh + ',' + soDienThoai + ',' + diaChi;
    }
}
