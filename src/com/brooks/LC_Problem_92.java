package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/8.
 */
public class LC_Problem_92{
    public static void main(String[] args){
        LC_Problem_92 lc_problem_92=new LC_Problem_92();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
       // head.next.next.next.next=new ListNode(5);
        ListNode listNode=lc_problem_92.reverseBetween(head,2,4);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
    public ListNode reverseBetween(ListNode head,int m,int n){
        if(m>=n){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode left=null;
        ListNode right=null;
        int index=0;
        ListNode cur=dummy;
        while(cur!=null){
            index++;
            if(index==m){
                left=cur;
            }
            if(index==n+1){
                right=cur;
                break;
            }
            cur=cur.next;
        }
        ListNode start=left.next;
        ListNode end=right;
        right=right.next;
        left.next=end;
        reverse(start,end);
        start.next=right;
        return dummy.next;
    }
    private void reverse(ListNode start,ListNode end){
        ListNode pre=start;
        ListNode cur=start.next;
        ListNode next=cur.next;
        while(cur!=end){
            cur.next=pre;
            pre=cur;
            cur=next;
            next=next.next;
        }
        cur.next=pre;
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
