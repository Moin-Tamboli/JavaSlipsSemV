//import java.util.*;
//class rectangle{
//    double length, breadth;
//
//    rectangle(double l, double b){
//        length = l;
//        breadth = b;
//    }
//    void display(){
//        System.out.println("The area of Rectangle is : "+ length*breadth);
//        System.out.println("The perimeter of Rectangle is : "+ 2*(length+breadth));
//    }
//
//}
//
//public class areaRectangleS10 {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of Rectangle : ");
//        double l = sc.nextDouble();
//
//        System.out.print("Enter the breath of Rectangle : ");
//        double b = sc.nextDouble();
//
//        rectangle r = new rectangle(l,b);
//        r.display();
//
//    }
//}

//----------------------------------------------------------------------------------------------

//Write a Java Program to create the hash table that will maintain the
//mobile number and student name. Display the details of students using
//enumeration interface.
import java.util.*;
public class areaRectangleS10 {
    public static void main(String[] args) {
        Hashtable<String, String> student = new Hashtable<String, String>();
        student.put("1234567890", "Rohan");
        student.put("2345679801", "Sneha");

        Enumeration<String> e = student.keys();

        System.out.println("Student Details");

        while(e.hasMoreElements()){
            String mobile = e.nextElement();
            System.out.println("Mobile NO : "+mobile);
            System.out.println("Name : "+ student.get(mobile));
        }
    }
}



