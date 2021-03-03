package _01_introduction_to_java.bai_tap;

import com.sun.org.apache.bcel.internal.classfile.ConstantInteger;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final int rate = 23000;
        System.out.println("Enter your USD");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println("VND: " + vnd);
    }
}
