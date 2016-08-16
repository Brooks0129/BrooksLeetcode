package com.brooks;

/**
 * @author: lisongda
 * @date: 16/8/15
 */
public class LC_Problem_316 {
    public static void main(String[] args) {
        String s = new LC_Problem_316().removeDuplicateLetters("ceaac");
        System.out.println(s);
    }

    public String removeDuplicateLetters(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            if (--map[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }
        return s.length()==0?"":s.charAt(pos)+removeDuplicateLetters(s.substring(pos+1).replaceAll(s.charAt(pos)+"",""));
    }
}
