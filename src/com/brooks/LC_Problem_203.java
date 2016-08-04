package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_203{
    public ListNode removeElements(ListNode head,int val){
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
                cur=pre.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}
