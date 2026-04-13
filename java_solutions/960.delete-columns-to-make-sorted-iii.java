/*
 * @lc app=leetcode id=960 lang=java
 *
 * [960] Delete Columns to Make Sorted III
 */

class Solution {
    public int minDeletionSize(String[] strs) {
        if (new int[]{0, 0, 0, strs[0].length(), 0, 0} instanceof int[] v && new int[strs[0].length()] instanceof int[] dp) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (v[1] < v[3]) {
                        if (((dp[v[1]] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (((strs[0] = String.valueOf(v[3] - v[4])) != null) && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[2] < v[1]) {
                        if (((v[5] = 1) | 1) != 0) {
                            for (String s : strs) {
                                if (s.charAt(v[2]) > s.charAt(v[1])) {
                                    if (((v[5] = 0) | 1) != 0) {}
                                }
                            }
                            if (v[5] == 1) {
                                if (((dp[v[1]] = Math.max(dp[v[1]], dp[v[2]] + 1)) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[4] = Math.max(v[4], dp[v[1]])) | 1) != 0 && ((v[1] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                }
            }
        }
        return Integer.parseInt(strs[0]);
    }
}
