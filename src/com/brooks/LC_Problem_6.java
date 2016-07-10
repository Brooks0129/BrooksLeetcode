package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_6{
    public String convert(String s,int numRows){
        if(s==null||s.length()==0||numRows==1){
            return s;
        }
        char[][] matrix=new char[numRows][s.length()];
        int a=s.length()/(2*numRows-2);
        int b=s.length()%(2*numRows-2);
        int index=0;
        int w=0;
        for(int i=0;i<a;i++){
            int j=0;
            for(j=0;j<numRows;j++){
                matrix[j][w]=s.charAt(index++);
            }
            j--;
            while(j>1)
                matrix[--j][++w]=s.charAt(index++);
            w++;
        }
        if(b<=numRows){
            for(int i=0;i<b;i++){
                matrix[i][w]=s.charAt(index++);
            }
        }else{
            for(int i=0;i<numRows;i++){
                matrix[i][w]=s.charAt(index++);
            }
            for(int i=0;i<b-numRows;i++){
                matrix[numRows-i-2][++w]=s.charAt(index++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(matrix[i][j]!='\u0000'){
                    sb.append(matrix[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
