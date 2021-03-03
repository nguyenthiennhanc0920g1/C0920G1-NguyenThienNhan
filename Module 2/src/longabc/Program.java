package longabc;

import java.util.*;

public class Program {


    public static void tinhKhoiLuong(Object sp) {

    }

    public static void main(String[] args) {
        BimBim a = new BimBim();
        Coca b = new Coca(10);
        Coca b1 = new Coca(5);
        Beer bb = new Beer();
        Larue l = new Larue();


        List<SanPham> sps = new ArrayList<SanPham>(Arrays.asList(a, b, l));
        List<Coca> cocas = new ArrayList<Coca>(Arrays.asList(b, b1));
        Collections.sort(cocas);

        Collections.sort(sps, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return (int) (o1.getValue() - o2.getValue());
            }
        });

        float total = a.getValue() + b.getValue();
    }
}
