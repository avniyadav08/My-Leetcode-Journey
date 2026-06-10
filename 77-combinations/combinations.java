class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }

        List<List<Integer>> ans=new ArrayList<>();
        func(list,k,ans,new ArrayList<>(),0);
        return ans;
    }

    void func(List<Integer>list,int k,List<List<Integer>> ans , List<Integer> c,int start){
        if (c.size()==k) {
            ans.add(new ArrayList<>(c));
            return;
        }

        for(int i=start;i<list.size();i++){
            c.add(list.get(i));
            func(list,k,ans,c,i+1);
            c.remove(c.size()-1);
        }


    }

    
}