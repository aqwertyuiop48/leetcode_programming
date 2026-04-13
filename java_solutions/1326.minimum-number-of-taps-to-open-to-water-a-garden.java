/*
 * @lc app=leetcode id=1326 lang=java
 *
 * [1326] Minimum Number of Taps to Open to Water a Garden
 */

class Solution {
    public int minTaps(int n, int[] ranges) {
        if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new int[n + 1] instanceof int[] arr) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (v[1] < ranges.length) {
                        if (ranges[v[1]] != 0) {
                            if (((v[5] = Math.max(0, v[1] - ranges[v[1]])) | 1) != 0 && ((arr[v[5]] = Math.max(arr[v[5]], v[1] + ranges[v[1]])) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= n) {
                        if (v[1] > v[2]) {
                            if (v[3] <= v[2]) {
                                if (((ranges[0] = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                            } else {
                                if (((v[2] = v[3]) | 1) != 0 && ((v[4] += 1) | 1) != 0 && ((v[3] = Math.max(v[3], arr[v[1]])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[3] = Math.max(v[3], arr[v[1]])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((ranges[0] = v[4] + (v[2] < n ? 1 : 0)) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                }
            }
        }
        return ranges[0];
    }
}
