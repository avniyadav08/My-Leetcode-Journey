class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int buy=0;

        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                coins-=costs[i];
                 buy=buy+1;
            }
            if(coins==0)break;
        }
        return buy;
    }
}