package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int tmp = 0 ;
            List<Boolean> list = new ArrayList<Boolean>();
            for(int i = 0 ; i < candies.length ; i++){
                if(candies[i] > tmp){
                    tmp = candies[i] ;
                }
            }
            for(int i = 0 ; i < candies.length ; i++){
                if(candies[i] + extraCandies >= tmp){
                    list.add(true);
                }
                else{
                    list.add(false);
                }
            }

            return list ;

        }
    }
}
