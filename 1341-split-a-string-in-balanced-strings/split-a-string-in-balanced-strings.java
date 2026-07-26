class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int balanced=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='L'){
                balanced+=1;
            }else if(ch=='R'){
                balanced-=1;
            }

            if(balanced==0){
                count++;
            }
        }

       

        return count;
    }
}