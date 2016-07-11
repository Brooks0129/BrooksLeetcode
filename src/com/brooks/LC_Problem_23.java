package com.brooks;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_23{
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null||lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> pq=new PriorityQueue<>(lists.length,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        for(ListNode node : lists){
            if(node!=null){
                pq.add(node);
            }
        }
        while(!pq.isEmpty()){
            cur.next=pq.poll();
            cur=cur.next;
            if(cur.next!=null){
                pq.add(cur.next);
            }
        }
        return dummy.next;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
}