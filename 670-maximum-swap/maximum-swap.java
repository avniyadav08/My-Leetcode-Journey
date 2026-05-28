class Solution {
    public int maximumSwap(int num) {

        String val = Integer.toString(num);

        int arr[] = new int[val.length()];

        for (int i = 0; i < val.length(); i++) {
            arr[i] = val.charAt(i) - '0';
        }

        int max = num;

       
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                
                int num1 = 0;

                for (int k = 0; k < arr.length; k++) {
                    num1 = num1 * 10 + arr[k];
                }

                max = Math.max(max, num1);

                
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return max;
    }
}