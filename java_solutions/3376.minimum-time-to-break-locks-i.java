/*
 * @lc app=leetcode id=3376 lang=java
 *
 * [3376] Minimum Time to Break Locks I
 */

class Solution {
    public int findMinimumTime(java.util.List<Integer> strength, int K) {
        if (new int[1 << strength.size()] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtb", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < (1 << strength.size())) { if (((dp[v[0]] = 99999999) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < (1 << strength.size())) {
                        if (((v[1] = Integer.bitCount(v[0]) * K + 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[2] < strength.size()) {
                                if ((v[0] & (1 << v[2])) == 0) {
                                    if (((v[3] = dp[v[0]] + (strength.get(v[2]) + v[1] - 1) / v[1]) | 1) != 0) {
                                        if (v[3] < dp[v[0] | (1 << v[2])]) {
                                            if (((dp[v[0] | (1 << v[2])] = v[3]) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mtb", dp[(1 << strength.size()) - 1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mtb");
    }
}
