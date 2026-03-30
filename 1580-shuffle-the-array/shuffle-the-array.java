class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int x[]=new int[n];
        int y[]=new int [n];

        for(int i=0;i<n;i++){
            x[i]=nums[i];
            y[i]=nums[i+n];
        }

        int ans[]=new int[nums.length];

        int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=x[i];
            ans[k++]=y[i];
        }
        return ans;
    }
}