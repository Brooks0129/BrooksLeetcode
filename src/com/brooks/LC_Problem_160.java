package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/1.
 */
public class LC_Problem_160{
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        ListNode curA=headA;
        ListNode curB=headB;
        while(curA!=curB){
            if(curA==null){
                curA=headB;
            }else{
                curA=curA.next;
            }
            if(curB==null){
                curB=headA;
            }else{
                curB=curB.next;
            }
        }
        return curA;
    }
}
