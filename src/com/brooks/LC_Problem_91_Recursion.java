package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/8.
 */
public class LC_Problem_91_Recursion{
    public static void main(String[] args){
        LC_Problem_91_Recursion lc_problem_91=new LC_Problem_91_Recursion();
        int i=lc_problem_91.numDecodings("1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565");
        System.out.println(i);
    }
    /**
     * 递归版本
     * Time Limit Exceeded
     * @param s
     * @return
     */
    public int numDecodings(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int[] res=new int[1];
        char[] chars=s.toCharArray();
        getWays(res,chars,0);
        return res[0];
    }
    private void getWays(int[] res,char[] chars,int index){
        if(index>=chars.length){
            res[0]++;
            return;
        }
        if(chars[index]>='1'&&chars[index]<='9'){
            getWays(res,chars,index+1);
        }
        if(index<chars.length-1
                &&((chars[index]=='1'&&chars[index+1]>='0'&&chars[index+1]<='9')
                ||chars[index]=='2'&&chars[index+1]>='0'&&chars[index+1]<='6')){
            getWays(res,chars,index+2);
        }
    }
}
