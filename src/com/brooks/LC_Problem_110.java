package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_110{
    public boolean isBalanced(TreeNode root){
     if(root==null){
         return true;
     }
     return getHeight(root)!=-1;
    }
    private int getHeight(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=getHeight(node.left);
        if(left==-1){
            return -1;
        }
        int right=getHeight(node.right);
        if(right==-1){
            return -1;
        }
        if(Math.abs(left-right)<=1){
            return Math.max(left,right)+1;
        }else {
            return -1;
        }
    }
}
