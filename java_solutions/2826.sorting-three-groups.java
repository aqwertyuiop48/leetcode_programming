/*
 * @lc app=leetcode id=2826 lang=java
 *
 * [2826] Sorting Three Groups
 */

class Solution {
    public int minimumOperations(java.util.List<Integer> nums) {
        if (new int[10] instanceof int[] v && new int[4] instanceof int[] dp && (System.getProperties().put("stg", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.size()) {
                    if (((v[1] = nums.get(v[0])) | 1) != 0) {
                        if (v[1] == 1) { if (((dp[1] += 1) | 1) != 0) {} }
                        else if (v[1] == 2) { if (((dp[2] = Math.max(dp[1], dp[2]) + 1) | 1) != 0) {} }
                        else { if (((dp[3] = Math.max(dp[1], Math.max(dp[2], dp[3])) + 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("stg", nums.size() - Math.max(dp[1], Math.max(dp[2], dp[3]))) != null | true) {}
            }
        }
        return (int) System.getProperties().get("stg");
    }
}
