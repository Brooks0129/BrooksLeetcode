package com.brooks;
import java.util.HashSet;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_127{
/*    public static void main(String[] args){
        String beginWord="hit";
        String endWord="cog";
        Set<String> wordList=new HashSet<>();
        wordList.add("hot");
        wordList.add("hot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        int len=ladderLength(beginWord,endWord,wordList);
        System.out.println(len);
    }*/
    public  int ladderLength(String beginWord,String endWord,Set<String> wordList){
        Set<String> start=new HashSet<>();
        Set<String> end=new HashSet<>();
        Set<String> visited=new HashSet<>();
        int len=1;
        start.add(beginWord);
        end.add(endWord);
        while(!start.isEmpty()&&!end.isEmpty()){
            if(start.size()>end.size()){
                Set<String> set=start;
                start=end;
                end=set;
            }
            Set<String> temp=new HashSet<>();
            for(String s : start){
                char[] chars=s.toCharArray();
                for(int i=0;i<chars.length;i++){
                    for(char j='a';j<'z';j++){
                        char old=chars[i];
                        chars[i]=j;
                        String ss=String.valueOf(chars);
                        if(end.contains(ss)){
                            return len+1;
                        }
                        if(!visited.contains(ss)&&wordList.contains(ss)){
                            visited.add(ss);
                            temp.add(ss);
                        }
                        chars[i]=old;
                    }
                }
            }
            start=temp;
            len++;
        }
        return 0;
    }
}
