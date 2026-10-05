/*
 * @lc app=leetcode id=4023 lang=java
 *
 * [4023] Elevator Requests II
 */

class Solution {
    public long elevatorRequests(int n, int start, int[] reqs) {
        return Arrays.stream(new long[][]{{0}}).peek(res -> {
            if (new int[]{0, reqs.length, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && // 0:hasS, 1:m, 2:len, 3:sIdx, 4:tot, 5:i, 6:k, 7:j, 8:remL, 9:remR, 10:r, 11:j2, 12:col
                new long[]{Long.MAX_VALUE / 2} instanceof long[] INF) {

                while (v[5] < v[1]) {
                    if (((v[10] = reqs[v[5]]) | 1) != 0 && v[10] == start) {
                        if (((v[0] = 1) | 1) != 0 && ((v[5] = v[1]) | 1) != 0) {}
                    }
                    if (((v[5]++) | 1) != 0) {}
                }

                if (((v[2] = v[0] == 1 ? v[1] : v[1] + 1) | 1) != 0 &&
                    new int[v[2]] instanceof int[] a &&
                    new int[v[2]] instanceof int[] isR &&
                    new int[v[2] + 1] instanceof int[] p &&
                    new long[v[2]][2] instanceof long[][] prev &&
                    new long[2] instanceof long[] ans &&
                    new long[][][][]{{null}} instanceof long[][][][] dpHolder) {

                    if (((v[5] = 0) | 1) != 0) {}
                    while (v[5] < v[1]) {
                        if (((a[v[5]] = reqs[v[5]]) | 1) != 0 && ((v[5]++) | 1) != 0) {}
                    }
                    if (v[0] == 0) {
                        if (((a[v[1]] = start) | 1) != 0) {}
                    }

                    if (java.util.stream.Stream.<Runnable>of(() -> Arrays.sort(a)).peek(Runnable::run).findFirst().isPresent()) {}

                    if (((v[3] = -1) | 1) != 0 && ((v[5] = 0) | 1) != 0) {}
                    while (v[5] < v[2]) {
                        if (a[v[5]] == start) {
                            if (((v[3] = v[5]) | 1) != 0 && ((v[5] = v[2]) | 1) != 0) {}
                        }
                        if (((v[5]++) | 1) != 0) {}
                    }

                    if (((v[5] = 0) | 1) != 0) {}
                    while (v[5] < v[2]) {
                        if (a[v[5]] != start || v[0] == 1) {
                            if (a[v[5]] != start) {
                                if (((isR[v[5]] = 1) | 1) != 0 && ((v[4]++) | 1) != 0) {}
                            }
                        }
                        if (((v[5]++) | 1) != 0) {}
                    }

                    if (((v[5] = 0) | 1) != 0) {}
                    while (v[5] < v[2]) {
                        if (((p[v[5] + 1] = p[v[5]] + isR[v[5]]) | 1) != 0 && ((v[5]++) | 1) != 0) {}
                    }

                    if (((v[5] = 0) | 1) != 0) {}
                    while (v[5] < v[2]) {
                        if (((v[12] = 0) | 1) != 0) {}
                        while (v[12] < 2) {
                            if (((prev[v[5]][v[12]] = INF[0]) | 1) != 0 && ((v[12]++) | 1) != 0) {}
                        }
                        if (((v[5]++) | 1) != 0) {}
                    }
                    if (((prev[v[3]][0] = 0) | 1) != 0 && ((prev[v[3]][1] = 0) | 1) != 0) {}

                    if (((v[6] = 1) | 1) != 0) {}
                    while (v[6] < v[2]) {
                        if (new long[v[2] - v[6]][2] instanceof long[][] dp) {
                            if (((v[5] = 0) | 1) != 0) {}
                            while (v[5] < v[2] - v[6]) {
                                if (((v[12] = 0) | 1) != 0) {}
                                while (v[12] < 2) {
                                    if (((dp[v[5]][v[12]] = INF[0]) | 1) != 0 && ((v[12]++) | 1) != 0) {}
                                }
                                if (((v[5]++) | 1) != 0) {}
                            }

                            if (((v[5] = 0) | 1) != 0) {}
                            while (v[5] < v[2] - v[6]) {
                                if (((v[7] = v[5] + v[6]) | 1) != 0 &&
                                    ((v[8] = v[4] - (p[v[7] + 1] - p[v[5] + 1])) | 1) != 0) {

                                    if (prev[v[5] + 1][0] != INF[0]) {
                                        if (((dp[v[5]][0] = Math.min(dp[v[5]][0], prev[v[5] + 1][0] + (long) (a[v[5] + 1] - a[v[5]]) * v[8])) | 1) != 0) {}
                                    }
                                    if (prev[v[5] + 1][1] != INF[0]) {
                                        if (((dp[v[5]][0] = Math.min(dp[v[5]][0], prev[v[5] + 1][1] + (long) (a[v[7]] - a[v[5]]) * v[8])) | 1) != 0) {}
                                    }

                                    if (((v[9] = v[4] - (p[v[7]] - p[v[5]])) | 1) != 0) {
                                        if (prev[v[5]][0] != INF[0]) {
                                            if (((dp[v[5]][1] = Math.min(dp[v[5]][1], prev[v[5]][0] + (long) (a[v[7]] - a[v[5]]) * v[9])) | 1) != 0) {}
                                        }
                                        if (prev[v[5]][1] != INF[0]) {
                                            if (((dp[v[5]][1] = Math.min(dp[v[5]][1], prev[v[5]][1] + (long) (a[v[7]] - a[v[7] - 1]) * v[9])) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[5]++) | 1) != 0) {}
                            }

                            if (v[6] == v[2] - 1) {
                                if (((ans[0] = dp[0][0]) | 1) != 0 && ((ans[1] = dp[0][1]) | 1) != 0) {}
                            }

                            if (((dpHolder[0][0] = dp) != null || true) &&
                                ((v[11] = 0) | 1) != 0) {}
                            while (v[11] < dpHolder[0][0].length) {
                                if (((prev[v[11]] = dpHolder[0][0][v[11]]) != null || true) && ((v[11]++) | 1) != 0) {}
                            }
                        }
                        if (((v[6]++) | 1) != 0) {}
                    }

                    if (((res[0] = (v[2] == 1 ? 0 : Math.min(ans[0], ans[1]))) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
