package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_101{
    /**
     * judge a tree is symmetric or not
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        TreeNode cur1=root.left;
        TreeNode cur2=root.right;
        return isSymmetric(cur1,cur2);
    }
    private boolean isSymmetric(TreeNode cur1,TreeNode cur2){
        if(cur1==null&&cur2==null){
            return true;
        }else if(cur1!=null&&cur2!=null){
            if(cur1.val!=cur2.val){
                return false;
            }else{
                return isSymmetric(cur1.left,cur2.right)&&isSymmetric(cur1.right,cur2.left);
            }
        }else{
            return false;
        }
    }
}
