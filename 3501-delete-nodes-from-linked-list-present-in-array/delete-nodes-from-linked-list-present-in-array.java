/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        List<Integer> list =new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!set.contains(list.get(i))){
                ans.add(list.get(i));
            }
        }

        ListNode newHead= new ListNode(0);
        ListNode curr=newHead;

        for(int i=0;i<ans.size();i++){
             curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }

        return newHead.next;
    }
}