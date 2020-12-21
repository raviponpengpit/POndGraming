package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add("");
        while (queue.front != queue.rear) {
            String s = queue.get() ;
            char [] a = s.toCharArray();
            if (a.length == 4) {
                System.out.println(a);
            }
            else {
                queue.add(s + "L");
                queue.add(s + "H");
            }

        }

    }
}
