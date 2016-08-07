package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_230{
    int count=0;
    int res;
    public int kthSmallest(TreeNode root,int k){
        traversal(root,k);
        return res;
    }
    private void traversal(TreeNode root,int k){
        if(root==null){
            return;
        }
        traversal(root.left,k);
        count++;
        if(count==k){
            res=root.val;
        }
        traversal(root.right,k);
    }
}
