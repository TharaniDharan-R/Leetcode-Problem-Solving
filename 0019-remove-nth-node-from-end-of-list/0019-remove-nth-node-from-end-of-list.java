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
    public static ListNode Reverse(ListNode head){
        ListNode prev= null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
         head =Reverse(head);
        ListNode prev = null;
        ListNode temp = head;
        int c=1;
        while(c<n){
            prev= temp;
            temp=temp.next;
            c++;
        }
        if(prev== null){
            head=temp.next;
        }
        else{
            prev.next=temp.next;
        }
        head=Reverse(head);
        return head;
    }
}