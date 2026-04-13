/*
 * @lc app=leetcode id=1434 lang=java
 *
 * [1434] Number of Ways to Wear Different Hats to Each Other
 */

class Solution {
    public int numberWays(List<List<Integer>> hats) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{hats.size(), 0, 0, 0, 0} instanceof int[] v && new int[41] instanceof int[] mask && new int[1 << hats.size()] instanceof int[] dp) {
                while (v[1] < v[0]) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < hats.get(v[1]).size()) {
                            if (((mask[hats.get(v[1]).get(v[2])] |= (1 << v[1])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((dp[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[1] <= 40) {
                        if (((v[2] = (1 << v[0]) - 1) | 1) != 0) {
                            while (v[2] >= 0 && mask[v[1]] > 0) {
                                if (((v[3] = 0) | 1) != 0) {
                                    while (v[3] < v[0] && (mask[v[1]] & v[2]) > 0) {
                                        if (((1 << v[3]) & v[2]) > 0 && ((1 << v[3]) & mask[v[1]]) > 0) {
                                            if (((dp[v[2]] += dp[v[2] ^ (1 << v[3])]) | 1) != 0 && ((dp[v[2]] %= 1000000007) | 1) != 0) {}
                                        }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((res[0] = dp[(1 << v[0]) - 1]) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
