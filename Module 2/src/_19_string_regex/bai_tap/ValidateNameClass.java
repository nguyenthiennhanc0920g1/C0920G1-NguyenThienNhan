package _19_string_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidateNameClass {
    public static boolean isCheckNameClass(String nameClass) {
        final String REGEXNAMECLASS = "^([CAP])[0-9]{4}[GHIKLM]$";
        boolean check;
        check = Pattern.matches(REGEXNAMECLASS, nameClass);
        return check;
    }

    public static void main(String[] args) {
        System.out.println(isCheckNameClass("C1234G"));
        System.out.println(isCheckNameClass("C134G"));
        System.out.println(isCheckNameClass("A6578H"));
        System.out.println(isCheckNameClass("P3456I"));
        System.out.println(isCheckNameClass("A6578L"));
        System.out.println(isCheckNameClass("P3456M"));
    }
}
