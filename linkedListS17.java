//(Q.1) Define an Interface “Integer” with a abstract method check().Write a
//Java program to check whether a given number is Positive or Negative.

//import java.util.*;
//interface integer{
//    void check();
//}
//class checkInteger implements integer{
//    int n;
//    checkInteger(int n){
//        this.n = n;
//    }
//    public void check(){
//        if(n>0){
//            System.out.println(n+" is positive");
//        }
//        else if(n<0){
//            System.out.println(n+ " is Negative");
//        }
//        else{
//            System.out.println(n +" is zero");
//        }
//    }
//}
//
//public class linkedListS17 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//
//        checkInteger obj = new checkInteger(n);
//
//        obj.check();
//        sc.close();
//    }
//}
//----------------------------------------------------------------------------------------
//Q.2) Write a program to create link list of integer objects. Do the following:
//i. Add element at first position
//ii. Delete last element
//iii. Display the size of link list
//import java.util.*;
//
//public class linkedListS17{
//    static void main(String[] args) {
//        LinkedList<Integer> li = new LinkedList<Integer>();
//
//        li.push(10);
//        li.push(20);
//        li.push(30);
//        li.push(40);
//
//        System.out.println("Original List :"+ li);
//
//        li.addFirst(5);
//        System.out.println("After Adding first :" +li);
//
//        System.out.println("Length of Linked list : "+ li.size());
//    }
//}
