class Solution {
    public int dominantIndex(int[] nums) {
        int[] copy = nums.clone();
        int n = copy.length;

        Arrays.sort(copy);

        int secondHighest = copy[n - 2];
        int highest = copy[n - 1];


        if (highest >= 2 * secondHighest) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == highest) {
                    return i;
                }
            }
        }

        return -1;
    }
}