class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isLowerCase(c)){
                sb.append(c);
            }else if(c=='#'){
                String curr=sb.toString();
                sb.append(curr);
            }else if(c=='%'){
                sb.reverse();
            }
            else if(c=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}