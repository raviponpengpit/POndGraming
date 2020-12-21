package BasicJava.learnprograming;

public class Queue {
    int front = 0 ;
    int rear = 0 ;
    String [] data = new String[10000];
    void add(String s) {
        data[rear] = s;
        rear++;

    }

    String get() {
        return  data[ front ++];
    }

}
