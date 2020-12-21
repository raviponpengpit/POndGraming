package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	String s = "DWLWWWLWLWDWDWDW" ;
	int point = 0 ;
	char [] a = s.toCharArray();
	    for(int i = 0 ; i < a.length ; i++){
	        if(a[i] == 'W'){
	            point = point +3 ;
            }
	        else if (a[i] == 'D'){
	            point = point + 1 ;
            }
	        else if (a[i] == 'L'){
	            point = point +0 ;
            }

        }
        System.out.println(point);

    }
}
