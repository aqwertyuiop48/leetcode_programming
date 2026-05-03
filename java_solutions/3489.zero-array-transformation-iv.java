/*
 * @lc app=leetcode id=3489 lang=java
 *
 * [3489] Zero Array Transformation IV
 */

class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "za4", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = queries.length) | 1) != 0 && ((v[8] = -1) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                        while (v[3] < nums.length && v[4] == 1) {
                            if (nums[v[3]] > 0) {
                                if (new boolean[nums[v[3]] + 1] instanceof boolean[] dp && ((dp[0] = true) | true) && ((v[5] = 0) | 1) != 0) {
                                    while (v[5] < v[2]) {
                                        if (queries[v[5]][0] <= v[3] && queries[v[5]][1] >= v[3] && ((v[6] = nums[v[3]]) | 1) != 0) {
                                            while (v[6] >= queries[v[5]][2]) {
                                                if (dp[v[6] - queries[v[5]][2]]) { if (((dp[v[6]] = true) | true) != false) {} }
                                                if (((v[6] -= 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                    if (!dp[nums[v[3]]]) { if (((v[4] = 0) | 1) != 0) {} }
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (v[4] == 1) { if (((v[8] = v[2]) | 1) != 0 && ((v[1] = v[2] - 1) | 1) != 0) {} }
                        else { if (((v[0] = v[2] + 1) | 1) != 0) {} }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "za4", v[8]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "za4");
    }
}
