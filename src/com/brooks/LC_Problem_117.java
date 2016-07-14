package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_117{
    public void connect(TreeLinkNode root){
        TreeLinkNode head=root;
        TreeLinkNode cur=null;
        TreeLinkNode pre=null;
        while(head!=null){
            cur=head;
            head=null;
            pre=null;
            while(cur!=null){
                if(cur.left!=null){
                    if(pre!=null){
                        pre.next=cur.left;
                    }else{
                        head=cur.left;
                    }
                    pre=cur.left;
                }
                if(cur.right!=null){
                    if(pre!=null){
                        pre.next=cur.right;
                    }else{
                        head=cur.right;
                    }
                    pre=cur.right;
                }
                cur=cur.next;
            }
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
