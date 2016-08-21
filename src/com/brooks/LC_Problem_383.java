package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/21.
 */
public class LC_Problem_383{
    public boolean canConstruct(String ransomNote,String magazine){
        int[] map=new int[26];
        for(char mc : magazine.toCharArray()){
            map[mc-'a']++;
        }
        for(char rc : ransomNote.toCharArray()){
            if(map[rc-'a']>0){
                map[rc-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}
