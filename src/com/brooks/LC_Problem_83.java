package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/7 10:07.
 * @description:
 */
public class LC_Problem_83{
    public static void main(String[] args){
        LC_Problem_83 lc_problem_83=new LC_Problem_83();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        ListNode listNode=lc_problem_83.deleteDuplicates(head);
    }

    public ListNode deleteDuplicates(ListNode head){
        if(head==null){
            return null;
        }
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val!=pre.val){
                pre.next=cur;
                pre=pre.next;
            }
            cur=cur.next;
        }
        pre.next=cur;
        return head;
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
}