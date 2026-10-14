////public class storefiveProductsArrayMethod {
////}
//class Circle1 {
//    double r;
//
//    Circle1(double r) {
//        this.r = r;
//    }
//
//    void area() {
//        System.out.println("Area of Circle = " + (3.142 * r * r));
//    }
//}
//
//class Cylinder extends Circle1 {
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
//class storefiveProductsArrayMethod {
//    public static void main(String args[]) {
//        Circle1 c = new Circle1(5);
//        Cylinder cy = new Cylinder(5, 10);
//
//        c.area();
//        cy.area();
//    }
//}


//--------------------------------------------------------------------------------------------------
//Q2
//import java.util.*;
//
//class Product {
//    int id;
//    String name;
//    double price;
//
//    void accept(Scanner sc) {
//        System.out.print("Enter Product ID: ");
//        id = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Enter Product Name: ");
//        name = sc.nextLine();
//
//        System.out.print("Enter Product Price: ");
//        price = sc.nextDouble();
//    }
//
//    void display() {
//        System.out.println("Product ID: " + id);
//        System.out.println("Product Name: " + name);
//        System.out.println("Product Price: " + price);
//    }
//}
//
//class ProductDemo {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        Product p[] = new Product[5];
//
//        for (int i = 0; i < 5; i++) {
//            p[i] = new Product();
//            System.out.println("\nEnter details of Product " + (i + 1));
//            p[i].accept(sc);
//        }
//
//        int min = 0;
//
//        for (int i = 1; i < 5; i++) {
//            if (p[i].price < p[min].price) {
//                min = i;
//            }
//        }
//
//        System.out.println("\nProduct Having Minimum Price:");
//        p[min].display();
//
//        sc.close();
//    }
//}