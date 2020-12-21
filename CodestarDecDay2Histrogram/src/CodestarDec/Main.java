package CodestarDec;

public class Main {

    public static void main(String[] args) {
	    int[] data = {8,6,7,7,8,9};
	    for(int i = 0; i < data.length ; i++){
            System.out.print(data[i] + ":");
            for(int j = 0; j < data[i] ; j++){
                System.out.print("o");
            }

            System.out.println();
        }

    }
}
