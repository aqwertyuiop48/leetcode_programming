/*
 * @lc app=leetcode id=2572 lang=java
 *
 * [2572] Count the Number of Square-Free Subsets
 */

class Solution {
    public int squareFreeSubsets(int[] nums) {
        if (new long[1024] instanceof long[] dp && new int[]{2,3,5,7,11,13,17,19,23,29} instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("sfs", 0) != null | true)) {
            if (((dp[0] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                        while (v[2] < 10) {
                            if (v[1] % (p[v[2]] * p[v[2]]) == 0) { if (((v[4] = 0) | 1) != 0 && ((v[2] = 10) | 1) != 0) {} }
                            else if (v[1] % p[v[2]] == 0) { if (((v[3] |= (1 << v[2])) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[4] == 1) {
                            if (((v[5] = 1023) | 1) != 0) {
                                while (v[5] >= 0) {
                                    if ((v[5] & v[3]) == 0) { if (((dp[v[5] | v[3]] = (dp[v[5] | v[3]] + dp[v[5]]) % 1000000007) | 1) != 0) {} }
                                    if (((v[5] -= 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < 1024) { if (((v[1] = (int)((v[1] + dp[v[0]++]) % 1000000007)) | 1) != 0) {} }
                    if (System.getProperties().put("sfs", (v[1] - 1 + 1000000007) % 1000000007) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("sfs");
    }
}
