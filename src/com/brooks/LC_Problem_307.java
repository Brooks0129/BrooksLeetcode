package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_307{
    class NumArray{
        int[] BIT;
        int[] nums;
        public NumArray(int[] nums){
            BIT=new int[nums.length+1];
            this.nums=nums;
            for(int i=0;i<nums.length;i++){
                init(i,nums[i]);
            }
        }
        private void init(int i,int val){
            i++;
            while(i<=nums.length){
                BIT[i]+=val;
                i+=(i&-i);
            }
        }
        void update(int i,int val){
            int dif=val-nums[i];
            nums[i]=val;
            init(i,dif);
        }
        private int getSum(int i){
            int sum=0;
            i++;
            while(i>0){
                sum+=BIT[i];
                i-=(i&-i);
            }
            return sum;
        }
        public int sumRange(int i,int j){
            return getSum(j)-getSum(i-1);
        }
    }
}
