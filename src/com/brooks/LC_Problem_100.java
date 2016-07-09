package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/9.
 */
public class LC_Problem_100{
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }else if(p!=null&&q!=null){
            if(p.val!=q.val){
                return false;
            }else {
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
            }
        }else{
            return false;
        }
    }
}
