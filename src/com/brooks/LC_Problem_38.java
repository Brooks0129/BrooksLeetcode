package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_38{
    public String countAndSay(int n){
        StringBuilder cur=new StringBuilder("1");
        StringBuilder pre=new StringBuilder();
        for(int i=1;i<n;i++){
            pre=cur;
            pre.append('#');
            cur=new StringBuilder();
            int j=0;
            int count=1;
            while(j<pre.length()-1){
                if(pre.charAt(j)==pre.charAt(j+1)){
                    count++;
                    j++;
                }else{
                    cur.append(count);
                    cur.append(pre.charAt(j));
                    count=1;
                    j++;
                }
            }
            // System.out.println(cur.toString());
        }
        return cur.toString();
    }
}
