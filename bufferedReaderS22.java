//public class bufferedReaderS22 {
//}

//import java.io.*;
//
//class PrimeNumbers {
//    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        System.out.print("Enter a number: ");
//        int n = Integer.parseInt(br.readLine());
//
//        System.out.println("Prime numbers are:");
//
//        for (int i = 2; i <= n; i++) {
//            int count = 0;
//
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//
//            if (count == 2) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

//-----------------------------------------------------------------------------------------------
//Q2
import java.util.*;

class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Rahul");
        list.add("Amit");
        list.add("Priya");
        list.add("Sneha");

        System.out.println("Original List: " + list);

        list.addLast("Neha");
        System.out.println("After adding at end: " + list);

        list.removeFirst();
        System.out.println("After deleting first element: " + list);

        System.out.println("List in reverse order:");

        Iterator<String> itr = list.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}