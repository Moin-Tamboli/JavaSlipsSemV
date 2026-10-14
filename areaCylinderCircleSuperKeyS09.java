//(Q.1) Write a java program to calculate area of Cylinder and Circle. (use
//        super keyword)

//import java.util.Scanner;
//
//class Circle {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    double area() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Cylinder extends Circle {
//    double height;
//
//    Cylinder(double radius, double height) {
//        super(radius); // Calls the Circle constructor
//        this.height = height;
//    }
//
//    @Override
//    double area() {
//        return 2 * super.area() + 2 * Math.PI * radius * height;
//    }
//}
//
//public class areaCylinderCircleSuperKeyS09 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter radius: ");
//        double radius = sc.nextDouble();
//
//        Circle circle = new Circle(radius);
//        System.out.println("Area of circle: " + circle.area());
//
//        System.out.print("Enter cylinder height: ");
//        double height = sc.nextDouble();
//
//        Cylinder cylinder = new Cylinder(radius, height);
//        System.out.println("Total surface area of cylinder: " + cylinder.area());
//
//        sc.close();
//    }
//}


//-----------------------------------------------------------------------------------------


//(Q.2) Write a java program to accept ‘n’ integers from the user and store them
//in a collection. Display them in the sorted order. The collection should
//not accept duplicate elements. (Use a suitable collection). Search for a
//element using predefined search method in the Collection framework

//import java.util.Scanner;
//import java.util.TreeSet;
//
//public class SortedUniqueIntegers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TreeSet<Integer> numbers = new TreeSet<>();
//
//        System.out.print("How many integers will you enter? ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter " + n + " integers:");
//        for (int i = 0; i < n; i++) {
//            numbers.add(sc.nextInt());
//        }
//
//        System.out.println("Unique integers in sorted order: " + numbers);
//
//        System.out.print("Enter an integer to search for: ");
//        int searchValue = sc.nextInt();
//
//        if (numbers.contains(searchValue)) {
//            System.out.println(searchValue + " was found.");
//        } else {
//            System.out.println(searchValue + " was not found.");
//        }
//
//        sc.close();
//    }
//}
