package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/9.
 */
public class LC_Problem_99{
    TreeNode first=null;
    TreeNode second=null;
    TreeNode pre=new TreeNode(Integer.MIN_VALUE);
    public static void main(String[] args){
        LC_Problem_99 lc_problem_99=new LC_Problem_99();
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        lc_problem_99.recoverTree(root);
    }
    public void recoverTree(TreeNode root){

        traverse(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    private void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        if(first==null&&pre.val>=root.val){
            first=pre;
        }
        if(first!=null&&pre.val>=root.val){
            second=root;
        }
        pre=root;
        traverse(root.right);
    }
}
