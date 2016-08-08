package com.brooks;
import java.util.Iterator;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_284{
    // Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
    class PeekingIterator implements Iterator<Integer>{
        Integer next=null;
        Iterator<Integer> iterator;
        public PeekingIterator(Iterator<Integer> iterator){
            // initialize any member here.
            this.iterator=iterator;
            if(iterator.hasNext()){
                next=iterator.next();
            }
        }
        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek(){
            return next;
        }
        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next(){
            Integer res=next;
            if(iterator.hasNext()){
                next=iterator.next();
            }else {
                next=null;
            }
            return res;
        }
        @Override
        public boolean hasNext(){
            return next!=null;
        }
    }
}
