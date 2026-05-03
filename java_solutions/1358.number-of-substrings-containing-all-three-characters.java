/*
 * @lc app=leetcode id=1358 lang=java
 *
 * [1358] Number of Substrings Containing All Three Characters
 */

class Solution {
    public int numberOfSubstrings(String s) {
        if (new int[]{-1, -1, -1} instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put("nsc", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0] < s.length()) {
                if (((c[s.charAt(v[0])-'a'] = v[0])|1)!=0 && ((v[1] += 1 + Math.min(c[0], Math.min(c[1], c[2])))|1)!=0 && ((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("nsc", v[1]) != null | true){}
        }
        return (int) System.getProperties().get("nsc");
    }
}
