package com.brooks;


/**
 * @author: 李松达
 * @date: 2016/7/6.
 */
public class LC_Problem_80{
    public static void main(String[] args){
        LC_Problem_80 lc_problem_80=new LC_Problem_80();
        int removeDuplicates=lc_problem_80.removeDuplicates(new int[]{1,1,1,2,3,3,3,4});
        System.out.println(removeDuplicates);
    }
    public int removeDuplicates(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int len=0;
        int ele=nums[0];
        int time=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                if(time<2){
                    nums[len++]=nums[i];
                    time++;
                }else {
                    time++;
                }
            }else{
                ele=nums[i];
                nums[len++]=nums[i];
                time=1;
            }
        }
        return len;
    }
}
