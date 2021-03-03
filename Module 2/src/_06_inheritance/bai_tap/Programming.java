package _06_inheritance.bai_tap;

public class Programming {
    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder(20,"blue", true, 30);
//        System.out.println(cylinder.toString());
//        System.out.println(cylinder.isArea());

//        Point2D point2D = new Point2D(3,4);
//        System.out.println(point2D.toString());
//        Point3D point3D = new Point3D(1,2,3);
//        System.out.println(point3D.toString());
        MovablePoint movablePoint = new MovablePoint(2, 3, 4, 5);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());

    }
}
