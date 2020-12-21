package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	int [][] mat = {{1,2,3},
                    {4,5,6},
                    {7,8,9}
	                };

	    for(int i = 0; i < mat.length ; i++){
            System.out.println();
	        for(int j = 0; j < mat.length ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	    for(int r = -1 ; r < mat.length ; r=r+2){
            System.out.println();
	        for(int c = -1 ; c < mat.length ; c=c+2){
                System.out.print(mat[r+2][c+2]);
            }

        }
    }
}
