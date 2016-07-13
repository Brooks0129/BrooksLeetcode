package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_116{
    public void connect(TreeLinkNode root){
       while(root!=null){
           TreeLinkNode p=root;
           while(p!=null&&p.left!=null){
               p.left.next=p.right;
               p.right.next=p.next==null?null:p.next.left;
               p=p.next;
           }
           root=root.left;
       }
    }
    class TreeLinkNode{
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x){
            val=x;
        }
    }
}
