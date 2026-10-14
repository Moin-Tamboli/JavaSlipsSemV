interface shape{
    void area();
}
class circle implements shape {
    double PI = 3.14;
    double radius;

     circle(double r) {
        radius = r;
    }

    public void area(){
        System.out.println("Area of circle = "+PI*radius*radius);
    }
}
class sphere implements shape{
    double PI = 3.14;
    double radius;

    sphere(double r ){
        radius = r;
    }

    public void area(){
        System.out.println("Area of Sphere = "+ 4*PI*radius*radius);
    }
}
public class circleCylinderAreaS12 {
    static void main(String[] args) {
        circle c = new circle(5);
        sphere s = new sphere(5);
        c.area();
        s.area();


    }
}
