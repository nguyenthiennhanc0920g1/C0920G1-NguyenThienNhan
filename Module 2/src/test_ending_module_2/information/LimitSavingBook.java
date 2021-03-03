package test_ending_module_2.information;

public class LimitSavingBook extends SavingBook {
    private String kyHan;

    public LimitSavingBook() {
    }

    public LimitSavingBook(String maSotietKiem, String maKhachHang, String ngayMoSo, String ngayBatDauGui,
                           double soTienGui, double laiSuat, String kyHan) {
        super(maSotietKiem, maKhachHang, ngayMoSo, ngayBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + kyHan;
    }
}
