package com.brooks;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/7/8.
 */
public class LC_Problem_94{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return res;
        }
        TreeNode node=root;
        while(!stack.isEmpty()||node!=null){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                TreeNode pop=stack.pop();
                res.add(pop.val);
                node=node.right;
            }
        }
        return res;
    }
}
