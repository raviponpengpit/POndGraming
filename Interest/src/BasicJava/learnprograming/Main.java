package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	double a = 100000;
	int count = 0;
	while(count <= 5){
		double interest =  1.25/100 *a ;
	    a = a + interest ;
	    count++ ;
        System.out.println(a);

    }

    }
}
