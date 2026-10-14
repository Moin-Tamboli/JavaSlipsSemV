
//(Q.1) Write a Java program to create class Rectangle having length and
//        breadth. Calculate and display the Area and Perimeter.
//import java.util.Scanner;
//
//class Rectangle {
//    double length;
//    double breadth;
//
//    Rectangle(double length, double breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    double area() {
//        return length * breadth;
//    }
//
//    double perimeter() {
//        return 2 * (length + breadth);
//    }
//}
//
//public class areaPerimeterRectangleS10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter length: ");
//        double length = sc.nextDouble();
//
//        System.out.print("Enter breadth: ");
//        double breadth = sc.nextDouble();
//
//        Rectangle rectangle = new Rectangle(length, breadth);
//
//        System.out.println("Area: " + rectangle.area());
//        System.out.println("Perimeter: " + rectangle.perimeter());
//
//        sc.close();
//    }
//}


//---------------------------------------------------------------------------------------------

//(Q.2) Write a Java Program to create the hash table that will maintain the
//mobile number and student name. Display the details of students using
//enumeration interface.

//        import java.util.Enumeration;
//import java.util.Hashtable;
//import java.util.Scanner;
//
//public class StudentHashtable {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Hashtable<String, String> students = new Hashtable<>();
//
//        System.out.print("Enter number of students: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter student name: ");
//            String name = sc.nextLine();
//
//            System.out.print("Enter mobile number: ");
//            String mobile = sc.nextLine();
//
//            students.put(mobile, name);
//        }
//
//        System.out.println("\nStudent details:");
//        Enumeration<String> numbers = students.keys();
//
//        while (numbers.hasMoreElements()) {
//            String mobile = numbers.nextElement();
//            System.out.println("Mobile: " + mobile
//                    + ", Student name: " + students.get(mobile));
//        }
//
//        sc.close();
//    }
//}
