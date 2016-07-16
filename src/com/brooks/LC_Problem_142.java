package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_142{
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                fast=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
