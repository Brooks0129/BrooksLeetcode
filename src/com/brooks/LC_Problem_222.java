package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_222{
    public int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        return bs(root,1,mostLeftLevel(root,1));
    }
    private int bs(TreeNode root,int level,int h){
        if(level==h){
            return 1;
        }
        if(mostLeftLevel(root.right,level+1)==h){
            return (1<<(h-level))+bs(root.right,level+1,h);
        }else{
            return (1<<(h-level-1))+bs(root.left,level+1,h);
        }
    }
    private int mostLeftLevel(TreeNode node,int level){
        while(node!=null){
            level++;
            node=node.left;
        }
        return level-1;
    }
    /**int height(TreeNode root) {
     return root == null ? -1 : 1 + height(root.left);
     }
     public int countNodes(TreeNode root) {
     int h = height(root);
     return h < 0 ? 0 :
     height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
     : (1 << h-1) + countNodes(root.left);
     }
     */
}
