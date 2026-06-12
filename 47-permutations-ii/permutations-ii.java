class Solution {
    public List<List<Integer>> permuteUnique(int[] numbers) {
        Arrays.sort(numbers);
        List<Integer> nums = new ArrayList<>();

        for (int num : numbers) {
            nums.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();

        func(nums, ans, new ArrayList<>());
        return ans;
    }

    void func(List<Integer> nums, List<List<Integer>> ans, List<Integer> p) {
        if (nums.size() == 0) {
            ans.add(new ArrayList<>(p));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            if(i>0 && nums.get(i).equals(nums.get(i-1))){
                continue;
            }
            int num = nums.get(i);

            p.add(num);
            nums.remove(i);

            func(nums, ans, p);

            p.remove(p.size() - 1);
            nums.add(i, num);
        }
    }
}