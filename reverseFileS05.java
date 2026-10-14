//(Q.1) Write a java program to display the contents of a file in reverse order.


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

    class reverseFileS05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter file path: ");
            String fileName = sc.nextLine();

            try {
                String contents = Files.readString(Path.of(fileName));

                System.out.println("File contents in reverse order:");
                for (int i = contents.length() - 1; i >= 0; i--) {
                    System.out.print(contents.charAt(i));
                }
            } catch (IOException e) {
                System.out.println("Could not read the file: " + e.getMessage());
            }

            sc.close();
        }
    }


    //---------------------------------------------------------------------------------------

//    Q.2) Write a java program to create an abstract class Shape with methods
//            area & volume. Derive two classes Sphere (radius), Cylinder (radius,
//    height) from it. Calculate area and volume of both. (Use Method
//    Overriding)

//import java.util.Scanner;
//
//abstract class Shape {
//    abstract double area();
//    abstract double volume();
//}
//
//class Sphere extends Shape {
//    double radius;
//
//    Sphere(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double area() {
//        return 4 * Math.PI * radius * radius;
//    }
//
//    @Override
//    double volume() {
//        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
//    }
//}
//
//class Cylinder extends Shape {
//    double radius;
//    double height;
//
//    Cylinder(double radius, double height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    @Override
//    double area() {
//        return 2 * Math.PI * radius * (radius + height);
//    }
//
//    @Override
//    double volume() {
//        return Math.PI * radius * radius * height;
//    }
//}
//
//public class ShapeCalculations {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter sphere radius: ");
//        double sphereRadius = sc.nextDouble();
//        Sphere sphere = new Sphere(sphereRadius);
//
//        System.out.print("Enter cylinder radius and height: ");
//        double cylinderRadius = sc.nextDouble();
//        double cylinderHeight = sc.nextDouble();
//        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
//
//        System.out.println("\nSphere area: " + sphere.area());
//        System.out.println("Sphere volume: " + sphere.volume());
//
//        System.out.println("\nCylinder area: " + cylinder.area());
//        System.out.println("Cylinder volume: " + cylinder.volume());
//
//        sc.close();
//    }
//}
