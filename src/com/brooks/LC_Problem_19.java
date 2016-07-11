package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_19{
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode cur=head;
        int len=0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        if(n>len||n<=0)
            return head;
        if(n==len)
            return head.next;
        int m=len-n;
        cur=head;
        while(--m!=0){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
}
