package test_ending_module_2.information;


public class LongTermBook extends LimitSavingBook {
    private String uuDai;

    public LongTermBook() {
    }

    public LongTermBook(String maSotietKiem, String maKhachHang, String ngayMoSo, String ngayBatDauGui,
                        double soTienGui, double laiSuat, String kyHan, String uuDai) {
        super(maSotietKiem, maKhachHang, ngayMoSo, ngayBatDauGui, soTienGui, laiSuat, kyHan);
        this.uuDai = uuDai;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + uuDai;
    }
}
