class Solution {
    public int[] findEvenNumbers(int[] digits) {

        Set<Integer> ans = new TreeSet<>();

        for(int i = 0; i < digits.length; i++){

            for(int j = 0; j < digits.length; j++){

                for(int k = 0; k < digits.length; k++){

                    if(i == j || j == k || k == i){
                        continue;
                    }

                    int first = digits[i];
                    int second = digits[j];
                    int third = digits[k];

                    // leading zero not allowed
                    if(first == 0) continue;

                    // last digit must be even
                    if(third % 2 != 0) continue;

                    int num = first * 100 + second * 10 + third;

                    ans.add(num);
                }
            }
        }

        int[] anss = new int[ans.size()];

        int ind = 0;

        for(int num : ans){
            anss[ind++] = num;
        }

        return anss;
    }
}