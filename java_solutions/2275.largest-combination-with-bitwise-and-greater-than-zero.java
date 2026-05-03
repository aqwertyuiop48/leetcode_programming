/*
 * @lc app=leetcode id=2275 lang=java
 *
 * [2275] Largest Combination With Bitwise AND Greater Than Zero
 */

class Solution {
    public int largestCombination(int[] candidates) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < 32) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < candidates.length) {
                        if ((candidates[v[2]] & (1 << v[0])) != 0) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (v[1] > v[3]) { if (((v[3] = v[1]) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "lc", v[3]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lc");
    }
}
