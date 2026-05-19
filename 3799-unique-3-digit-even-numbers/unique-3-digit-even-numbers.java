class Solution {
    public int totalNumbers(int[] digits) {

        Set<Integer> set = new TreeSet<>();

        int n = digits.length;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                for(int k = 0; k < n; k++){

                    // indices must be different
                    if(i == j || j == k || i == k){
                        continue;
                    }

                    int first = digits[i];
                    int second = digits[j];
                    int third = digits[k];

                    if(first == 0) continue;

                    
                    if(third % 2 != 0) continue;

                    int num = first * 100 + second * 10 + third;

                    set.add(num);
                }
            }
        }

        return set.size();
    }
}