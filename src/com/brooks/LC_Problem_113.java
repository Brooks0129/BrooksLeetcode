package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_113{
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        getPath(res,sum,new ArrayList<>(),root);
        return res;
    }
    private void getPath(List<List<Integer>> res,int sum,List<Integer> path,TreeNode root){
        if(root.left==null&&root.right==null&&root.val==sum){
            path.add(root.val);
            res.add(new ArrayList<>(path));
        }
        path.add(root.val);
        if(root.left!=null)
            getPath(res,sum-root.val,new ArrayList<>(path),root.left);
        if(root.right!=null)
            getPath(res,sum-root.val,new ArrayList<>(path),root.right);
    }
}
