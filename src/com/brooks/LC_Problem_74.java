package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/6.
 */
public class LC_Problem_74{
    public boolean searchMatrix(int[][] matrix,int target){
        int row=findTargetRow(matrix,target);
        if(row>=matrix.length){
            return false;
        }
       return findTargetCol(matrix[row],target);
    }
    private boolean findTargetCol(int[] ints,int target){
        int left=0;
        int right=ints.length-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(ints[mid]==target){
               return true;
            }else if(ints[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return false;
    }
    private int findTargetRow(int[][] matrix,int target){
        int top=0;
        int below=matrix.length-1;
        int rowLen=matrix[0].length-1;
        while(top<=below){
            int mid=(top+below)>>1;
            if(matrix[mid][rowLen]>=target&&(mid==0||matrix[mid-1][rowLen]<target)){
                return mid;
            }else if(matrix[mid][rowLen]<target){
                top=mid+1;
            }else {
                below=mid-1;
            }
        }
        return top;
    }
}
