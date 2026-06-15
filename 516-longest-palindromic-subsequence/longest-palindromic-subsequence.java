class Solution {
    public int longestPalindromeSubseq(String s) {
        Integer dp[][]=new Integer[s.length()][s.length()];
        return func(s,0,s.length()-1,dp);
    }

    int func(String s,int i,int j,Integer dp[][]){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=null ) return dp[i][j];

        if(s.charAt(i)==s.charAt(j)){
            return 2+ func(s,i+1,j-1,dp);
        }else{
            dp[i][j]= Math.max(func(s,i+1,j,dp),func(s,i,j-1,dp));
        }
        return dp[i][j];
    }
}