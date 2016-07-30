package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_206_Recrusion{
    public ListNode reverseList(ListNode head){
        return reverse(head,null);
    }
    private ListNode reverse(ListNode head,ListNode newHead){
        if(head==null){
            return newHead;
        }
        ListNode next=head.next;
        head.next=newHead;
        return reverse(next,head);
    }
}
