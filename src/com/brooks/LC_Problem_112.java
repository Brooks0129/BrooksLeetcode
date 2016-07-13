package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_112{
    public boolean hasPathSum(TreeNode root,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null&&root.val==sum){
            return true;
        }
        if(hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val)){
            return true;
        }else{
            return false;
        }
    }
}
