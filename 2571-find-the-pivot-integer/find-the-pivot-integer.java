class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int ans=(int)Math.sqrt(sum);
        if(ans*ans==sum){
            return ans;
        }else{ 
            return -1;
        }
       
    }
}