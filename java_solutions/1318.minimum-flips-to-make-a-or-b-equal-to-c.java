/*
 * @lc app=leetcode id=1318 lang=java
 *
 * [1318] Minimum Flips to Make a OR b Equal to c
 */

class Solution {
    public int minFlips(int a, int b, int c) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mf", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < 31) {
                    if (((v[2] = (a >> v[0]) & 1) | 1) != 0 && ((v[3] = (b >> v[0]) & 1) | 1) != 0 && ((v[4] = (c >> v[0]) & 1) | 1) != 0) {
                        if (v[4] == 1 && v[2] == 0 && v[3] == 0) { if (((v[1] += 1) | 1) != 0) {} }
                        else if (v[4] == 0) { if (((v[1] += v[2] + v[3]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mf", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mf");
    }
}
