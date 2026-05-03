/*
 * @lc app=leetcode id=3015 lang=java
 *
 * [3015] Count the Number of Houses at a Certain Distance I
 */

class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        if (new int[n] instanceof int[] res && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cop", res) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= n) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] <= n) {
                            if (v[0] != v[1]) {
                                if (((v[2] = Math.abs(v[0] - v[1])) | 1) != 0 && ((v[3] = Math.abs(v[0] - x) + 1 + Math.abs(y - v[1])) | 1) != 0 && ((v[4] = Math.abs(v[0] - y) + 1 + Math.abs(x - v[1])) | 1) != 0) {
                                    if (v[3] < v[2]) { if (((v[2] = v[3]) | 1) != 0) {} }
                                    if (v[4] < v[2]) { if (((v[2] = v[4]) | 1) != 0) {} }
                                    if (((res[v[2] - 1] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cop");
    }
}
