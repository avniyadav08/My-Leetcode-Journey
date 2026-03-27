class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;

        boolean arr[]=new boolean[fruits.length]; 
        Arrays.fill(arr,false);

        for(int i=0;i<fruits.length;i++){
            int f=fruits[i];

            for(int j=0;j<baskets.length;j++){
                if(f<=baskets[j] && arr[j]==false){
                    count++;
                    arr[j]=true;
                    break;
                }
            }
        }

        return fruits.length-count;
    }
}