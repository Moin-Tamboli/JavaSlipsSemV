//import java.applet.Applet;
//import java.awt.Graphics;
//
//public class appletS03 extends Applet {
//    public void paint(Graphics g) {
//        g.drawString("Hello, welcome to Java Applets!", 50, 50);
//    }
//}

//-------------------------------------------------------------------------------------------

//(Q.2) Write a Java Program which define class Employee with data member
//        as id, name and salary Store the information of n employees and
//        display the name of employee having maximum salary (Use array of
//        object).
import java.util.*;
class Employee{
    int id;
    String name;
    int Salary;
    Employee(int id, String name, int Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
}

public class appletS03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employee: ");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter "+(i+1)+ " Employee Details");

            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            int Salary = sc.nextInt();
            sc.nextLine();

            e[i] = new Employee(id, name, Salary);
        }
        Employee maxSalary = e[0];
        for(int i = 0; i<n; i++){
            if(e[i].Salary > maxSalary.Salary){
               maxSalary = e[i];
            }
        }
        System.out.println("Employee with highest Salary: "+ maxSalary.name);
    }
}
