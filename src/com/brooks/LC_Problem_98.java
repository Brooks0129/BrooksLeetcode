package com.brooks;
import java.util.LinkedList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/9.
 */
public class LC_Problem_98{
    public boolean isValidBST(TreeNode root){
        List<Integer> list=new LinkedList<>();
        traverse(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    private void traverse(TreeNode root,List<Integer> list){
        if(root==null){
            return ;

        }
        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);
    }
}
