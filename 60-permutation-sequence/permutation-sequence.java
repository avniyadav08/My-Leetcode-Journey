class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }

        List<List<Integer>> ans=new ArrayList<>();

        func(list,ans,new ArrayList<>());

        StringBuilder sb=new StringBuilder();

        List<Integer> kthList=ans.get(k-1);
        for(int i:kthList){
            sb.append(i);
        }
        return sb.toString();


    }

    void func(List<Integer> list,List<List<Integer>>ans,List<Integer> p){
        if(list.size()==0){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=0;i<list.size();i++){
            int num=list.get(i);
            p.add(num);
            list.remove(i);

            func(list,ans,p);

            p.remove(p.size()-1);
            list.add(i,num);
        }
    }
}