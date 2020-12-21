package CodestarDec;

public class Main {

    public static void main(String[] args) {
	    String s = "00100010000";

	    int count = 0;
	    int maxcount = 0;
	    char [] a = s.toCharArray();
	    for(int i = 0; i < a.length ; i++){
	        if(a[i] == '0'){
	            count++;
            }

	        else{
	            if(count > maxcount){
	                maxcount = count;
                }
	            count = 0;
            }



        }


	    if(count > maxcount){
	    	maxcount = count;
		}

		System.out.println(maxcount);

    }
}
