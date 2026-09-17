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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode();
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode res= ans;
        int sum=0;
        int c=0;
        while(t1!=null || t2 != null){
            sum=c;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            ListNode n=new ListNode(sum%10);
            c=sum/10;
            res.next=n;
            res=res.next;
        }
        if(c>0){
            ListNode last= new ListNode(c%10);
            res.next=last;
            res=res.next;
        }
        return ans.next;









        // ListNode ans =new ListNode();
        // ListNode t1 = l1;
        // ListNode t2 = l2;
        // int sum =0;
        // int c=0;
        // ListNode res= ans;
        // while(t1 != null || t2 != null){
        //     sum= c;
        //     if(t1 !=null){
        //         sum +=t1.val;
        //     t1=t1.next;
        //     }
        //     if(t2 != null){
        //         sum+=t2.val;
        //     t2= t2.next;
        //     }
        //     ListNode n=new ListNode(sum%10);
        //     c=sum/10;
        //     res.next=n;
        //     res = res.next;
        // }
        // if(c>0){
        //     ListNode a= new ListNode(c);
        //     res.next= a;
        //     res= res.next;
        // }
        // return ans.next;
    }
}