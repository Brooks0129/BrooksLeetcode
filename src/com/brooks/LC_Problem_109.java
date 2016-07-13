package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_109{
    ListNode head;
    public static void main(String[] args){
        LC_Problem_109 lc_problem_109=new LC_Problem_109();
        ListNode head=new ListNode(3);
        head.next=new ListNode(5);
        head.next.next=new ListNode(8);
        TreeNode node=lc_problem_109.sortedListToBST(head);
    }
    public TreeNode sortedListToBST(ListNode head){
        this.head=head;
        int len=getLen(head);
        if(len==0){
            return null;
        }
        return inOrderHelper(0,len-1);
    }
    private TreeNode inOrderHelper(int left,int end){
        if(left>end){
            return null;
        }
        int mid=left+(end-left)/2;
        TreeNode leftNode=inOrderHelper(left,mid-1);
        TreeNode node=new TreeNode(head.val);
        node.left=leftNode;
        head=head.next;
        TreeNode rightNode=inOrderHelper(mid+1,end);
        node.right=rightNode;
        return node;
    }
    private int getLen(ListNode head){
        ListNode cur=head;
        int len=0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        return len;
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
        class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x){
                val=x;
            }
        }
    }
}
