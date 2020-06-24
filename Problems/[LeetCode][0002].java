/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(-1);
        ListNode cur = d;
        int car=0;
        while(l1!=null||l2!=null){
            int a=l1 == null ? 0 : l1.val;
            int b=l2 == null ? 0 : l2.val;
            int sum = a+b+car;
            car = sum >= 10 ? 1 : 0;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        if(car==1) cur.next=new ListNode(1);
        return d.next;
    }
}

链表和指针
