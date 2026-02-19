import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        
        BigInteger num = new BigInteger(num1);
        BigInteger num3 = new BigInteger(num2);

        BigInteger mul = num.multiply(num3);

        return mul.toString();
    }
}
