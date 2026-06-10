class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> candi=new ArrayList<>();
        for(int num : candidates){
    candi.add(num);
}

        List<List<Integer>> ans=new ArrayList<>();

        func(candi,ans,target,new ArrayList<>(),0);
        return ans;
    }

    void func(List<Integer>candi,List<List<Integer>> ans,int target, List<Integer> c,int start){
        if(target==0){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=start;i<candi.size();i++){
            c.add(candi.get(i));

            func(candi,ans,target-candi.get(i),c,i);
            c.remove(c.size()-1);
        }
    }
}