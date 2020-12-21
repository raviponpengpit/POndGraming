package BasicJava.learnprograming;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	int [] a = {6,5,1,2,4,4,2,5,2,8,2,6,2,8,3,9,9,10};
	int [] b = new int [a.length];
	int n = 0 ;
	int [] c = new int [a.length];
	int v = 0;
	    for(int i = 0; i < a.length ; i++){
	        if(a[i] % 2 == 0){
	            b[n] = a[i];
	            n++;
            }
	        else{
	            c[v] = a[i];
	            v++;
            }
        }

        Arrays.sort(b,0,n) ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Even is = " + b[i]);
        }
        System.out.println();
        Arrays.sort(c , 0 ,v);
        for(int i = 0 ; i < v ; i++){
            System.out.println("Odd is = " + c[i]);
        }
    }
}
