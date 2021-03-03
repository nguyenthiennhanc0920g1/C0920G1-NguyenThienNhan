package _07_abstract_class_and_interface.thuc_hanh.Shape;

import _06_inheritance.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.getRadius(), c2.getRadius());
    }
}
