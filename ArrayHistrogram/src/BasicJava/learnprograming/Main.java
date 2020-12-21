package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	int [] a = {8,7,4,5,6,4} ;
	    for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " : ");
            for(int j = 0 ; j < a[i] ; j++){
                System.out.print("o");
            }
            System.out.println();
        }


    }
}
