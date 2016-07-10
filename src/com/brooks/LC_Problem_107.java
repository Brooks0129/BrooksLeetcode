package com.brooks;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_107{
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return res;
        }
        queue.offer(root);
        List<Integer> cur=new LinkedList<>();
        while(!queue.isEmpty()){
            int numLevel=queue.size();
            for(int i=0;i<numLevel;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                cur.add(node.val);
            }
            res.add(0,new LinkedList<>(cur));
            cur.clear();
        }
        return res;
    }
}
