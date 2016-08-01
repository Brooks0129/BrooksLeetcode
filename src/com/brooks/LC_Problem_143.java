package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/1.
 */
public class LC_Problem_143{
    public static void main(String[] args){
        LC_Problem_143 lc_problem_143=new LC_Problem_143();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        lc_problem_143.reorderList(head);
    }
    public void reorderList(ListNode head){
        if(head==null||head.next==null||head.next.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=null;
        ListNode cur=slow.next;
        slow.next=null;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        cur=head;
        while(pre!=null){
            ListNode next=cur.next;
            ListNode preNext=pre.next;
            cur.next=pre;
            pre.next=next;
            cur=next;
            pre=preNext;
        }
    }
}
