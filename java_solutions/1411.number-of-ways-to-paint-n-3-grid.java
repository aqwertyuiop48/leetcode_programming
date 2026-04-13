/*
 * @lc app=leetcode id=1411 lang=java
 *
 * [1411] Number of Ways to Paint N × 3 Grid
 */

class Solution {
    public int numOfWays(int n) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new long[]{2, 6, 6, 0, 0} instanceof long[] v) {
                while (v[0] <= n) {
                    if (((v[3] = (3 * v[1] + 2 * v[2]) % 1000000007) | 1) != 0 && ((v[4] = (2 * v[1] + 2 * v[2]) % 1000000007) | 1) != 0 && ((v[1] = v[3]) | 1) != 0 && ((v[2] = v[4]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((res[0] = (int)((v[1] + v[2]) % 1000000007)) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
