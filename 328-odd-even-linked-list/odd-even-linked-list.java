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
    public ListNode oddEvenList(ListNode head) {
        if (head==null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if((i+1)%2==1){
                odd.add(list.get(i));
            }else{
                even.add(list.get(i));
            }
        }

        odd.addAll(even);

        ListNode newHead= new ListNode(odd.get(0));
        ListNode curr=newHead;

        for(int i=1;i<odd.size();i++){
            curr.next=new ListNode(odd.get(i));
            curr=curr.next;
        }

        return newHead;

    }
}