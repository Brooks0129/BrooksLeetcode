package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/15.
 */
public class LC_Problem_241{
    public List<Integer> diffWaysToCompute(String input){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                String left=input.substring(0,i);
                String right=input.substring(i+1);
                List<Integer> leftList=diffWaysToCompute(left);
                List<Integer> rightLeft=diffWaysToCompute(right);
                for(int l : leftList){
                    for(int r : rightLeft){
                        switch(c){
                            case '+':
                                res.add(l+r);
                                break;
                            case '-':
                                res.add(l-r);
                                break;
                            case '*':
                                res.add(l*r);
                        }
                    }
                }
            }
        }
        if(res.size()==0){
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}
