package com.brooks;
<<<<<<< HEAD

/**
 * @author: 李松达
 * @time: 2016/7/7 8:54.
 * @description:
 */
public class LC_Problem_81{
	public boolean search(int[] nums, int target) {
        if (nums==null||nums.length==0) {
        	return false;
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
        	int mid=(left+right)>>1;
        	if (nums[mid]==target) {
        		return true;
        	}
        	if (nums[mid]>nums[right]) {
        		if (target>=nums[left]&&target<nums[mid]) {
        			right=mid-1;
        		}else {
        			left=mid+1;
        		}
        	}else if (nums[mid]<nums[right]) {
        		if (target>nums[mid]&&target<=nums[right]) {
        			left=mid+1;
        		}else {
        			right=mid-1;
        		}
        	}else {
        		right--;
        	}

        }
        return nums[left]==target;
    }
}
=======
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
>>>>>>> edeae9a381bbefedf9b0bc4f9ffe5347bb66a661
