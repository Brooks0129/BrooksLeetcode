package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/7 12:07.
 * @description:
 */
public class LC_Problem_82{
    public ListNode deleteDuplicates(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=head;
        ListNode next=head.next;
        boolean flag=false;
        while(next!=null){
            if(next.val==cur.val){
                flag=true;
                next=next.next;
                cur.next=next;
            }else{
                if(flag){
                    pre.next=next;
                    cur=next;
                    next=next.next;
                    flag=false;
                }else{
                    pre=cur;
                    cur=next;
                    next=next.next;
                }
            }
        }
        if(flag){
            pre.next=null;
        }
        return dummy.next;
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
}
