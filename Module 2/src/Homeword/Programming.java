package Homeword;

import java.util.Arrays;

public class Programming {
    public static void main(String[] args) {
//        PhanSo ps1 = new PhanSo(8,6);
//        PhanSo ps2 = new PhanSo(8,3);
//        System.out.println("Phan so 1 = " + ps1.rutGonPs());
//        System.out.println("Phan so 2 = " + ps2.rutGonPs());
//
//        System.out.println(ps1.changePsToDouble());
//        System.out.println(ps2.changePsToDouble());
//
//        System.out.println("Tong 2 phan so = " + ps1.congPs(ps2));

        PhanSo[] arr = {
                new PhanSo(3, 3),
                new PhanSo(2, 3),
                new PhanSo(1, 3),
                new PhanSo(5, 3),
                new PhanSo(4, 3),
        };
        PhanSo.sortPhanSo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
