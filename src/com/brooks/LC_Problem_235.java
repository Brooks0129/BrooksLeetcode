package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_235{
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        while((root.val-p.val)*(root.val-q.val)>0){
            root=p.val<root.val?root.left:root.right;
        }
        return root;
    }
}
