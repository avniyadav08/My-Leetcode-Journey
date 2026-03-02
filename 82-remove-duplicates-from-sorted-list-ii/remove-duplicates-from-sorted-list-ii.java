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

 //hashmap
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    
    HashMap<Integer,Integer> map=new HashMap<>();

    if(head==null) return null;

    ListNode curr=head;

    while(curr!=null){
        map.put(curr.val,map.getOrDefault(curr.val,0)+1);
        curr=curr.next;
    }

    ListNode dummy=new ListNode(0);
    ListNode prev=dummy;

    curr=head;

    while(curr!=null){
        if(map.get(curr.val)==1){
            prev.next=curr;
            prev=prev.next;
        }
        curr=curr.next;
    }
    prev.next=null;

    return dummy.next;
        
    }
}