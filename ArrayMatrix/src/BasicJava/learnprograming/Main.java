package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
        int[][] a = { {1,2,3,4,5,6},
                      {7,8,9,10,11,12}
    };
        for(int i = 0 ; i < a.length; i++){
            System.out.println();
            for(int j = 0; j < a[i].length ; j++){
                System.out.print(a[i][j] + " ");
            }



        }
    }
}
