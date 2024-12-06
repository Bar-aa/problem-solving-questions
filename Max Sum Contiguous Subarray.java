public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        HashMap <Integer,Integer> hm =new HashMap<>();
        int windowSum = 0, maxSum = Integer.MIN_VALUE;
        for (int num :A ){
            windowSum+=num;
            if (windowSum>maxSum){
                maxSum=windowSum;
            }
            if(windowSum<0){
                windowSum=0;
            }
            
        }
        return maxSum;
    }
}
