class Solution {
    public int divide(int dividend, int divisor) {
    
         double res= (double)dividend/divisor;
         double ans=0;

        if(divisor>0 && dividend>0){
            ans+=Math.floor(res);
        }else if(divisor<0 && dividend<0){
            ans+=Math.floor(res);
        }
        else{
            ans+=Math.ceil(res);
        }

        return (int)ans;
    }
}