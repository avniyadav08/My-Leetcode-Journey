class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)==2){
                list.add(key);
            }
        }
        Arrays.sort(nums);

        int small=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==small){
                small++;
            }
        }
        list.add(small);


        int arr[]=new int [list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }

        return arr;

    }
}