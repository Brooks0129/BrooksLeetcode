package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_222{
    public int computeArea(int A,int B,int C,int D,int E,int F,int G,int H){
        int a=Math.min(A,E);
        int e=a==A?E:A;
        int c=a==A?C:G;
        int g=a==A?G:C;
        int x=0;
        int cross;
        if(e>=c){
            x=0;
        }else if(g>=c){
            x=c-e;
        }else{
            x=g-e;
        }
        int b=Math.min(B,F);
        int f=b==B?F:B;
        int d=b==B?D:H;
        int h=b==B?H:D;
        int y=0;
        if(f>=d){
            y=0;
        }else if(h>=d){
            y=d-f;
        }else{
            y=h-f;
        }
        cross=x*y;
        return (C-A)*(D-B)+(G-E)*(H-F)-cross;
    }
    /**
     *     int left = max(A,E), right = max(min(C,G), left);
     int bottom = max(B,F), top = max(min(D,H), bottom);
     return (C-A)*(D-B) - (right-left)*(top-bottom) + (G-E)*(H-F);
     */
}
