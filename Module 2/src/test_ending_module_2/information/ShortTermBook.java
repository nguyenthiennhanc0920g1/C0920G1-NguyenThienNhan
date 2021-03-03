package test_ending_module_2.information;


public class ShortTermBook extends LimitSavingBook {
    public ShortTermBook() {
    }

    public ShortTermBook(String maSotietKiem, String maKhachHang, String ngayMoSo, String ngayBatDauGui,
                         double soTienGui, double laiSuat, String kyHan) {
        super(maSotietKiem, maKhachHang, ngayMoSo, ngayBatDauGui, soTienGui, laiSuat, kyHan);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
