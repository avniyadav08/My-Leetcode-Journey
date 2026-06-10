class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        
        func(list, k, ans, new ArrayList<>(), 0); 
        return ans;
    } 

    void func(List<Integer> list, int k, List<List<Integer>> ans, List<Integer> c, int start) {
        if (c.size() == k) { 
            ans.add(new ArrayList<>(c)); 
            return; 
        } 
        
        if (start >= list.size()) {
            return; 
        } 
        //exclude
        func(list, k, ans, c, start + 1); 
        

        //include
        c.add(list.get(start)); 
        func(list, k, ans, c, start + 1); 
        c.remove(c.size() - 1); 
    } 
}