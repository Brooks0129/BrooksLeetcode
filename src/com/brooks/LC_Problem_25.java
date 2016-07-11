package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_25{
    public ListNode reverseKGroup(ListNode head,int k){
        if(head==null||head.next==null||k<=1){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode left=dummy;
        ListNode start=head;
        ListNode end=start;
        ListNode right=null;
        int count=1;
        while(end!=null){

            right=end.next;
            if(count==k){
                start=left.next;
                reverse(left,start,end,right);
                left=start;
                count=0;
            }
            count++;
            end=right;
        }
        return dummy.next;
    }
    public void reverse(ListNode left,ListNode start,ListNode end,ListNode right){
        ListNode cur=start;
        ListNode next=start.next;
        while(next!=right){
            ListNode tmp=next.next;
            next.next=cur;
            cur=next;
            next=tmp;
        }
        left.next=end;
        start.next=right;
    }
    class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
}
