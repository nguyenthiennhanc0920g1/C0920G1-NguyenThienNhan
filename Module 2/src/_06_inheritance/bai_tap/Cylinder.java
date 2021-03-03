package _06_inheritance.bai_tap;

import _06_inheritance.thuc_hanh.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double isArea() {
        return Math.PI * super.getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "A cylinder with height" + getHeight() + "\n" +
                "which is a subclass of" + super.toString();
    }
}
