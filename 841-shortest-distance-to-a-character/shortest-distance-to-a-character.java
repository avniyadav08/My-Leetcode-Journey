class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        int idx=0;
       
        for(int i=0;i<s.length();i++){
            int minDist=Integer.MAX_VALUE;

            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    int dist=Math.abs(i-j);
                    minDist=Math.min(minDist,dist);
                }
            }

            ans[i]=minDist;
        }

        return ans;
    }
}