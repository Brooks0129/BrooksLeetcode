package com.brooks;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_173{
    class BSTIterator{
        TreeNode root;
        Stack<TreeNode> stack;
        public BSTIterator(TreeNode root){
            this.root=root;
            stack=new Stack<>();
            TreeNode cur=root;
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
        }
        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext(){
            return !stack.isEmpty();
        }
        /**
         * @return the next smallest number
         */
        public int next(){
            TreeNode treeNode=stack.pop();
            TreeNode cur=treeNode;
            if(cur.right!=null){
                cur=cur.right;
                while(cur!=null){
                    stack.push(cur);
                    cur=cur.left;
                }
            }
            return treeNode.val;
        }
    }
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
