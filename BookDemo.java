class book {
    int bid;
    String bname;
    int price;

    book(int id, String name, int p) {
        bid = id;
        bname = name;
        price = p;
    }
    void display(){
        System.out.println("Book ID: "+ bid);
        System.out.println("Book Name: "+ bname);
        System.out.println("Book Price: "+ price);
    }

}

    public class BookDemo {
        static void main(String[] args) {
            book b[] = new book[5];
            b[0] = new book(1, "Python", 450);
            b[1] = new book(2, "C++", 350);
            b[2] = new book(3, "DBMS", 550);
            b[3] = new book(4, "thomas", 40);
            b[4] = new book(5, "Green", 150);

            for(int i = 0; i<5; i++){
                b[i].display();
            }


        }

    }

