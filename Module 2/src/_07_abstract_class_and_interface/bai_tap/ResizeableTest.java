package _07_abstract_class_and_interface.bai_tap;

import _06_inheritance.thuc_hanh.Circle;
import _06_inheritance.thuc_hanh.Rectangle;
import _06_inheritance.thuc_hanh.Shape;
import _06_inheritance.thuc_hanh.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Circle(5);
        arrShape[1] = new Rectangle(4, 3);
        arrShape[2] = new Square(6);
        int maxRange = 100;
        int minRange = 1;
        int range = maxRange - minRange + 1;
        double rate = ((Math.random() * range) + minRange);
        for (Shape x : arrShape) {
            System.out.println(x.resize(rate));
        }
    }
}
