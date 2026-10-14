import java.util.*;
class invalidDateException extends Exception{
    invalidDateException(String msg) {
        super(msg);
    }
}
class myDate{
    int day, month, year;

    myDate(int d, int m, int y) throws invalidDateException {
        if (d < 1 || m < 1 || y < 1 || d > 31 || m > 12)
            throw new invalidDateException("Invalid Date");

        day = d;
        month = m;
        year = y;
    }
        void display(){
            System.out.println(day+"/"+month+"/"+year);
        }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the date month and year: ");
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();

            myDate obj = new myDate(d,m,y);
            obj.display();
        }catch(invalidDateException e){
            System.out.println(e.getMessage());
        }
    }

    }
public class InvalidDateS07 {



}
