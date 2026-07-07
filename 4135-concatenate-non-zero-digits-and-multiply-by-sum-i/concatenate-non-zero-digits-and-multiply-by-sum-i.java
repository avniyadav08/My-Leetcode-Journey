class Solution {
    public long sumAndMultiply(int n) {

        StringBuilder sb = new StringBuilder();

        String str = String.valueOf(n);

        for (char s : str.toCharArray()) {
            if (s != '0') {
                sb.append(s);
            }
        }
        
        if(sb.length()==0){
            return 0;
        }

        int num = Integer.parseInt(sb.toString());
        int original = num;

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return (long) sum * original;
    }
}