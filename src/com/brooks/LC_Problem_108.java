package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_108{
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums==null){
            return null;
        }
        return array2BST(nums,0,nums.length-1);
    }
    private TreeNode array2BST(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)>>1;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=array2BST(nums,start,mid-1);
        node.right=array2BST(nums,mid+1,end);
        return node;
    }
}
