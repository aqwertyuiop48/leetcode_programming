/*
 * @lc app=leetcode id=3670 lang=java
 *
 * [3670] Maximum Product of Two Integers With No Common Bits
 */

class Solution {
    public long maxProduct(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpo", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] > v[2]) { if (((v[2] = nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[3] = 1) | 1) != 0) {
                while (v[3] <= v[2]) { if (((v[3] <<= 1) | 1) != 0) {} }
                if (new int[v[3]] instanceof int[] dp && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (nums[v[0]] > dp[nums[v[0]]]) { if (((dp[nums[v[0]]] = nums[v[0]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < 31 && (1 << v[0]) < v[3]) {
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < v[3]) {
                                    if ((v[1] & (1 << v[0])) != 0) {
                                        if (dp[v[1] ^ (1 << v[0])] > dp[v[1]]) { if (((dp[v[1]] = dp[v[1] ^ (1 << v[0])]) | 1) != 0) {} }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
                        while (v[0] < nums.length) {
                            if (((v[1] = (v[3] - 1) ^ nums[v[0]]) | 1) != 0) {
                                if (dp[v[1]] > 0 && (long)nums[v[0]] * dp[v[1]] > ans[0]) {
                                    if (((ans[0] = (long)nums[v[0]] * dp[v[1]]) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "mpo", ans[0]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mpo");
    }
}
