class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max_sum=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n-k+1;i++){
            int curSum=0;
            for(int j=0;j<k;j++){
                curSum=curSum+nums[i+j];
            }
            max_sum=Math.max(curSum,max_sum);
        }

        double avg=(double) max_sum/k;

        return avg;
    }

}