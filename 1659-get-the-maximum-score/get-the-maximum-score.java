class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long max=0, s1=0 ,s2=0 ;
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <nums2[j]){
                s1+=nums1[i++];
            }else if(nums1[i]>nums2[j]){
                s2+=nums2[j++];
            }else{
                max+=Math.max(s1,s2) + nums1[i];
                i++;
                j++;
                s1=0;
                s2=0;
            }

        }
        while(i<nums1.length){
            s1+=nums1[i++];
        }
        while(j<nums2.length){
            s2+=nums2[j++];
        }

        max+=Math.max(s1,s2);

        return (int)(max % (1e9+7));    
    }
}