package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_105{
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null){
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(map,preorder,0,preorder.length-1,inorder,0,preorder.length-1);
    }
    private TreeNode build(HashMap<Integer, Integer> map,int[] preorder,int p1,int p2,
                           int[] inorder,int i1,int i2){
        if(p1>p2){
            return null;
        }
        TreeNode node=new TreeNode(preorder[p1]);
        int index=map.get(preorder[p1]);
        node.left=build(map,preorder,p1+1,p1+index-i1,inorder,i1,index-1);
        node.right=build(map,preorder,p1+index-i1+1,p2,inorder,index+1,i2);
        return node;
    }
}
