class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]= new int[nums.length];
        int arr2[]=new int[nums.length];
        int  z=0,nz=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[z++]=nums[i];
            }else{
                arr2[nz++]=nums[i];
            }
        }
        int index=0;
        for(int i=0;i<nz;i++){
            nums[index++]=arr2[i];
        }

        for(int i=0;i<z;i++){
            nums[index++]=arr[i];
        }


    }
}