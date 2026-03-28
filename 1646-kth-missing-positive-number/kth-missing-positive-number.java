class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list=new ArrayList<>();
        
        int i=0;
        int num=1;

        while(list.size() < k){
            if(i<arr.length && arr[i]==num){
                i++;
            }else{
                list.add(num);
            }
            num++;
        }

        return list.get(k-1);


    }
}