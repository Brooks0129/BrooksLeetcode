package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_124{
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        calMax(root);
        return max;
    }
    private int calMax(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,calMax(root.left));
        int right=Math.max(0,calMax(root.right));
        max=Math.max(max,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
