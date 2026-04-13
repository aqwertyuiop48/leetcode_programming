/*
 * @lc app=leetcode id=1416 lang=java
 *
 * [1416] Restore The Array
 */

class Solution {
    public int numberOfArrays(String s, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[s.length() + 1] instanceof int[] dp && new int[]{s.length() - 1, 0, 0} instanceof int[] v && new long[]{0} instanceof long[] num) {
                if (((dp[s.length()] = 1) | 1) != 0) {
                    while (v[0] >= 0) {
                        if (s.charAt(v[0]) != '0') {
                            if (((num[0] = 0) | 1) != 0 && ((v[1] = v[0]) | 1) != 0 && ((v[2] = Math.min(s.length() - 1, v[0] + 9)) | 1) != 0) {
                                while (v[1] <= v[2]) {
                                    if (((num[0] = num[0] * 10 + (s.charAt(v[1]) - '0')) | 1) != 0) {
                                        if (num[0] <= k) {
                                            if (((dp[v[0]] = (dp[v[0]] + dp[v[1] + 1]) % 1000000007) | 1) != 0) {}
                                        } else {
                                            if (((v[1] = v[2]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                    if (((res[0] = dp[0]) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
