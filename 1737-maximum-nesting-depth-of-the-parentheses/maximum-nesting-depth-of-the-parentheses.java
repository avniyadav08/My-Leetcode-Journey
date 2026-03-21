class Solution {
    public int maxDepth(String s) {
        
        int max_count=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(') {
                count++;
                
            }else if(c==')'){
                max_count=Math.max(max_count,count);
                count--;
            }
        }
        return max_count;
    }
}