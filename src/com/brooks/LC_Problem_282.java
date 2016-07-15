package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/15.
 */
public class LC_Problem_282{
    public static void main(String[] args){
        LC_Problem_282 lc_problem_282=new LC_Problem_282();
        List<String> strings=lc_problem_282.addOperators("123",6);
        for(String s : strings){
            System.out.println(s);
        }
    }
    public List<String> addOperators(String num,int target){
        List<String> res=new ArrayList<>();
        if(num==null||num.length()==0){
            return res;
        }
        helper(res,num,"",target,0,0,0);
        return res;
    }
    private void helper(List<String> res,String num,
                        String path,int target,int index,long cur,long pre){
        if(index==num.length()){
            if(target==cur){
                res.add(path);
            }
        }
        for(int i=index;i<num.length();i++){
            if(i!=index&&num.charAt(i)=='0'){
                break;
            }
            long l=Long.parseLong(num.substring(index,i+1));
            if(index==0){
                helper(res,num,path+l,target,i+1,l,l);
            }else{
                helper(res,num,path+"+"+l,target,i+1,cur+l,l);
                helper(res,num,path+"-"+l,target,i+1,cur-l,-l);
                helper(res,num,path+"*"+l,target,i+1,cur-pre+pre*l,pre*l);
            }
        }
    }
}
