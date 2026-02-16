class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int add=0;
        while(n>0){
            int digit=n%10;
            mul*=digit;
            add+=digit;

            n=n/10;

        }
        int res=mul-add;
        return res;
    }
}