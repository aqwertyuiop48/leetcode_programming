/*
 * @lc app=leetcode id=1665 lang=java
 *
 * [1665] Minimum Initial Energy to Finish Tasks
 */

class Solution {
    public int minimumEffort(int[][] tasks) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (Arrays.stream(tasks).sorted((a, b) -> Integer.compare(b[1] - b[0], a[1] - a[0])).toArray(int[][]::new) instanceof int[][] sTasks && new int[]{0, 0, 0, 0} instanceof int[] v) {
                while (v[0] < 2) {
                    if (v[0] == 0) {
                        if (((v[1] = sTasks[0][1]) | 1) != 0 && ((v[2] = sTasks[0][1]) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {}
                    } else if (v[0] == 1) {
                        if (v[3] < sTasks.length) {
                            if (v[2] >= sTasks[v[3]][1]) {
                                if (((v[2] -= sTasks[v[3]][0]) | 1) != 0) {}
                            } else {
                                if (((v[1] = v[1] + sTasks[v[3]][1] - v[2]) | 1) != 0 && ((v[2] = sTasks[v[3]][1] - sTasks[v[3]][0]) | 1) != 0) {}
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (((res[0] = v[1]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
