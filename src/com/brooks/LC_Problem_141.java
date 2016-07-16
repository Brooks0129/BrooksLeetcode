package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_141{
    public boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
