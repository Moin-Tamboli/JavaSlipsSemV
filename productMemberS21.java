//Q.2) Write a Java Program which define class Product with data member as
//        id, name and price Store the information of 5products and Display the
//name of product having minimum price(Use array of object).
class product {
    int pid;
    String pname;
    int price;

    product(int id, String name, int price){
        pid = id;
        pname = name;
        this.price = price;
    }
    void display(){
        System.out.println("Product Id = "+pid);
        System.out.println("Product Name = " + pname);
        System.out.println("Product price = "+ price);
    }
}

public class productMemberS21 {
    static void main(String[] args) {
        product p[] = new product[5];
        p[0] =new product(1, "Pen", 10);
        p[1] =new product(2, "Notebook", 30);
        p[2] =new product(3, "Bag", 300);
        p[3] =new product(4, "Bottle", 50);
        p[4] =new product(5, "Pencil", 5);

        product min = p[0];

        for(int i = 1; i<p.length; i++){
            if(p[i].price<min.price){
                min = p[i];
            }
        }
        System.out.println("Product with minimum value : ");
        min.display();
    }
}
