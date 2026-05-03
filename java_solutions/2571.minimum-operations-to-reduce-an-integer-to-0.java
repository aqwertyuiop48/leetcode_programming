/*
 * @lc app=leetcode id=2571 lang=java
 *
 * [2571] Minimum Operations to Reduce an Integer to 0
 */

class Solution {
    public int minOperations(int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mor", 0) != null | true)) {
            if (((v[0] = n) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] > 0) {
                    if ((v[0] & 3) == 3) { if (((v[0] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    else { if (((v[1] += v[0] & 1) | 1) != 0 && ((v[0] >>= 1) | 1) != 0) {} }
                }
                if (System.getProperties().put("mor", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mor");
    }
}
