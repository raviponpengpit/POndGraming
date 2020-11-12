package academy.learnprograming;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] a = {2, 3, 4} ;
	int mc = 0;
	int md = 0;
	double sum = 0;
	double mean = 0;
	//medien
	for(int i = 0 ; i < a.length ; i++){
		sum = sum+a[i];
	}
		System.out.println(sum/a.length);

	//mean
		Arrays.sort(a);
		for (int i = 0 ; i < a.length ; i++){
			System.out.print(a[i] ) ;
		}
		System.out.println();
		if(a.length % 2 != 0){
			System.out.println(a[a.length/2]);
		}
		else {
			System.out.println(((a[a.length/2]) + a[(a.length/2)+1])/2.0 );
		}
	//mode
	for(int i = 0; i < a.length ; i++){
	    int count= 0 ;
	    for(int j = 0 ; j < a.length ; j++) {
	        if(a[i] == a[j]){
	            count++;
            }
	        if(count > mc){
				md = a[i] ;
	            mc = count ;

            }
        }
    }
        System.out.println(md);
    }
}
