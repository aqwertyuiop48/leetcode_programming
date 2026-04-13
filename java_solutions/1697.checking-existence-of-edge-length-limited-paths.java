/*
 * @lc app=leetcode id=1697 lang=java
 *
 * [1697] Checking Existence of Edge Length Limited Paths
 */

class Solution {
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        return Arrays.stream(new boolean[][]{new boolean[queries.length]}).peek(res -> {
            if (new Object[]{new int[n], new int[n], new int[queries.length][4], new int[]{0, 0, 0, 0, 0, 0}, null, null} instanceof Object[] st && (int[])st[0] instanceof int[] parent && (int[])st[1] instanceof int[] size && (int[][])st[2] instanceof int[][] Q && (int[])st[3] instanceof int[] v) {
                while (v[1] < 10) {
                    if (v[1] == 0) {
                        if (v[2] < n) {
                            if (((parent[v[2]] = v[2]) | 1) != 0 && ((size[v[2]] = 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    } else if (v[1] == 1) {
                        if (v[2] < queries.length) {
                            if (((Q[v[2]][0] = queries[v[2]][0]) | 1) != 0 && ((Q[v[2]][1] = queries[v[2]][1]) | 1) != 0 && ((Q[v[2]][2] = queries[v[2]][2]) | 1) != 0 && ((Q[v[2]][3] = v[2]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 2) | 1) != 0) {}
                        }
                    } else if (v[1] == 2) {
                        if (((st[4] = Arrays.stream(edgeList).sorted((a, b) -> Integer.compare(a[2], b[2])).toArray(int[][]::new)) != null) && ((st[5] = Arrays.stream(Q).sorted((a, b) -> Integer.compare(a[2], b[2])).toArray(int[][]::new)) != null) && ((v[1] = 3) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                    } else if (v[1] == 3) {
                        if (v[2] < queries.length) {
                            if (v[0] < ((int[][])st[4]).length && ((int[][])st[4])[v[0]][2] < ((int[][])st[5])[v[2]][2]) {
                                if (((v[3] = ((int[][])st[4])[v[0]][0]) | 1) != 0 && ((v[4] = ((int[][])st[4])[v[0]][1]) | 1) != 0) {
                                    while (parent[v[3]] != v[3]) {
                                        if (((parent[v[3]] = parent[parent[v[3]]]) | 1) != 0 && ((v[3] = parent[v[3]]) | 1) != 0) {}
                                    }
                                    while (parent[v[4]] != v[4]) {
                                        if (((parent[v[4]] = parent[parent[v[4]]]) | 1) != 0 && ((v[4] = parent[v[4]]) | 1) != 0) {}
                                    }
                                    if (v[3] != v[4]) {
                                        if (size[v[3]] >= size[v[4]]) {
                                            if (((parent[v[4]] = v[3]) | 1) != 0 && ((size[v[3]] += size[v[4]]) | 1) != 0) {}
                                        } else {
                                            if (((parent[v[3]] = v[4]) | 1) != 0 && ((size[v[4]] += size[v[3]]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[0] += 1) | 1) != 0) {}
                                }
                            } else {
                                if (((v[3] = ((int[][])st[5])[v[2]][0]) | 1) != 0 && ((v[4] = ((int[][])st[5])[v[2]][1]) | 1) != 0) {
                                    while (parent[v[3]] != v[3]) {
                                        if (((parent[v[3]] = parent[parent[v[3]]]) | 1) != 0 && ((v[3] = parent[v[3]]) | 1) != 0) {}
                                    }
                                    while (parent[v[4]] != v[4]) {
                                        if (((parent[v[4]] = parent[parent[v[4]]]) | 1) != 0 && ((v[4] = parent[v[4]]) | 1) != 0) {}
                                    }
                                    if (v[3] == v[4]) {
                                        if (((res[((int[][])st[5])[v[2]][3]] = true) || true)) {}
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[1] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null);
    }
}
