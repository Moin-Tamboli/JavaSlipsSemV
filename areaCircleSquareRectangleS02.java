//(Q.2) Write a Java program to derive a class Square from class Rectangle.
//create one more class Circle. Create an interface with only one method
//        called area(). Implement this interface in all classes. Include appropriate
//data members and constructors in all classes. Write a java program to
//accept details of Square, Circle & Rectangle and display the area.

//import java.util.*;
//interface shape1{
//    double area();
//}
//class Rectangle implements shape1{
//    double length;
//    double breadth;
//
//    Rectangle(double l, double b){
//        length = l;
//        breadth = b;
//    }
//    public double area(){
//        return length*breadth;
//    }
//}
//
//class Square extends Rectangle{
//    Square(double side){
//        super(side, side);
//    }
//}
//class Circle implements shape1{
//    double radius;
//
//    Circle(double r) {
//        radius = r;
//    }
//
//    public double area(){
//        return Math.PI*radius*radius;
//    }
//}
//public class areaCircleSquareRectangleS02 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Side of Square : ");
//        double side = sc.nextDouble();
//
//        System.out.print("Enter the length and breadth of Rectangle : ");
//        double length = sc.nextDouble();
//        double breadth = sc.nextDouble();
//
//        System.out.print("Enter the Radius of Circle : ");
//        double radius = sc.nextDouble();
//        Square s = new Square(side);
//        System.out.println("The Area of Square : "+s.area() );
//        Rectangle r = new Rectangle(length, breadth);
//        System.out.println("The Area of Rectangle: "+r.area());
//        Circle c = new Circle(radius);
//        System.out.println("The Area of Circle : "+c.area());
//    }
//}



//--------------------------------------------------------------------------------------------
//(Q.1) Write a java program to accept n names of cites from user and display
//        them in descending order.

import java.util.*;
public class areaCircleSquareRectangleS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of cities : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] cities = new String[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter "+ (i+1)+" city name: ");
            cities[i] = sc.nextLine();
        }
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);

        for (int i = n-1; i>=0; i--){
            System.out.println(cities[i]);
        }
    }

}