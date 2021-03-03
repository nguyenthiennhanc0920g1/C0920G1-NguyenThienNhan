package Homeword;

public class HonSo extends PhanSo {
    private int phanNguyen;

    public HonSo() {
    }

    public HonSo(int phanNguyen) {
        this.phanNguyen = phanNguyen;
    }

    public HonSo(int tuSo, int mauSo, int phanNguyen) {
        super(tuSo, mauSo);
        this.phanNguyen = phanNguyen;
    }

    public int getPhanNguyen() {
        return phanNguyen;
    }

    public void setPhanNguyen(int phanNguyen) {
        this.phanNguyen = phanNguyen;
    }

    @Override
    public double getValue() {
        return (double) this.phanNguyen + super.getValue();
    }

    @Override
    public String toString() {
        return this.phanNguyen + "+" + super.toString();
    }
}
