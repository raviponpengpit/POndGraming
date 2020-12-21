package BasicJava.learnprograming;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);
        value.add(5);
        value.add(6);
        value.add(7);
        value.add(8);
        value.add(9);
        value.add(10);
        int e =count(value);
        System.out.println(e);

    }


    static int count(ArrayList<Integer> value) {
        int count = 0;
        for (Integer i : value) {
            if (i % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}