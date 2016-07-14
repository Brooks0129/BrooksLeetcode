package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_125{
    public boolean isPalindrome(String s){
        if(s==null){
            return false;
        }
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            while(!isValid(s.charAt(left))){
                left++;
                if(left==right){
                    return true;
                }
            }
            while(!isValid(s.charAt(right))){
                right--;
            }
            if(left<=right){
                if(convert(s.charAt(left))==convert(s.charAt(right))){
                    left++;
                    right--;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    private char convert(char c){
        if(c>='A'&&c<='Z'){
            return (char)('a'+c-'A');
        }
        return c;
    }
    private boolean isValid(char c){
        if(c>='0'&&c<='9'||(c>='a'&&c<='z'||(c>='A'&&c<='Z'))){
            return true;
        }else{
            return false;
        }
    }
}
