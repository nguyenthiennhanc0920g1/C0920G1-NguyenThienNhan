package Homeword;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void rutGonPs() {
        int a = Math.abs(this.tuSo);
        int b = Math.abs(this.mauSo);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        this.tuSo = this.tuSo / a;
        this.mauSo = this.mauSo / b;
    }

    public PhanSo congPs(PhanSo b) {
        this.tuSo = this.tuSo * b.mauSo + this.mauSo * b.tuSo;
        this.mauSo = this.mauSo * b.mauSo;
        this.rutGonPs();
        return this;
    }

    public static void sortPhanSo(PhanSo[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getValue() > arr[j].getValue()) {
                    PhanSo temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public double getValue() {
        return (double) this.tuSo / this.mauSo;
    }

    public String toString() {
        return this.tuSo + "/" + this.mauSo;
    }
}
