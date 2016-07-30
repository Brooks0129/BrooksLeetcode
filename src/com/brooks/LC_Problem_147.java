package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_147{
    public ListNode insertionSortList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(0);
        ListNode cur=head;
        ListNode pre=dummy;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            while(pre.next!=null&&pre.next.val<cur.val){
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            pre=dummy;
            cur=next;
        }
        return dummy.next;
    }
}
