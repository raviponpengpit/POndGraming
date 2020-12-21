package CodestarDec;

class Main {

    public static void main(String[] args) {
        int[] numberA = {50,10, 20, 30, 40, 50};
        int[] numberB = {10, 20, 30, 40, 50};
        int[] numberC = {10, 20, 30, 40, 50};
        System.out.println(Maxvalue(numberA));
        System.out.println(Minvalue(numberA));
        System.out.println(FindmaxIndex(numberA));
        System.out.println("Min index is" + FindMinIndex((numberA)));
        ShowArray(numberA);
        swap(numberA,0,4);
        ShowArray(numberA);
    }

    static void ShowArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("End");

    }

    static int Maxvalue(int[] arr){
        int maxvalue = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    static int Minvalue(int [] arr){
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }

    static int FindmaxIndex(int [] arr){
        int maxindex = 0;
        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] > arr[maxindex]){
                maxindex = i ;
            }

        }

        return maxindex;

    }

    static int FindMinIndex(int [] arr){
        int minindex = 0;
        for(int i = 0; i < arr.length ; i++)
            if (arr[i] < arr[minindex]) {
                minindex = i;

            }

        return  minindex ;
    }


    static void swap (int [] a, int x, int y){
        int temp = a[x] ;
        a[x] = a[y] ;
        a[y] = temp ;
    }




}



