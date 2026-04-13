/*
 * @lc app=leetcode id=1478 lang=java
 *
 * [1478] Allocate Mailboxes
 */

class Solution extends HashMap<String, Object> {
    public int minDistance(int[] houses, int k) {
        if (new int[]{0, houses.length, k, 0, 0, 0, 0} instanceof int[] v && (houses = Arrays.stream(houses).sorted().toArray()) != null && new int[houses.length][houses.length] instanceof int[][] cost && new int[houses.length + 1][k + 1] instanceof int[][] dp) {
            while (v[0] < 10) {
                if (v[0] == 0) { 
                    if (v[3] < v[1]) {
                        if (((v[4] = v[3]) | 1) != 0) {
                            while (v[4] < v[1]) {
                                if (((v[6] = 0) | 1) != 0) {
                                    while (v[6] <= v[4] - v[3]) {
                                        if (((cost[v[3]][v[4]] += Math.abs(houses[v[3] + v[6]] - houses[(v[3] + v[4]) / 2])) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] <= v[1]) {
                                if (((v[4] = 0) | 1) != 0) {
                                    while (v[4] <= v[2]) {
                                        if (((dp[v[3]][v[4]] = 1000000000) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                            if (((dp[v[1]][0] = 0) | 1) != 0 && ((v[3] = v[1] - 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) { 
                    if (v[3] >= 0) {
                        if (((v[5] = v[2]) | 1) != 0) {
                            while (v[5] >= 1) {
                                if (((v[6] = v[3]) | 1) != 0) {
                                    while (v[6] < v[1]) {
                                        if (((dp[v[3]][v[5]] = Math.min(dp[v[3]][v[5]], cost[v[3]][v[6]] + dp[v[6] + 1][v[5] - 1])) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[5] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] -= 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
            if (this.put("ans", dp[0][v[2]]) == null || true) {}
        }
        return (int) this.get("ans");
    }
}
