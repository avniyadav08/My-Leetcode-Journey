class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;

        int a=0,b=0,c=0;
        int i=0;

        for(int j=0;j<n;j++){
            if(s.charAt(j)=='a'){
                a++;
            }else if(s.charAt(j)=='b'){
                b++;
            }else {
                c++;
            }

            while(a>0 && b>0 && c>0){
                count+=n-j;

                if(s.charAt(i)=='a'){
                    a--;
                }else if(s.charAt(i)=='b'){
                    b--;
                }else {
                    c--;
                }
                i++;
            }
        }
        return count;
    }
}