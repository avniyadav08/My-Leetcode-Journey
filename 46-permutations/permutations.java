class Solution {    
    public List<List<Integer>> permute(int[] nums) {
       List<Integer> numbers=new ArrayList<>();
       for(int num:nums){
        numbers.add(num);
       }

       List<List<Integer>> ans=new ArrayList<>();

       func(numbers,ans,new ArrayList<>());

       return ans;

    } 

    void func (List<Integer> numbers,List<List<Integer>> ans,List<Integer> p){

        if(numbers.size()==0){
            ans.add(new ArrayList<>(p));
            return ;
        }

        for(int i=0;i<numbers.size();i++){
            int num=numbers.get(i);
            p.add(num);
            numbers.remove(i);
            func(numbers,ans,p);

           p.remove(p.size()-1);
           numbers.add(i,num);


        }
    }
    
}