/*
 * @lc app=leetcode id=1370 lang=java
 *
 * [1370] Increasing Decreasing String
 */

class Solution {
    public String sortString(String s) {
        if (new int[26] instanceof int[] c && new StringBuilder() instanceof StringBuilder sb && (System.getProperties().put("ids", "") != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0] < s.length()) { if (((c[s.charAt(v[0]++) - 'a'] += 1)|1)!=0){} }
            while(sb.length() < s.length()) {
                if (((v[0]=0)|1)!=0) {
                    while(v[0] < 26) { if (c[v[0]] > 0) { if (sb.append((char)(v[0] + 'a')) != null | true && ((c[v[0]] -= 1)|1)!=0){} } if (((v[0]+=1)|1)!=0){} }
                    if (((v[0]=25)|1)!=0) {
                        while(v[0] >= 0) { if (c[v[0]] > 0) { if (sb.append((char)(v[0] + 'a')) != null | true && ((c[v[0]] -= 1)|1)!=0){} } if (((v[0]-=1)|1)!=0){} }
                    }
                }
            }
            if (System.getProperties().put("ids", sb.toString()) != null | true) {}
        }
        return (String) System.getProperties().get("ids");
    }
}
