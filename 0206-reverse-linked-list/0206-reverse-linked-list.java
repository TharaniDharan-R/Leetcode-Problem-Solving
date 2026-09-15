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
    public static ListNode InsertBig(ListNode head,ListNode n){
        n.next= head;
        return n;
    }
    public ListNode reverseList(ListNode head) {
        ListNode n=null;
        ListNode temp = head;
        while(temp!=null){
            ListNode nn=new  ListNode(temp.val);
            n=InsertBig(n,nn);
            temp = temp.next;
        }
        return n;
    }
}