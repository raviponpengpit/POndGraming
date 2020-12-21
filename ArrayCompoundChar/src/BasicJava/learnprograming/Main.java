package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	String a = "LOVE";
	String b = "HATE";
	char [] c = a.toCharArray();
	char [] d = b.toCharArray();
	    for(int i = 0 ; i < a.length() ; i++){
            System.out.print(c[i] + "" + d[i]);
        }
    }
}
