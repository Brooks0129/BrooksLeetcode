package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_129{
    public int sumNumbers(TreeNode root){
        return sum(root,0);
    }
    private int sum(TreeNode node,int i){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            return i*10+node.val;
        }
        return sum(node.left,i*10+node.val)+sum(node.right,i*10+node.val);
    }
}
