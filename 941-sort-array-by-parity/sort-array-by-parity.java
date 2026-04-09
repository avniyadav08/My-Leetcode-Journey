class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even[]=new int[nums.length];
        int odd[]=new int[nums.length];

       int e=0;
        int o=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[e++]=nums[i];
            }else{
                odd[o++]=nums[i];
            }
        }

        int res[]=new int [nums.length];
        int idx=0;

        for(int i=0;i<e;i++){
            res[idx++]=even[i];
        }

        for(int i=0;i<o;i++){
            res[idx++]=odd[i];
        }

        return res;
    }
}