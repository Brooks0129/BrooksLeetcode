package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/8/5.
 */
public class LC_Problem_212{
    public List<String> findWords(char[][] board,String[] words){
        List<String> res=new ArrayList<>();
        TrieNode root=buildTrie(words);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(res,board,i,j,root);
            }
        }
        return res;
    }
    private void dfs(List<String> res,char[][] board,int i,int j,TrieNode node){
        char c=board[i][j];
        if(c=='$'||node.children[c-'a']==null){
            return;
        }
        node=node.children[c-'a'];
        if(node.word!=null){
            res.add(node.word);
            node.word=null;
        }
        board[i][j]='$';
        if(i>0) dfs(res,board,i-1,j,node);
        if(i<board.length-1) dfs(res,board,i+1,j,node);
        if(j>0) dfs(res,board,i,j-1,node);
        if(j<board[0].length-1) dfs(res,board,i,j+1,node);
        board[i][j]=c;
    }
    private TrieNode buildTrie(String[] words){
        TrieNode root=new TrieNode();
        for(String word : words){
            char[] chars=word.toCharArray();
            TrieNode node=root;
            for(char c : chars){
                if(node.children[c-'a']==null){
                    node.children[c-'a']=new TrieNode();
                }
                node=node.children[c-'a'];
            }
            node.word=word;
        }
        return root;
    }
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        String word;
    }
}
