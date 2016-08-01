package com.brooks;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/8/1.
 */
public class LC_Problem_145{
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        List<Integer> list=new LC_Problem_145().postorderTraversal(root);
        System.out.println(list.toString());
    }
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode node=stack1.pop();
            stack2.add(node.val);
            if(node.left!=null){
                stack1.push(node.left);
            }
            if(node.right!=null){
                stack1.push(node.right);
            }
        }
        while(!stack2.isEmpty()){
            res.add(stack2.pop());
        }
       // res.addAll(stack2);
        return res;
    }
}
