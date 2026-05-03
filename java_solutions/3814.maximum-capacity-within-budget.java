/*
 * @lc app=leetcode id=3814 lang=java
 *
 * [3814] Maximum Capacity Within Budget
 */

class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        if (new int[costs.length][2] instanceof int[][] p && new int[costs.length] instanceof int[] pre && new int[15] instanceof int[] v && (System.getProperties().put("mcwb", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < costs.length) {
                    if (((p[v[0]][0] = costs[v[0]]) | 1) != 0 && ((p[v[0]][1] = capacity[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (new Object[]{java.util.Arrays.stream(p).sorted((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]).toArray(int[][]::new)} instanceof Object[] o && o[0] instanceof int[][] sorted && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < costs.length) {
                        if (((pre[v[0]] = Math.max(v[0] > 0 ? pre[v[0] - 1] : 0, sorted[v[0]][1])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = costs.length) | 1) != 0) {
                        while (v[1] < v[2]) {
                            if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                if (sorted[v[3]][0] < budget) { if (((v[1] = v[3] + 1) | 1) != 0) {} } else { if (((v[2] = v[3]) | 1) != 0) {} }
                            }
                        }
                        if (((v[4] = v[1] - 1) | 1) != 0 && v[4] >= 0) { if (((v[5] = pre[v[4]]) | 1) != 0) {} }
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] < costs.length && sorted[v[0]][0] < budget) {
                                if (((v[1] = 0) | 1) != 0 && ((v[2] = costs.length) | 1) != 0) {
                                    while (v[1] < v[2]) {
                                        if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                            if (sorted[v[3]][0] < budget - sorted[v[0]][0]) { if (((v[1] = v[3] + 1) | 1) != 0) {} } else { if (((v[2] = v[3]) | 1) != 0) {} }
                                        }
                                    }
                                    if (((v[6] = Math.min(v[1] - 1, v[0] - 1)) | 1) != 0 && v[6] >= 0) {
                                        if (sorted[v[0]][1] + pre[v[6]] > v[5]) { if (((v[5] = sorted[v[0]][1] + pre[v[6]]) | 1) != 0) {} }
                                    }
                                }
                                if (((v[0] += 1) | 1) != 0) {}
                            }
                            if (System.getProperties().put("mcwb", v[5]) != null | true) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mcwb");
    }
}
