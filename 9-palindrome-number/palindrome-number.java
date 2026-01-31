class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int result=0;
        while(x>0){
            int digit=x%10;
            result=result*10+digit;
            x=x/10;
        }

        if(num==result){
            return true;
        }else{
            return false;
        }
        
    }
}