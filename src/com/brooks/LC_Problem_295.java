package com.brooks;
import java.util.Collections;
import java.util.PriorityQueue;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_295{
    public class MedianFinder{
        private PriorityQueue<Integer> small=new PriorityQueue<>(Collections.reverseOrder());
        private PriorityQueue<Integer> large=new PriorityQueue<>();
        private boolean isEven=true;
        // Adds a number into the data structure.
        public void addNum(int num){
            if(isEven){
                large.offer(num);
                small.offer(large.poll());
            }else{
                small.offer(num);
                large.offer(small.poll());
            }
        }
        // Returns the median of current data stream
        public double findMedian(){
            if(isEven){
                return (small.peek()+large.peek())>>>1;
            }else {
                return small.peek();
            }
        }
    }
    ;
// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
}
