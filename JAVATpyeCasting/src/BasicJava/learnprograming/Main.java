package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int i = 0 ;
        double a = i ;

        double b = 1;
        int g = (int)b;

        System.out.println(a);
        System.out.println(b);

        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age);

        String abc = "0891382963" ;
        int xyz = Integer.parseInt(abc);
        System.out.println(xyz);

        boolean result = age instanceof  String;
        System.out.println(result);


    }
}
