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
    public void reorderList(ListNode head) {
        List<Integer> arr= new ArrayList<>();

        ListNode temp=head;

        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }

        int i=0,j=arr.size()-1;

        List<Integer> res=new ArrayList<>();

        while(i<=j){
            if(i==j){
                res.add(arr.get(i));
            }else{
                res.add(arr.get(i));
                res.add(arr.get(j));
            }
            i++;
            j--;

        }

        temp=head;
        int k=0;
        while(temp!=null){
            temp.val=res.get(k++);
            temp=temp.next;
        }
    }
}