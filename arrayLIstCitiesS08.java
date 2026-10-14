//) Write a java program to accept names of ‘n’ cities, insert same into
//        array list collection and display the contents of same array list, also
//        remove all these elements.

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class arrayLIstCitiesS08 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> cities = new ArrayList<>();// <------ye line alag hai baki sab same hai
//
//        System.out.print("Enter the number of cities: ");
//        int n = sc.nextInt();
//        sc.nextLine(); // consume the newline
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter city " + (i + 1) + ": ");
//            cities.add(sc.nextLine());
//        }
//
//        System.out.println("Cities: " + cities);
//
//        cities.clear(); // <-- aur ye bhi
//
//        System.out.println("ArrayList after removing all elements: " + cities);
//        sc.close();
//    }



    //---------------------------------------------------------------------------------------


    import java.util.Arrays;
    import java.util.Scanner;

    class Customer {
        int cid;
        String cname;
        double billAmount;

        Customer(int cid, String cname, double billAmount) {
            this.cid = cid;
            this.cname = cname;
            this.billAmount = billAmount;
        }
    }

//    public class CustomerSort {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter the number of customers: ");
//            int n = sc.nextInt();
//            sc.nextLine();
//
//            Customer[] customers = new Customer[n];
//
//            for (int i = 0; i < n; i++) {
//                System.out.println("Enter details for customer " + (i + 1) + ":");
//
//                System.out.print("Customer ID: ");
//                int id = sc.nextInt();
//                sc.nextLine();
//
//                System.out.print("Customer name: ");
//                String name = sc.nextLine();
//
//                System.out.print("Bill amount: ");
//                double bill = sc.nextDouble();
//                sc.nextLine();
//
//                customers[i] = new Customer(id, name, bill);
//            }
//// iske niche ka part alag hai
//            Arrays.sort(customers,
//                    (customer1, customer2) ->
//                            Double.compare(customer1.billAmount, customer2.billAmount));
//
//            System.out.println("\nCustomers sorted by bill amount:");
//            for (Customer customer : customers) {
//                System.out.println(customer.cid + " | " + customer.cname
//                        + " | " + customer.billAmount);
//            }
//
//            sc.close();
//        }
//    }
//}