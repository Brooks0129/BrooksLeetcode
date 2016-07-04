package com.brooks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/4.
 */
public class LC_Problem_56{
    public List<Interval> merge(List<Interval> intervals){
        if(intervals==null||intervals.size()==0){
            return intervals;
        }
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval o1,Interval o2){
                return o1.start-o2.start==0?(o1.end-o2.end):o1.start-o2.start;
            }
        });
        List<Interval> res=new ArrayList<>();
        int left=intervals.get(0).start;
        int right=intervals.get(0).end;
        for(Interval interval : intervals){
            if(right>=interval.start){
                right=Math.max(right,interval.end);
            }else{
                res.add(new Interval(left,right));
                left=interval.start;
                right=interval.end;
            }
        }
        res.add(new Interval(left,right));
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
