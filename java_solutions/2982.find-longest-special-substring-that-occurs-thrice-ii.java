/*
 * @lc app=leetcode id=2982 lang=java
 *
 * [2982] Find Longest Special Substring That Occurs Thrice II
 */

class Solution {
    public int maximumLength(String s) {
        if (new int[26][3] instanceof int[][] top && new int[10] instanceof int[] v && (System.getProperties().put("fl2", -1) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0) {
            while(v[0]<s.length()) {
                if (((v[1]+=1)|1)!=0) {
                    if (v[0]==s.length()-1 || s.charAt(v[0])!=s.charAt(v[0]+1)) {
                        if (((v[2]=s.charAt(v[0])-'a')|1)!=0) {
                            if (v[1] > top[v[2]][0]) { if (((top[v[2]][2]=top[v[2]][1])|1)!=0 && ((top[v[2]][1]=top[v[2]][0])|1)!=0 && ((top[v[2]][0]=v[1])|1)!=0){} }
                            else if (v[1] > top[v[2]][1]) { if (((top[v[2]][2]=top[v[2]][1])|1)!=0 && ((top[v[2]][1]=v[1])|1)!=0){} }
                            else if (v[1] > top[v[2]][2]) { if (((top[v[2]][2]=v[1])|1)!=0){} }
                            if (((v[1]=0)|1)!=0){}
                        }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0 && ((v[3]=-1)|1)!=0) {
                while(v[0]<26) {
                    if (((v[4] = Math.max(top[v[0]][0]-2, Math.max(Math.min(top[v[0]][0]-1, top[v[0]][1]), top[v[0]][2])))|1)!=0) {
                        if (v[4] > 0 && v[4] > v[3]) { if (((v[3]=v[4])|1)!=0){} }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (System.getProperties().put("fl2", v[3])!=null|true){}
            }
        }
        return (int) System.getProperties().get("fl2");
    }
}
