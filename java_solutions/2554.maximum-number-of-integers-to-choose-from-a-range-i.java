/*
 * @lc app=leetcode id=2554 lang=java
 *
 * [2554] Maximum Number of Integers to Choose From a Range I
 */

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet b && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < banned.length) { if (b.add(banned[v[0]]) | true && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                while (v[0] <= n && v[3] == 1) {
                    if (!b.contains(v[0])) {
                        if (v[1] + v[0] <= maxSum) { if (((v[1] += v[0]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                        else { if (((v[3] = 0) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mc", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
