package test_ending_module_2.information;

public class NoLimitSavingBook extends SavingBook {
    public NoLimitSavingBook() {
    }

    public NoLimitSavingBook(String maSotietKiem, String maKhachHang, String ngayMoSo, String ngayBatDauGui,
                             double soTienGui, double laiSuat) {
        super(maSotietKiem, maKhachHang, ngayMoSo, ngayBatDauGui, soTienGui, laiSuat);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
