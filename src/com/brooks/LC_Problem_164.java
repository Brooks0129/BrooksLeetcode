package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_164{
    public static void main(String[] args){
        int maximumGap=maximumGap(new int[]{15252,16764,27963,7817,26155,20757,3478,22602,20404,6739,16790,10588,16521,6644,20880,15632,27078,25463,20124,15728,30042,16604,17223,4388,23646,32683,23688,12439,30630,3895,7926,22101,32406,21540,31799,3768,26679,21799,23740});
        System.out.println(maximumGap);
    }
    public static int maximumGap(int[] nums){
        if(nums==null||nums.length<2){
            return 0;
        }
        int max=nums[0];
        int min=nums[0];
        for(int num : nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        if(max==min){
            return 0;
        }
        boolean[] hasNum=new boolean[nums.length+1];
        int[] maxArray=new int[nums.length+1];
        int[] minArray=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int bucket=getBucket(nums[i],nums.length,min,max);
            minArray[bucket]=hasNum[bucket]?Math.min(minArray[bucket],nums[i]):nums[i];
            maxArray[bucket]=hasNum[bucket]?Math.max(maxArray[bucket],nums[i]):nums[i];
            hasNum[bucket]=true;
        }
        int res=0;
        int lastMax=maxArray[0];
        int index=1;
        while(index<=nums.length){
            if(hasNum[index]){
                res=Math.max(res,minArray[index]-lastMax);
                lastMax=maxArray[index];
            }
            index++;
        }
        return res;
    }
    /**
     * 注意(num-min)*length/(max-min)与(num-min)/(max-min)*length的写法结果是不同的
     * @param num
     * @param length
     * @param min
     * @param max
     * @return
     */
    private static int getBucket(long num,long length,long min,long max){
        return (int)((num-min)*length/(max-min));
    }
}
