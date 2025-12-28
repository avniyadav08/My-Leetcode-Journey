/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        //merge two arrays
        int[] merged=new int[n+m];
        int k=0;

        for(int i=0;i<n;i++){
            merged[k++]=nums1[i];
        }

        for(int i=0;i<m;i++){
            merged[k++]=nums2[i];
        }

        Arrays.sort(merged);
        
       int low=0;int high =merged.length-1;
       int mid=(high+low)/2;
       if((n+m)%2==0){
        //even length
        return (merged[mid-1]+ merged[mid]) / 2.0;
       }
       else{//odd length
        return merged[mid];
       }
    }
}*/

class Solution {  
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {  
        int n = nums1.length;  
        int m = nums2.length;  

        // Merge two arrays  
        int[] merged = new int[n + m];  
        int k = 0;  
        int i = 0;  
        int j = 0;  

        while (i < n && j < m) {  
            if (nums1[i] < nums2[j]) {  
                merged[k++] = nums1[i++];  
            } else {  
                merged[k++] = nums2[j++];  
            }  
        }  

        while (i < n) {  
            merged[k++] = nums1[i++];  
        }  

        while (j < m) {  
            merged[k++] = nums2[j++];  
        }  

        int mid = (n + m) / 2;  

        if ((n + m) % 2 == 0) {  
            // Even length  
            return (merged[mid - 1] + merged[mid]) / 2.0;  
        } else {  
            // Odd length  
            return merged[mid];  
        }  
    }  
}