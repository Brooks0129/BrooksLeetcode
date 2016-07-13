package com.brooks;
import java.util.Deque;
import java.util.LinkedList;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_111{
    public static void main(String[] args){
        LC_Problem_111 lc=new LC_Problem_111();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        int minDepth=lc.minDepth(root);
        System.out.println(minDepth);
    }
    public int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        Deque<TreeNode> list=new LinkedList<>();
        list.add(root);
        int level=1;
        while(!list.isEmpty()){
            int size=list.size();
            for(int i=0;i<size;i++){
                TreeNode node=list.pollFirst();
                if(node.left==null&&node.right==null){
                    return level;
                }
                if(node.left!=null){
                    list.offerLast(node.left);
                }
                if(node.right!=null){
                    list.offerLast(node.right);
                }
            }
            level++;
        }
        return level;
    }
}
