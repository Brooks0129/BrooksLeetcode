package com.brooks.otherProblems;
/**
 * @author: 李松达
 * @date: 2016/7/28.
 * @description: 快速排序
 */
public class LinkedList_QuickSort{
    public ListNode sortList(ListNode head){
        return quickSort(head,null);
    }
    private ListNode quickSort(ListNode head,ListNode end){
        if(head!=end){
            ListNode cur=partion(head,end);
            quickSort(head,cur);
            quickSort(cur.next,end);
        }
        return head;
    }
    private ListNode partion(ListNode head,ListNode end){
        int key=head.val;
        ListNode p=head;
        ListNode q=head.next;
        while(q!=end){
            if(q.val<key){
                p=p.next;
                swap(p,q);
            }
            q=q.next;
        }
        swap(head,p);
        return p;
    }
    private void swap(ListNode p,ListNode q){
        int temp=p.val;
        p.val=q.val;
        q.val=temp;
    }
}
