package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_114{
    TreeNode pre=null;
    public void flatten(TreeNode root){
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        root.left=null;
        pre=root;
    }
}
