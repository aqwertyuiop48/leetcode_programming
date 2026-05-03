/*
 * @lc app=leetcode id=1375 lang=java
 *
 * [1375] Number of Times Binary String Is Prefix-Aligned
 */

class Solution {
    public int numTimesAllBlue(int[] flips) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ntb", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0] < flips.length) {
                if (flips[v[0]] > v[1]) { if (((v[1] = flips[v[0]])|1)!=0){} }
                if (v[1] == v[0] + 1) { if (((v[2]+=1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ntb", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get("ntb");
    }
}
