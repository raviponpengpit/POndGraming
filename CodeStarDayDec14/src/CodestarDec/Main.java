package CodestarDec;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {


        Book [] data = { new Book("Biology",75.0),
                new Book ("Astronomy" , 70.0),
                new Book ("Chemistry",80)} ;
        for(int i = 0 ; i < data.length ;i++){
            System.out.println(data[i].title + data[i].price);
        }
    }
}


    class Book {
        Book(String title,double price) {
            this.title = title;
            this.price = price;
        }

        String title ;
        double price;
    }





