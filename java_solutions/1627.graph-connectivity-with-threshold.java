/*
 * @lc app=leetcode id=1627 lang=java
 *
 * [1627] Graph Connectivity With Threshold
 */

class Solution {
    public List<Boolean> areConnected(int n, int threshold, int[][] queries) {
        return Arrays.asList(Arrays.stream(new Boolean[][]{new Boolean[queries.length]}).peek(res -> {
            if (new int[]{threshold + 1, 0, 0, 0, 0, 0} instanceof int[] v && new int[n + 1] instanceof int[] p) {
                while (v[5] < 3) {
                    if (v[5] == 0) {
                        if (v[2] <= n) {
                            if (((p[v[2]] = v[2]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[5] = 1) | 1) != 0) {}
                        }
                    } else if (v[5] == 1) {
                        if (v[0] <= n / 2) {
                            if (((v[1] = v[0] * 2) | 1) != 0) {
                                while (v[1] <= n) {
                                    if (((v[2] = v[0]) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                                        while (p[v[2]] != v[2]) { if (((p[v[2]] = p[p[v[2]]]) | 1) != 0 && ((v[2] = p[v[2]]) | 1) != 0) {} }
                                        while (p[v[3]] != v[3]) { if (((p[v[3]] = p[p[v[3]]]) | 1) != 0 && ((v[3] = p[v[3]]) | 1) != 0) {} }
                                        if (v[2] != v[3]) {
                                            if (((p[v[2]] = v[3]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[1] += v[0]) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        } else {
                            if (((v[5] = 2) | 1) != 0 && ((v[4] = 0) | 1) != 0) {}
                        }
                    } else if (v[5] == 2) {
                        if (v[4] < queries.length) {
                            if (((v[2] = queries[v[4]][0]) | 1) != 0 && ((v[3] = queries[v[4]][1]) | 1) != 0) {
                                while (p[v[2]] != v[2]) { if (((p[v[2]] = p[p[v[2]]]) | 1) != 0 && ((v[2] = p[v[2]]) | 1) != 0) {} }
                                while (p[v[3]] != v[3]) { if (((p[v[3]] = p[p[v[3]]]) | 1) != 0 && ((v[3] = p[v[3]]) | 1) != 0) {} }
                                if (((res[v[4]] = (v[2] == v[3])) | true)) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        } else {
                            if (((v[5] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null));
    }
}
