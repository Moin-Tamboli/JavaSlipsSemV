//public class areaCylinderCircleS23 {
//}
//class Circle {
//    double r;
//
//    Circle(double r) {
//        this.r = r;
//    }
//
//    void area() {
//        System.out.println("Area of Circle = " + (3.142 * r * r));
//    }
//}
//
//class Cylinder extends Circle {
//    double h;
//
//    Cylinder(double r, double h) {
//        super(r);
//        this.h = h;
//    }
//
//    void area() {
//        System.out.println("Area of Cylinder = " +
//                (2 * 3.142 * r * (r + h)));
//    }
//}
//
//class Demo {
//    public static void main(String args[]) {
//        Circle c = new Circle(5);
//        Cylinder cy = new Cylinder(5, 10);
//
//        c.area();
//        cy.area();
//    }
//}

//------------------------------------------------------------------------------------------------
//Q2
import java.util.*;

class HashMapSort {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(103, "Priya");
        map.put(101, "Rahul");
        map.put(105, "Sneha");
        map.put(102, "Amit");
        map.put(104, "Neha");

        System.out.println("Before Sorting:");
        System.out.println(map);

        TreeMap<Integer, String> sortedMap = new TreeMap<Integer, String>(map);

        System.out.println("After Sorting by Keys:");
        System.out.println(sortedMap);
    }
}