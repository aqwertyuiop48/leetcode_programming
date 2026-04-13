/*
 * @lc app=leetcode id=354 lang=java
 *
 * [354] Russian Doll Envelopes
 */

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (((envelopes = Arrays.stream(envelopes).sorted((a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null) || true) {
            if (new int[]{0, 0, 0} instanceof int[] v && new int[envelopes.length] instanceof int[] dp) {
                while (v[0] < envelopes.length) {
                    if (((v[1] = Arrays.binarySearch(dp, 0, v[2], envelopes[v[0]][1])) | 1) != 0) {
                        if (v[1] < 0) {
                            if (((v[1] = -(v[1] + 1)) | 1) != 0) {}
                        }
                        if (((dp[v[1]] = envelopes[v[0]][1]) | 1) != 0) {
                            if (v[1] == v[2]) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((envelopes[0][0] = v[2]) | 1) != 0) {}
            }
        }
        return envelopes[0][0];
    }
}
