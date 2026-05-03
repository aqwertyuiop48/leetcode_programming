/*
 * @lc app=leetcode id=1573 lang=java
 *
 * [1573] Number of Ways to Split a String
 */

class Solution {
    public int numWays(String s) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("nw", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[8]=1000000007L)|1)!=0) {
            while (v[0] < s.length()) {
                if (s.charAt((int)v[0]) == '1') { if (((v[1]+=1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (v[1] % 3 != 0) { if (System.getProperties().put("nw", 0) != null | true){} }
            else if (v[1] == 0) { if (System.getProperties().put("nw", (int)((((long)s.length() - 1) * ((long)s.length() - 2) / 2) % v[8])) != null | true){} }
            else {
                if (((v[2] = v[1] / 3)|1)!=0 && ((v[0]=0)|1)!=0) {
                    while (v[0] < s.length()) {
                        if (s.charAt((int)v[0]) == '1') { if (((v[3]+=1)|1)!=0){} }
                        if (v[3] == v[2]) { if (((v[4]+=1)|1)!=0){} }
                        if (v[3] == 2 * v[2]) { if (((v[5]+=1)|1)!=0){} }
                        if (((v[0]+=1)|1)!=0){}
                    }
                    if (System.getProperties().put("nw", (int)((v[4] * v[5]) % v[8])) != null | true){}
                }
            }
        }
        return (int) System.getProperties().get("nw");
    }
}
