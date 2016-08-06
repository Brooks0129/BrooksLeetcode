package com.brooks;
import java.util.PriorityQueue;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_215{
    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int num : nums){
            queue.offer(num);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
