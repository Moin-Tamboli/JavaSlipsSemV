import java.util.*;
//
//class StudentHash {
//    public static void main(String[] args) {
//        Hashtable<String, String> ht = new Hashtable<>();
//
//        ht.put("9876543210", "Amit");
//        ht.put("9876543211", "Rahul");
//        ht.put("9876543212", "Sneha");
//
//        Enumeration<String> e = ht.keys();
//
//        while (e.hasMoreElements()) {
//            String mobile = e.nextElement();
//
//            System.out.println("Mobile = " + mobile);
//            System.out.println("Name = " + ht.get(mobile));
//        }
//    }
//}





















//import java.util.*;
class hashTableS10{
    static void main(String[] args) {
        Hashtable <String, String> ht = new Hashtable<>();
        ht.put("23432343", "Rohan");
        ht.put("83478466", "Sneha");
        ht.put("78459898", "Amir");

        Enumeration<String> e = ht.keys();

        while(e.hasMoreElements()){
            String Mobile = e.nextElement();

            System.out.println("Mobile = "+Mobile);
            System.out.println("Name = "+ht.get(Mobile));
        }
    }
}