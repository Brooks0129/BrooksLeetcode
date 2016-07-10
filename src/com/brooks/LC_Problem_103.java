package com.brooks;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_103{
/*    public static void main(String[] args){
        LC_Problem_103 lc_problem_103=new LC_Problem_103();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        List<List<Integer>> lists=lc_problem_103.zigzagLevelOrder(root);
        System.out.println(lists);
    }*/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        Deque<TreeNode> deque=new LinkedList<>();
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        boolean l2r=true;
        TreeNode last=root;
        TreeNode nextLast=null;
        deque.offer(root);
        List<Integer> cur=new LinkedList<>();
        while(!deque.isEmpty()){
            TreeNode node;
            if(l2r){
                node=deque.pollFirst();
                cur.add(node.val);
                if(node.left!=null){
                    deque.offerLast(node.left);
                    nextLast=nextLast==null?node.left:nextLast;
                }
                if(node.right!=null){
                    deque.offerLast(node.right);
                    nextLast=nextLast==null?node.right:nextLast;
                }
            }else{
                node=deque.pollLast();
                cur.add(node.val);
                if(node.right!=null){
                    deque.offerFirst(node.right);
                    nextLast=nextLast==null?node.right:nextLast;
                }
                if(node.left!=null){
                    deque.offerFirst(node.left);
                    nextLast=nextLast==null?node.left:nextLast;
                }
            }
            if(node==last){
                l2r=!l2r;
                last=nextLast;
                nextLast=null;
                res.add(new LinkedList<>(cur));
                cur.clear();
            }
        }
        return res;
    }
}
