class Solution {
    public int minDistance(String word1, String word2) {
        Integer dp[][] = new Integer[word1.length() + 1][word2.length() + 1];
        return func(word1, word2, 0, 0, dp); 
    }
    
    int func(String word1, String word2, int i, int j, Integer dp[][]) {
        if (i == word1.length()) {
            return word2.length() - j;
        }
        
        if (j == word2.length()) {
            return word1.length() - i;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }
        
        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = func(word1, word2, i + 1, j + 1, dp);
        } else {
            int insert = 1 + func(word1, word2, i, j + 1, dp);
            int delete = 1 + func(word1, word2, i + 1, j, dp);
            int replace = 1 + func(word1, word2, i + 1, j + 1, dp);
            
            dp[i][j] = Math.min(insert, Math.min(delete, replace));
        }

        return dp[i][j];
    }
}