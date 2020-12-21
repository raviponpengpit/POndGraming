package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	int [] a = {3 , 5 , 4 , 2 , 4};
	    for (int i = 1 ; i < a.length ; i++) {
	    int x = a[i];
	    int y = a[i-1];
	    a[i-1] = x;
	    a[i] = y ;

        }
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]);
        }
    }
}
