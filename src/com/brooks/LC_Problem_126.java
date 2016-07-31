package com.brooks;
import java.util.*;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_126{
    List<String> linkedList=new LinkedList<>();
    List<List<String>> res;
    Map<String,List<String>> map;
    public List<List<String>> findLadders(String beginWord,String endWord,Set<String> wordList){
        res=new ArrayList<>();
        if(wordList.size()==0){
            return res;
        }
        map=new HashMap<>();
        Set<String> visited=new HashSet<>();
        Set<String> unvisited=new HashSet<>(wordList);
        int cur=1;
        int next=0;
        boolean found=false;
        Queue<String> queue=new LinkedList<>();
        queue.add(beginWord);
        visited.add(beginWord);
        unvisited.add(endWord);
        unvisited.remove(beginWord);
        while(!queue.isEmpty()){
            String s=queue.poll();
            cur--;
            for(int i=0;i<s.length();i++){
                StringBuffer sb=new StringBuffer(s);
                for(char c='a';c<='z';c++){
                    sb.setCharAt(i,c);
                    String s1=sb.toString();
                    if(unvisited.contains(s1)){
                        if(visited.add(s1)){
                            next++;
                            queue.add(s1);
                        }
                        if(map.containsKey(s1)){
                            map.get(s1).add(s);
                        }else{
                            List<String> list=new LinkedList<>();
                            list.add(s);
                            map.put(s1,list);
                        }
                        if(s1.equals(endWord)&&!found){
                            found=true;
                        }
                    }
                }
            }
            if(cur==0){
                if(found){
                    break;
                }
                cur=next;
                next=0;
                unvisited.removeAll(visited);
                visited.clear();
            }
        }
        backTrace(endWord,beginWord);
        return res;
    }
    private void backTrace(String endWord,String beginWord){
        if(endWord.equals(beginWord)){
            linkedList.add(0,beginWord);
            res.add(new LinkedList<>(linkedList));
            linkedList.remove(0);
            return;
        }
        linkedList.add(0,endWord);
        if(map.containsKey(endWord)){
            for(String s : map.get(endWord)){
                backTrace(s,beginWord);
            }
        }
        linkedList.remove(0);
    }
}
