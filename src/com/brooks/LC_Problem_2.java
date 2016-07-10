package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_2{
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        boolean carry=false;
        ListNode head=new ListNode(-1);
        ListNode pre=head;
        while(l1!=null&&l2!=null){
            int curVal=l1.val+l2.val+(carry?1:0);
            ListNode cur=new ListNode(curVal%10);
            carry=(curVal>=10);
            pre.next=cur;
            pre=cur;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int curVal=l1.val+(carry?1:0);
            ListNode cur=new ListNode(curVal%10);
            carry=curVal>=10;
            pre.next=cur;
            pre=cur;
            l1=l1.next;
        }
        while(l2!=null){
            int curVal=l2.val+(carry?1:0);
            ListNode cur=new ListNode(curVal%10);
            carry=curVal>=10;
            pre.next=cur;
            pre=cur;
            l2=l2.next;
        }
        if(carry){
            pre.next=new ListNode(1);
        }
        return head.next;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
