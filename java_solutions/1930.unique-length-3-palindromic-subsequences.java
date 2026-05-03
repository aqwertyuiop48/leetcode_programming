/*
 * @lc app=leetcode id=1930 lang=java
 *
 * [1930] Unique Length-3 Palindromic Subsequences
 */

class Solution {
    public int countPalindromicSubsequence(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cps", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0]<26) {
                if (((v[1]=s.indexOf(v[0]+'a'))|1)!=0 && ((v[2]=s.lastIndexOf(v[0]+'a'))|1)!=0 && v[1]!=-1 && v[2]!=-1 && v[1]<v[2]) {
                    if (s.substring(v[1]+1, v[2]).chars().distinct().count() instanceof long c && ((v[3]+=c)|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("cps", v[3])!=null|true){}
        }
        return (int) System.getProperties().get("cps");
    }
}
