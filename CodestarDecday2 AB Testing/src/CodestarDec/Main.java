package CodestarDec;

public class Main {

    public static void main(String[] args) {
	String Command = "NNESEWWSWSWEW";
	char [] a = Command.toCharArray();
	int count = 0;

	for(int i = 0; i < a.length ; i++){

	    if(a[i] == 'N'){
	        count++ ;
	    if(a[i] == 'E')
	        count++ ;
        }
	    if(a[i] == 'W'){
	        count-- ;
        }
	    if(a[i] == 'S'){
	        count--;
        }


    }

		if(count == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}


    }
}
