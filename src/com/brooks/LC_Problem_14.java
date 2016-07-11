package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_14{
    public String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0||strs[0].length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            boolean flag=false;
            int j=1;
            for(;j<strs.length;j++){
                if(strs[j].length()<=i||strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }else{
                sb.append(strs[0].charAt(i));
            }
        }

        return sb.toString();
    }
}
