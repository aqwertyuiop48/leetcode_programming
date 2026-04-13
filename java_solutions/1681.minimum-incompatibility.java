/*
 * @lc app=leetcode id=1681 lang=java
 *
 * [1681] Minimum Incompatibility
 */

class Solution {
    public int minimumIncompatibility(int[] nums, int k) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new Object[]{Arrays.stream(nums).sorted().toArray(), new int[]{0, 0, 0, nums.length / k, 0, 0, 0, 0, 0, 0, 0}, new int[17], new int[1 << nums.length], new int[1 << nums.length], new int[2000]} instanceof Object[] st && (int[])st[0] instanceof int[] sNums && (int[])st[1] instanceof int[] v && (int[])st[2] instanceof int[] count && (int[])st[3] instanceof int[] cost && (int[])st[4] instanceof int[] dp && (int[])st[5] instanceof int[] valids) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < sNums.length) {
                            if (((count[sNums[v[1]]] += 1) | 1) != 0 && ((v[4] = Math.max(v[4], count[sNums[v[1]]])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (v[4] > k) {
                                if (((res[0] = -1) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                            } else {
                                if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 2) {
                        if (v[2] < (1 << sNums.length)) {
                            if (((cost[v[2]] = -1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 3) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[2] < (1 << sNums.length)) {
                            if (Integer.bitCount(v[2]) == v[3]) {
                                if (((v[5] = 0) | 1) != 0 && ((v[7] = -1) | 1) != 0 && ((v[8] = -1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                                    while (v[1] < sNums.length) {
                                        if ((v[2] & (1 << v[1])) != 0) {
                                            if ((v[5] & (1 << sNums[v[1]])) != 0) {
                                                if (((v[8] = -2) | 1) != 0) {}
                                            }
                                            if (((v[5] |= (1 << sNums[v[1]])) | 1) != 0 && ((v[7] = Math.max(v[7], sNums[v[1]]))) != -100 && ((v[8] = (v[8] == -1 || (v[8] >= 0 && sNums[v[1]] < v[8])) ? sNums[v[1]] : v[8])) != -100) {}
                                        }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                    if (v[8] >= 0 && v[7] != -1) {
                                        if (((cost[v[2]] = v[7] - v[8]) | 1) != 0 && ((valids[v[9]] = v[2]) | 1) != 0 && ((v[9] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 4) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 4) {
                        if (v[2] < (1 << sNums.length)) {
                            if (((dp[v[2]] = Integer.MAX_VALUE) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((dp[0] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 5) {
                        if (v[2] < (1 << sNums.length)) {
                            if (dp[v[2]] != Integer.MAX_VALUE && Integer.bitCount(v[2]) % v[3] == 0) {
                                if (((v[10] = ((1 << sNums.length) - 1) ^ v[2]) | 1) != 0 && ((v[10] = v[10] & -v[10]) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                                    while (v[5] < v[9]) {
                                        if ((valids[v[5]] & v[10]) != 0 && (v[2] & valids[v[5]]) == 0) {
                                            if (((v[6] = v[2] | valids[v[5]]) | 1) != 0 && ((dp[v[6]] = Math.min(dp[v[6]], dp[v[2]] + cost[valids[v[5]]]))) != -100) {}
                                        }
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((res[0] = dp[(1 << sNums.length) - 1] == Integer.MAX_VALUE ? -1 : dp[(1 << sNums.length) - 1]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
