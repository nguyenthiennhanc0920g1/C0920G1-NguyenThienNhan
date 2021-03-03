package _04_class_object.bai_tap.Fan;

public class BaiTapFan {
    public static void useFan() {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println("Status of fan 1:");
        System.out.println(fan1.toString());
        System.out.println("Status of fan 2:");
        System.out.println(fan2.toString());
    }
}
