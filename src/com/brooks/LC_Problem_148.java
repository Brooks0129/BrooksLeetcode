package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_148{
    public ListNode sortList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode right=mid.next;
        mid.next=null;
        return merge(sortList(head),sortList(right));
    }
    private ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(head1!=null&&head2!=null){
            if(head1.val>=head2.val){
                cur.next=head2;
                head2=head2.next;
            }else{
                cur.next=head1;
                head1=head1.next;
            }
            cur=cur.next;
        }
        if(head1!=null){
            cur.next=head1;
        }else if(head2!=null){
            cur.next=head2;
        }
        return dummy.next;
    }
    private ListNode getMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
