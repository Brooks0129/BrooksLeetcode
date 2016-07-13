package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_68{
    public List<String> fullJustify(String[] words,int maxWidth){
        List<String> res=new ArrayList<>();
        for(int left=0, right;left<words.length;left=right){
            int len=-1;
            for(right=left;
                right<words.length&&len+words[right].length()+1<=maxWidth;right++){
                len+=words[right].length()+1;
            }
            StringBuffer sb=new StringBuffer(words[left]);
            int space=1;
            int extra=0;
            if(right!=left+1&&right!=words.length){
                space=(maxWidth-len)/(right-1-left)+1;
                extra=(maxWidth-len)%(right-1-left);
            }
            for(int i=left+1;i<right;i++){
                for(int j=0;j<space;j++){
                    sb.append(" ");
                }
                if(extra-->0){
                    sb.append(" ");
                }
                sb.append(words[i]);
            }
            int strLen=maxWidth-sb.length();
            while(strLen-->0){
                sb.append(" ");
            }
            res.add(sb.toString());
        }
        return res;
    }
}
