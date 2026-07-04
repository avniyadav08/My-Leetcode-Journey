class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max = 0;

       
        for(int[] t : trips){
            max = Math.max(max, t[2]);
        }

       
        for(int i = 0; i <= max; i++){
            int passengers = 0;

            for(int[] t : trips){
                int num = t[0];
                int start = t[1];
                int end = t[2];

                
                if(i >= start && i < end){
                    passengers += num;
                }
            }

            if(passengers > capacity) return false;
        }

        return true;
    }
}