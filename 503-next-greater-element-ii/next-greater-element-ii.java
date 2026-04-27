class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
             res[i]=-1;
            for(int j=1;j<nums.length;j++){
               int next=nums[(i+j)%nums.length];

               if(next>nums[i]){
                res[i]=next;
                break;
               }
            }
        }

        return res;
    }
}