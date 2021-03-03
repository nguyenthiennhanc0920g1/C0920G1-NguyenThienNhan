package _19_string_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static boolean isCheckPhoneNumber(String phoneNumber) {
        final String REGEXPHONENUMBER = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
        boolean check;
        check = Pattern.matches(REGEXPHONENUMBER, phoneNumber);
        return check;
    }

    public static void main(String[] args) {
        System.out.println(isCheckPhoneNumber("(00)-(0123456567)"));
        System.out.println(isCheckPhoneNumber("(0)-(0123456567)"));
        System.out.println(isCheckPhoneNumber("(0054)-(0123456567)"));
        System.out.println(isCheckPhoneNumber("(00)-(012345656)"));
        System.out.println(isCheckPhoneNumber("(00)-(1123456567)"));
        System.out.println(isCheckPhoneNumber("(00)(0123456567)"));
    }
}
