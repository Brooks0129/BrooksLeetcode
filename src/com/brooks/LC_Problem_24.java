package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_24{
    public ListNode swapPairs(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy.next;
        ListNode next=cur.next;
        ListNode pre=dummy;
        while(cur!=null&&next!=null){
            ListNode tmp=next.next;
            pre.next=next;
            next.next=cur;
            cur.next=tmp;
            pre=cur;
            cur=tmp;
            if(tmp==null){
                break;
            }
            next=cur.next;

        }
        return dummy.next;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
}
