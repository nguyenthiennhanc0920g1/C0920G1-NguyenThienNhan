package _05_access_modifier_static_method_static_property.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double v, String indigo, boolean b) {
    }

    public Circle(double v) {
    }


    protected double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }
}

