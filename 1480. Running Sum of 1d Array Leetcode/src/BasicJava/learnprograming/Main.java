package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    class Solution {
        public int[] runningSum(int[] nums) {
            int [] a = new int [nums.length] ;
            int sum = 0;
            for(int i = 0 ; i < nums.length ; i++){
                sum = sum + nums[i];
                a[i] = sum ;

            }
            System.out.println(sum);


            return a ;
        }
    }

}
