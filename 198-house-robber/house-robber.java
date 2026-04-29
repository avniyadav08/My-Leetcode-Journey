class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        
        Arrays.fill(dp,-1);
     return maxProfit(nums,nums.length-1,dp);

    }

    private int maxProfit(int nums[],int i,int dp[]){
        if(i<0){
            return 0;
        }
        
        if(dp[i]!=-1) return dp[i];

        int pick=nums[i]+maxProfit(nums,i-2,dp);

        int skip= maxProfit(nums,i-1,dp);

        return dp[i]=Math.max(pick,skip);
    }
}