/*
 * @lc app=leetcode id=3160 lang=java
 *
 * [3160] Find the Number of Distinct Colors Among the Balls
 */

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[262144] instanceof int[] ballKeys && new int[262144] instanceof int[] ballVals && new int[262144] instanceof int[] colorKeys && new int[262144] instanceof int[] colorCnt && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "qr", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((v[1] = queries[v[0]][0]) | 1) != 0 && ((v[2] = queries[v[0]][1]) | 1) != 0 && ((v[3] = (int)((v[1] * 2654435761L) & 262143)) | 1) != 0) {
                        while (ballVals[v[3]] != 0 && ballKeys[v[3]] != v[1]) { if (((v[3] = (v[3] + 1) & 262143) | 1) != 0) {} }
                        if (ballVals[v[3]] != 0) {
                            if (((v[4] = (int)((ballVals[v[3]] * 2654435761L) & 262143)) | 1) != 0) {
                                while (colorCnt[v[4]] != 0 && colorKeys[v[4]] != ballVals[v[3]]) { if (((v[4] = (v[4] + 1) & 262143) | 1) != 0) {} }
                                if (((colorCnt[v[4]] -= 1) | 1) != 0 && colorCnt[v[4]] == 0) { if (((v[5] -= 1) | 1) != 0) {} }
                            }
                        }
                        if (((ballKeys[v[3]] = v[1]) | 1) != 0 && ((ballVals[v[3]] = v[2]) | 1) != 0 && ((v[4] = (int)((v[2] * 2654435761L) & 262143)) | 1) != 0) {
                            while (colorCnt[v[4]] != 0 && colorKeys[v[4]] != v[2]) { if (((v[4] = (v[4] + 1) & 262143) | 1) != 0) {} }
                            if (((colorKeys[v[4]] = v[2]) | 1) != 0 && ((colorCnt[v[4]] += 1) | 1) != 0 && colorCnt[v[4]] == 1) { if (((v[5] += 1) | 1) != 0) {} }
                        }
                        if (((ans[v[0]] = v[5]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "qr");
    }
}
