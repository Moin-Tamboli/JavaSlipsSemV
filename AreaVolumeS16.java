//Write a Java program to define an interface “Operation” which has
//Methods, area(), volume(). Define a constant PI having a value of
//          3.142.

//interface Operation{
//    double PI = 3.142;
//    void area();
//    void volume();
//}
//class circle1 implements Operation{
//    double radius;
//
//    circle1(double r ){
//        radius = r;
//    }
//    public void area(){
//        System.out.println("Area of circle = "+PI*radius*radius);
//    }
//    public void volume(){
//        System.out.println("Volume is not Applicable");
//    }
//}
//
//class cylinder implements Operation{
//    double radius;
//    double height;
//
//    cylinder(double r, double h){
//        radius = r;
//        height = h;
//    }
//    public void area(){
//        System.out.println("Area of cylinder : "+ 2*PI*radius*(radius+height));
//    }
//    public void volume(){
//        System.out.println("Volume of cylinder: "+ PI*radius*radius*height);
//    }
//}
//
//public class AreaVolumeS16 {
//    public static void main(String[] args){
//        circle1 c = new circle1(5);
//        cylinder cy = new cylinder(5,10);
//
//        c.area();
//        c.volume();
//        cy.area();
//        cy.volume();
//    }
//}

import java.util.Scanner;
public class AreaVolumeS16{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Febonacci Series");
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c = a +b;
            a=b;
            b=c;
        }
    }
}

//bas cylinder ka hi kar

//import java.util.Scanner;
//
//interface Operation {
//    double PI = 3.142;  // public, static, and final by default
//
//    double area();
//    double volume();
//}
//
//class Sphere implements Operation {
//    private double radius;
//
//    Sphere(double radius) {
//        this.radius = radius;
//    }
//
//    public double area() {
//        return 4 * PI * radius * radius;
//    }
//
//    public double volume() {
//        return (4.0 / 3.0) * PI * radius * radius * radius;
//    }
//}
//
//class Cylinder implements Operation {
//    private double radius;
//    private double height;
//
//    Cylinder(double radius, double height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public double area() {
//        return 2 * PI * radius * (radius + height);
//    }
//
//    public double volume() {
//        return PI * radius * radius * height;
//    }
//}
//
//public class OperationDemo {
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


