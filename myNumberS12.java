//Q1

interface Shape {
    void area();
}

class Circle implements Shape {
    final double PI = 3.14;
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle = " + (PI * r * r));
    }
}

class Sphere implements Shape {
    final double PI = 3.14;
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Surface Area of Sphere = " + (4 * PI * r * r));
    }
}

class ShapeDemo {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        Sphere s = new Sphere(5);

        c.area();
        s.area();
    }
}

//-------------------------------------------------------------------------------------------

//Q2

public class myNumberS12 {
}
class MyNumber {
    private int num;

    MyNumber() {
        num = 0;
    }

    MyNumber(int n) {
        num = n;
    }

    void isNegative() {
        if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is not Negative");
    }

    void isPositive() {
        if (num > 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is not Positive");
    }

    void isOdd() {
        if (num % 2 != 0)
            System.out.println("Number is Odd");
        else
            System.out.println("Number is not Odd");
    }

    void iseven() {
        if (num % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is not Even");
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please pass a number as command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber(n);

        obj.isNegative();
        obj.isPositive();
        obj.isOdd();
        obj.iseven();
    }
}
