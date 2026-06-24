/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        func(root,targetSum,list,new ArrayList <Integer>());
        return list;
    }

    void func(TreeNode root,int targetSum,List<List<Integer>>list,List<Integer> curr){
            if(root==null) return;

        targetSum-=root.val;
        curr.add(root.val);

        if(root.left==null && root.right==null && targetSum==0){
            list.add(new ArrayList<>(curr));
        }

        func(root.left,targetSum,list,curr);
        func(root.right,targetSum,list,curr);
        int val=curr.get(curr.size()-1);
        curr.remove(curr.size()-1);
        targetSum+=val;
        
    }
}