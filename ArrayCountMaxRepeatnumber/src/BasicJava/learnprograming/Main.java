package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
        String b = "10000000000000010000000010101010" ;
        char [] a = b.toCharArray();
        int count = 0 ;
        int maxcount = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == '0'){
                count++ ;
            }
            else{
                if(count > maxcount){
                    maxcount = count;
                }
                count = 0;
            }

        }
        System.out.println(maxcount);
    }
}
