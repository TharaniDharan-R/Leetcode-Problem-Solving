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
    static ListNode rev(ListNode head){
        ListNode prev= null;
        ListNode curr= head;
        while(curr!= null){
            ListNode next= curr.next;
            curr.next= prev;
            prev=curr;
            curr= next;
        }
        return prev;
    }
    static ListNode mid(ListNode l){
        ListNode s=l;
        ListNode f=l;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s= head;
        ListNode mid= mid(head);
        ListNode midrev=rev(mid);

        while(midrev!=null){
            if(s.val != midrev.val){
                return false;
            }
            s=s.next;
            midrev=midrev.next;

        }
      //  System.out.print(midrev.val);
        return true;
    }
}