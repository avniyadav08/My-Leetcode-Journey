class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int curr=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=curr){
                count+=1;
                curr=curr-plants[i];
            }
            else{
                count+=2*i+1;
                curr=capacity-plants[i];
            }
        }
        return count;
    }
}