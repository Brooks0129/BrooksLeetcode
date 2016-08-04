package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_199{
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res=new ArrayList<>();
        getRight(res,0,root);
        return res;
    }
    private void getRight(List<Integer> res,int level,TreeNode root){
        if(root==null){
            return;
        }
        if(level==res.size()){
            res.add(root.val);
        }
        getRight(res,level+1,root.right);
        getRight(res,level+1,root.left);
    }
}
