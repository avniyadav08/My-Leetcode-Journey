class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int num[]= new int[nums1.length+nums2.length];

        int p1=0;
        int p2=0;

        int p3=0;

        while (p1 <nums1.length && p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                num[p3]=nums1[p1];
                p3++;
                p1++;
            }
            else{
                num[p3]=nums2[p2];
                p3++;
                p2++;
            }
        }
        
        while(p1<nums1.length ){
            num[p3++]=nums1[p1++];
        }
        while(p2<nums2.length){
            num[p3++]=nums2[p2++];
        }

        if(num.length % 2==0){
            return ((double) num[num.length/2 -1]+ (double) num[num.length/2])/2.0;
        }else{
            return (double) num[num.length/2];
        }

    }
}