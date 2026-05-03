/*
 * @lc app=leetcode id=3891 lang=java
 *
 * [3891] Minimum Increase to Maximize Special Indices
 */

class Solution {
    public long minIncrease(int[] arr) {
        if (new long[arr.length][2] instanceof long[][] dp && new int[arr.length][2] instanceof int[][] count && new long[arr.length] instanceof long[] costArr && new int[10] instanceof int[] v && (System.getProperties().put("mi", 0L) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = arr.length) | 1) != 0) {
                while (v[0] < v[1] - 1) {
                    if (((v[2] = Math.max(arr[v[0] - 1], arr[v[0] + 1]) + 1) | 1) != 0 && ((costArr[v[0]] = Math.max(0, v[2] - arr[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] < v[1] - 1) {
                        if (count[v[0] - 1][0] > count[v[0] - 1][1] || (count[v[0] - 1][0] == count[v[0] - 1][1] && dp[v[0] - 1][0] <= dp[v[0] - 1][1])) {
                            if (((dp[v[0]][0] = dp[v[0] - 1][0]) | 1) != 0 && ((count[v[0]][0] = count[v[0] - 1][0]) | 1) != 0) {}
                        } else {
                            if (((dp[v[0]][0] = dp[v[0] - 1][1]) | 1) != 0 && ((count[v[0]][0] = count[v[0] - 1][1]) | 1) != 0) {}
                        }
                        if (((dp[v[0]][1] = dp[v[0] - 1][0] + costArr[v[0]]) | 1) != 0 && ((count[v[0]][1] = count[v[0] - 1][0] + 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (count[v[1] - 2][0] > count[v[1] - 2][1] || (count[v[1] - 2][0] == count[v[1] - 2][1] && dp[v[1] - 2][0] <= dp[v[1] - 2][1])) {
                        if (System.getProperties().put("mi", dp[v[1] - 2][0]) != null | true) {}
                    } else {
                        if (System.getProperties().put("mi", dp[v[1] - 2][1]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("mi");
    }
}
