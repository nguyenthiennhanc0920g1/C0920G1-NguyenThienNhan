package _07_abstract_class_and_interface.bai_tap;

import _06_inheritance.thuc_hanh.Circle;
import _06_inheritance.thuc_hanh.Rectangle;
import _06_inheritance.thuc_hanh.Shape;
import _06_inheritance.thuc_hanh.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] arr = {
                new Circle(4),
                new Square(5),
                new Rectangle(6, 3)
        };
        for (Shape x : arr) {
            System.out.println("Area: ");
            System.out.println(x.getArea());
        }
    }
}
