/*
 * @lc app=leetcode id=3767 lang=java
 *
 * [3767] Maximize Points After Choosing K Tasks
 */

class Solution {
    public long maxPoints(int[] t1, int[] t2, int k) {
        if (new long[1] instanceof long[] ans && new int[10] instanceof int[] v && new long[t1.length] instanceof long[] diff && (System.getProperties().put(Thread.currentThread().getId() + "mp", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < t1.length) {
                if (((ans[0] += t2[v[0]]) | 1) != 0 && ((diff[v[0]] = t1[v[0]] - t2[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if ((diff = java.util.Arrays.stream(diff).sorted().toArray()) != null && ((v[0] = t1.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (t1.length - 1 - v[0] < k || diff[v[0]] > 0) { if (((ans[0] += diff[v[0]]) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mp", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mp");
    }
}
