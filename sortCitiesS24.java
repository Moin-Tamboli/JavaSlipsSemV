//public class sortCitiesS24 {
//}


//import java.util.*;
//
//class CityDescending {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of cities: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        ArrayList<String> cities = new ArrayList<String>();
//
//        System.out.println("Enter city names:");
//        for (int i = 0; i < n; i++) {
//            cities.add(sc.nextLine());
//        }
//
//        Collections.sort(cities, Collections.reverseOrder());
//
//        System.out.println("Cities in descending order:");
//        for (String city : cities) {
//            System.out.println(city);
//        }
//
//        sc.close();
//    }
//}

//----------------------------------------------------------------------------------------------
//Q2

//abstract class Shape {
//    abstract void area();
//    abstract void volume();
//}
//
//class Sphere extends Shape {
//    double r;
//
//    Sphere(double r) {
//        this.r = r;
//    }
//
//    void area() {
//        System.out.println("Surface Area of Sphere: " + (4 * Math.PI * r * r));
//    }
//
//    void volume() {
//        System.out.println("Volume of Sphere: " + (4.0 / 3.0 * Math.PI * r * r * r));
//    }
//}
//
//class Cylinder extends Shape {
//    double r, h;
//
//    Cylinder(double r, double h) {
//        this.r = r;
//        this.h = h;
//    }
//
//    void area() {
//        System.out.println("Total Surface Area of Cylinder: " +
//                (2 * Math.PI * r * (r + h)));
//    }
//
//    void volume() {
//        System.out.println("Volume of Cylinder: " + (Math.PI * r * r * h));
//    }
//}
//
//class ShapeDemo {
//    public static void main(String args[]) {
//        Sphere s = new Sphere(5);
//        Cylinder c = new Cylinder(3, 7);
//
//        System.out.println("Sphere:");
//        s.area();
//        s.volume();
//
//        System.out.println("\nCylinder:");
//        c.area();
//        c.volume();
//    }
//}
