package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_237{
    public void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
