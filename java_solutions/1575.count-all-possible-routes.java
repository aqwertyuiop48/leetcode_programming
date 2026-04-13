/*
 * @lc app=leetcode id=1575 lang=java
 *
 * [1575] Count All Possible Routes
 */

class Solution {
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        return java.util.Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0, locations.length, 0} instanceof int[] v && new int[locations.length][fuel + 1] instanceof int[][] dp) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] <= fuel) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < v[4]) {
                                    if (((dp[v[2]][v[1]] = (v[2] == finish ? 1 : 0)) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                        while (v[3] < v[4]) {
                                            if (v[2] != v[3]) {
                                                if (((v[5] = Math.abs(locations[v[2]] - locations[v[3]])) | 1) != 0) {
                                                    if (v[1] >= v[5]) {
                                                        if (((dp[v[2]][v[1]] = (dp[v[2]][v[1]] + dp[v[3]][v[1] - v[5]]) % 1000000007) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((res[0] = dp[start][fuel]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
