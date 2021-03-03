package test_ending_module_2.information;

public abstract class SavingBook {
    private String maSotietKiem;
    private String maKhachHang;
    private String ngayMoSo;
    private String ngayBatDauGui;
    private double soTienGui;
    private double laiSuat;

    public SavingBook() {
    }

    public SavingBook(String maSotietKiem, String maKhachHang, String ngayMoSo, String ngayBatDauGui,
                      double soTienGui, double laiSuat) {
        this.maSotietKiem = maSotietKiem;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.ngayBatDauGui = ngayBatDauGui;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public String getMaSotietKiem() {
        return maSotietKiem;
    }

    public void setMaSotietKiem(String maSotietKiem) {
        this.maSotietKiem = maSotietKiem;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getNgayBatDauGui() {
        return ngayBatDauGui;
    }

    public void setNgayBatDauGui(String ngayBatDauGui) {
        this.ngayBatDauGui = ngayBatDauGui;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public String toString() {
        return "" + maSotietKiem + ',' + maKhachHang + ',' + ngayMoSo + ','
                + ngayBatDauGui + ',' + soTienGui + ',' + laiSuat;
    }
}
