package Homeword;

import java.util.Arrays;

public class ProgrammingHonSo {
    public static void main(String[] args) {
//        HonSo hs1 = new HonSo(6,8,3);
//        System.out.println(hs1.rutGonPs());
//        System.out.println(hs1.getValue());
        PhanSo[] arr = {
                new PhanSo(1, 3),
                new PhanSo(2, 7),
                new PhanSo(100, 11),
                new HonSo(1, 2, 3),
                new HonSo(2, 1, 3),
                new HonSo(1, 8, 2),
                new HonSo(1, 9, 2)
        };
        PhanSo.sortPhanSo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
