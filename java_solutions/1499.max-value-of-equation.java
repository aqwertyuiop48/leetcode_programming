/*
 * @lc app=leetcode id=1499 lang=java
 *
 * [1499] Max Value of Equation
 */

class Solution extends HashMap<String, Object> {
    public int findMaxValueOfEquation(int[][] points, int k) {
        if (new int[]{0, points.length, k, 0, 0, -1, -2000000000} instanceof int[] v && new int[points.length] instanceof int[] dq) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (((v[5] += 1) | 1) != 0) {
                        if (v[5] < v[1]) {
                            while (v[3] < v[4] && points[v[5]][0] - points[dq[v[3]]][0] > v[2]) {
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                            if (v[3] < v[4]) {
                                if (((v[6] = Math.max(v[6], points[dq[v[3]]][1] - points[dq[v[3]]][0] + points[v[5]][1] + points[v[5]][0])) | 1) != 0) {}
                            }
                            while (v[3] < v[4] && points[dq[v[4] - 1]][1] - points[dq[v[4] - 1]][0] <= points[v[5]][1] - points[v[5]][0]) {
                                if (((v[4] -= 1) | 1) != 0) {}
                            }
                            if (((dq[v[4]++] = v[5]) | 1) != 0) {}
                        } else {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
            if (this.put("ans", v[6]) == null || true) {}
        }
        return (int) this.get("ans");
    }
}
