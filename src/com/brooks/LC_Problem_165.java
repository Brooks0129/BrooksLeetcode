package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_165{
    public int compareVersion(String version1,String version2){
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int len=Math.max(v1.length,v2.length);
        int index=0;
        while(index<len){
            int i1=index<v1.length?Integer.parseInt(v1[index]):0;
            int i2=index<v2.length?Integer.parseInt(v2[index]):0;
            if(i1!=i2){
                return i1>i2?1:-1;
            }
            index++;
        }
        return 0;
    }
}
