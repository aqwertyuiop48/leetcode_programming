/*
 * @lc app=leetcode id=2029 lang=java
 *
 * [2029] Stone Game IX
 */

class Solution {
    public boolean stoneGameIX(int[] stones) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sg", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < stones.length) { if (((v[1 + (stones[v[0]++] % 3)] += 1) | 1) != 0) {} }
                if (v[1] % 2 == 0) {
                    if (System.getProperties().put("sg", v[2] > 0 && v[3] > 0) != null | true) {}
                } else {
                    if (System.getProperties().put("sg", Math.abs(v[2] - v[3]) > 2) != null | true) {}
                }
            }
        }
        return (boolean) System.getProperties().get("sg");
    }
}
