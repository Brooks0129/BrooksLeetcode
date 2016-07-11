package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_12{
    public String intToRoman(int num){
        String[][] ss={{"","M","MM","MMM"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","I","II","III","IV","V","VI","VII","VIII","IX"}};
        StringBuilder sb=new StringBuilder();
        return sb.append(ss[0][num/1000])
                .append(ss[1][num/100%10])
                .append(ss[2][num/10%10])
                .append(ss[3][num%10]).toString();
    }
}
