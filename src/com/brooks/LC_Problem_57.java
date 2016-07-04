package com.brooks;
import java.util.LinkedList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/4.
 */
public class LC_Problem_57{
    public List<Interval> insert(List<Interval> intervals,Interval newInterval) {
        List<Interval> res=new LinkedList<>();
       int index=0;
        while(index<intervals.size()&&intervals.get(index).end<newInterval.start){
            res.add(intervals.get(index));
            index++;
        }
        while(index<intervals.size()&&intervals.get(index).start<=newInterval.end){
            newInterval=new Interval(
                    Math.min(newInterval.start,intervals.get(index).start),
                    Math.max(newInterval.end,intervals.get(index).end));
            index++;
        }
        res.add(newInterval);
        while(index<intervals.size()){
            res.add(intervals.get(index++));
        }
        return res;
    }
    class Interval{
        int start;
        int end;
        Interval(){
            start=0;
            end=0;
        }
        Interval(int s,int e){
            start=s;
            end=e;
        }
    }
}
