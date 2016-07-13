package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_95{
    public static void main(String[] args){
        LC_Problem_95 lc=new LC_Problem_95();
        List<TreeNode> treeNodes=lc.generateTrees(3);
    }
    public List<TreeNode> generateTrees(int n){
        List<TreeNode> ans=new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        return generate(1,n);
    }
    private List<TreeNode> generate(int start,int end){
        List<TreeNode> res=new ArrayList<>();
        if(start>end){
            res.add(null);
            return res;
        }
        List<TreeNode> leftTree;
        List<TreeNode> rightTree;
        for(int i=start;i<=end;i++){
            leftTree=generate(start,i-1);
            rightTree=generate(i+1,end);
            for(TreeNode left : leftTree){
                for(TreeNode right : rightTree){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
