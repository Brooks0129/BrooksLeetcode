package com.brooks;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_102{
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        TreeNode last=root;
        TreeNode nextLast=null;
        List<Integer> curLevel=new LinkedList<>();
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            curLevel.add(node.val);
            if(node.left!=null){
                queue.offer(node.left);
                nextLast=node.left;
            }
            if(node.right!=null){
                queue.offer(node.right);
                nextLast=node.right;
            }
            if(node==last){
                last=nextLast;
                res.add(new LinkedList<>(curLevel));
                curLevel.clear();
            }
        }
        return res;
    }
}
