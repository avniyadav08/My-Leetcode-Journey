class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Step 1: Find min and max
        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        
        // Step 2: Create new array (optional)
        int sum = 0;
        int count = 0;
        
        for (int s : salary) {
            if (s != min && s != max) {
                sum += s;
                count++;
            }
        }
        
        // Step 3: Return average
        return (double) sum / count;
    }
}