package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_106{
    public TreeNode buildTree(int[] inorder,int[] postorder){
        if(inorder==null||postorder==null){
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(map,inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    private TreeNode build(HashMap<Integer,Integer> map,int[] inorder,int i1,int i2,
                           int[] postorder,int p1,int p2){
        if(p1>p2){
            return null;
        }
        TreeNode node=new TreeNode(postorder[p2]);
        int index=map.get(postorder[p2]);
        node.left=build(map,inorder,i1,index-1,postorder,p1,p1+index-i1-1);
        node.right=build(map,inorder,index+1,i2,postorder,p1+index-i1,p2-1);
        return node;
    }
}
