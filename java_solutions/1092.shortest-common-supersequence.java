/*
 * @lc app=leetcode id=1092 lang=java
 *
 * [1092] Shortest Common Supersequence 
 */

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        return Arrays.stream(new String[][]{new String[]{""}}).peek(res -> {
            if (new int[]{str1.length(), str2.length(), 0, 0} instanceof int[] v && new int[str1.length() + 1][str2.length() + 1] instanceof int[][] dp && new StringBuilder[]{new StringBuilder()} instanceof StringBuilder[] sb) {
                if (((v[2] = 1) | 1) != 0) {
                    while (v[2] <= v[0]) {
                        if (((v[3] = 1) | 1) != 0) {
                            while (v[3] <= v[1]) {
                                if (str1.charAt(v[2] - 1) == str2.charAt(v[3] - 1)) {
                                    if (((dp[v[2]][v[3]] = 1 + dp[v[2] - 1][v[3] - 1]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                } else {
                                    if (((dp[v[2]][v[3]] = Math.max(dp[v[2] - 1][v[3]], dp[v[2]][v[3] - 1])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[2] = v[0]) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                    while (v[2] > 0 && v[3] > 0) {
                        if (str1.charAt(v[2] - 1) == str2.charAt(v[3] - 1)) {
                            if ((sb[0].append(str1.charAt(v[2] - 1)) != null) && ((v[2] -= 1) | 1) != 0 && ((v[3] -= 1) | 1) != 0) {}
                        } else if (dp[v[2] - 1][v[3]] > dp[v[2]][v[3] - 1]) {
                            if ((sb[0].append(str1.charAt(v[2] - 1)) != null) && ((v[2] -= 1) | 1) != 0) {}
                        } else {
                            if ((sb[0].append(str2.charAt(v[3] - 1)) != null) && ((v[3] -= 1) | 1) != 0) {}
                        }
                    }
                    while (v[2] > 0) {
                        if ((sb[0].append(str1.charAt(v[2] - 1)) != null) && ((v[2] -= 1) | 1) != 0) {}
                    }
                    while (v[3] > 0) {
                        if ((sb[0].append(str2.charAt(v[3] - 1)) != null) && ((v[3] -= 1) | 1) != 0) {}
                    }
                }
                if (((res[0] = sb[0].reverse().toString()) != null)) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
