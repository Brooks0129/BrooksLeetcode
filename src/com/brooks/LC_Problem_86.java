package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/7.
 */
public class LC_Problem_86{
    public ListNode partition(ListNode head,int x){
        ListNode l1=new ListNode(0);
        ListNode c1=l1;
        ListNode l2=new ListNode(0);
        ListNode c2=l2;
        while(head!=null){
            if(head.val<x){
                c1.next=head;
                c1=c1.next;
            }else {
                c2.next=head;
                c2=c2.next;
            }
            head=head.next;
        }
        c2.next=null;
        c1.next=l2.next;
        return l1.next;
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
