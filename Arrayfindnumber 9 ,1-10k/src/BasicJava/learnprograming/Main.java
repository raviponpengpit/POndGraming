package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	String a = "";
	    for(int i =0 ; i <= 10000 ; i++){
	        a = a+i ;
        }
	    char [] b  = a.toCharArray();
	    int count = 0 ;
	    for(int i = 0; i < b.length ; i++){
	        if(b[i] == '9'){
	            count++ ;
            }
        }
        System.out.println(count);
    }
}
