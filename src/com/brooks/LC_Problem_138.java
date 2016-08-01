package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/1.
 */
public class LC_Problem_138{
    public RandomListNode copyRandomList(RandomListNode head){
        if(head==null){
            return null;
        }
        RandomListNode cur=head;
        RandomListNode next=head;
        while(cur!=null){
            next=cur.next;
            cur.next=new RandomListNode(cur.label);
            cur.next.next=next;
            cur=next;
        }
        cur=head;
        RandomListNode rand=null;
        while(cur!=null){
            next=cur.next.next;
            rand=cur.next;
            rand.random=cur.random==null?null:cur.random.next;
            cur=next;
        }
        RandomListNode res=head.next;
        cur=head;
        while(cur!=null){
            next=cur.next.next;
            rand=cur.next;
            cur.next=next;
            rand.next=next==null?null:next.next;
            cur=next;
        }
        return res;
    }
    class RandomListNode{
        int label;
        RandomListNode next, random;
        RandomListNode(int x){
            this.label=x;
        }
    }
}
