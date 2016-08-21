package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/21.
 */
public class LC_Problem_345{
    public static void main(String[] args){
        String s=new LC_Problem_345().reverseVowels("hello");
        System.out.println(s);
    }
    public String reverseVowels(String s){
        char[] chars=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j&&!isVowel(chars[i])){
                i++;
            }
            while(i<j&&!isVowel(chars[j])){
                j--;
            }
            if(i<j&&isVowel(chars[i])&&isVowel(chars[j])){
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
                ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
