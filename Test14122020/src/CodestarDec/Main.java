package CodestarDec;
import java.util.Arrays;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Book b = new Book("Fairytail" , 500);

        Book [] data = {new Book("GG",50),
                new Book ("GGEZ" , 55),
                new Book ("GGWP" , 45)
        };

        Arrays.sort(data,new Demo());

        for(int i = 0 ; i < data.length ; i++){
            System.out.println(data[i].name + data[i].price);
        }

    }
}

class Demo implements Comparator {
    public int compare(Object a ,Object b) {
        Book u = (Book) a;
        Book v = (Book) b;
        if(u.price < v.price) return -1 ;
        if(u.price > v.price) return +1 ;
        return 0;
    }

}

class Book {
    Book(String name,int price){
        this.name = name;
        this.price = price;
    }
    String name;
    int price;
}
