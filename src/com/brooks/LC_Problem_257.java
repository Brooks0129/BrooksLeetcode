package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_257{
    public List<String> binaryTreePaths(TreeNode root){
        List<String> res=new ArrayList<>();
        if(root!=null)
            getPath(res,root,"");
        return res;
    }
    void getPath(List<String> res,TreeNode root,String s){
        if(root.left==null&&root.right==null){
            res.add(s+root.val);
        }
        if(root.left!=null){
            getPath(res,root.left,s+root.val+"->");
        }
        if(root.right!=null){
            getPath(res,root.right,s+root.val+"->");
        }
    }
}