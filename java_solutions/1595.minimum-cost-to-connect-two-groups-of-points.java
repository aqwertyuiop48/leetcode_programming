/*
 * @lc app=leetcode id=1595 lang=java
 *
 * [1595] Minimum Cost to Connect Two Groups of Points
 */

class Solution {
    public int connectTwoGroups(List<List<Integer>> cost) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0, cost.size(), cost.get(0).size(), 1 << cost.get(0).size()} instanceof int[] v && new int[1 << cost.get(0).size()] instanceof int[] dp && new int[1 << cost.get(0).size()] instanceof int[] ndp) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[2] < v[6]) {
                            if (((dp[v[2]] = 1000000000) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((dp[0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < v[4]) {
                            if (((v[2] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        } else {
                            if (((res[0] = dp[v[6] - 1]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[2] < v[6]) {
                            if (((ndp[v[2]] = 1000000000) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[2] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[2] < v[6]) {
                            if (dp[v[2]] != 1000000000) {
                                if (((v[3] = 0) | 1) != 0) {
                                    while (v[3] < v[5]) {
                                        if (((ndp[v[2] | (1 << v[3])] = Math.min(ndp[v[2] | (1 << v[3])], dp[v[2]] + cost.get(v[1]).get(v[3]))) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[2] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                        }
                    } else if (v[0] == 4) {
                        if (v[2] < v[6]) {
                            if (ndp[v[2]] != 1000000000) {
                                if (((v[3] = 0) | 1) != 0) {
                                    while (v[3] < v[5]) {
                                        if (((ndp[v[2] | (1 << v[3])] = Math.min(ndp[v[2] | (1 << v[3])], ndp[v[2]] + cost.get(v[1]).get(v[3]))) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[2] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                        }
                    } else if (v[0] == 5) {
                        if (v[2] < v[6]) {
                            if (((dp[v[2]] = ndp[v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
