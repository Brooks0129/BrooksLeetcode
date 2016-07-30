package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_234{
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        boolean b=isPalindrome(head);
        System.out.println(b);
    }
    public static boolean isPalindrome(ListNode head){
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=slow.next;
        ListNode newHead=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=newHead;
            newHead=slow;
            slow=next;
        }
        while(newHead!=null){
            if(newHead.val!=head.val){
                return false;
            }
            newHead=newHead.next;
            head=head.next;
        }
        return true;
    }
}
