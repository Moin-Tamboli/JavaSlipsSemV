//public class arraySumS18 {
//}

//Q1

//import java.util.*;
//
//class ArraySort {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int a[] = new int[n];
//        int sum = 0;
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            sum = sum + a[i];
//        }
//
//        System.out.println("Sum of elements = " + sum);
//
//        Arrays.sort(a);
//
//        System.out.println("Array in ascending order:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        sc.close();
//    }
//}

//-----------------------------------------------------------------------------------------------
//Q2
import java.util.*;

class Product {
    int id;
    String name;
    double price;

    void accept(Scanner sc) {
        System.out.print("Enter Product ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

class ProductDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Product p[] = new Product[5];

        for (int i = 0; i < 5; i++) {
            p[i] = new Product();
            System.out.println("\nEnter details of Product " + (i + 1));
            p[i].accept(sc);
        }

        int min = 0;

        for (int i = 1; i < 5; i++) {
            if (p[i].price < p[min].price) {
                min = i;
            }
        }

        System.out.println("\nProduct Having Minimum Price:");
        p[min].display();

        sc.close();
    }
}
