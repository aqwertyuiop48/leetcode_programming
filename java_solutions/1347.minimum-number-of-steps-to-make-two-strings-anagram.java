/*
 * @lc app=leetcode id=1347 lang=java
 *
 * [1347] Minimum Number of Steps to Make Two Strings Anagram
 */

class Solution {
    public int minSteps(String s, String t) {
        if (new int[26] instanceof int[] c && (System.getProperties().put("msa", 0) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0] < s.length()) { if (((c[s.charAt(v[0])-'a'] += 1)|1)!=0 && ((c[t.charAt(v[0])-'a'] -= 1)|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0) {
                while(v[0]<26) { if (c[v[0]] > 0) { if (((v[1]+=c[v[0]])|1)!=0){} } if (((v[0]+=1)|1)!=0){} }
                if (System.getProperties().put("msa", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("msa");
    }
}
