package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_61{
    public ListNode rotateRight(ListNode head,int k){
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur=head;
        int len=1;
        while(cur.next!=null){
            len++;
            cur=cur.next;
        }
        k=k%len;
        ListNode temp=head;
        int a=len-k;
        if(k==0){
            return head;
        }
        while(a--!=1){
            temp=temp.next;
        }

        ListNode newHead=temp.next;
        temp.next=null;
        cur.next=head;
        return newHead;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
