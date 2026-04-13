/*
 * @lc app=leetcode id=1224 lang=java
 *
 * [1224] Maximum Equal Frequency
 */

class Solution {
    public int maxEqualFreq(int[] nums) {
        if (new int[]{0, 0, 0, 0} instanceof int[] v && new int[100005] instanceof int[] F && new int[100005] instanceof int[] V) {
            while (v[0] < nums.length) {
                if (((v[1] = nums[v[0]]) | 1) != 0 && ((F[v[1]] += 1) | 1) != 0 && ((v[2] = F[v[1]]) | 1) != 0) {
                    if (v[2] > 1) {
                        if (((V[v[2] - 1] -= 1) | 1) != 0) {}
                    }
                    if (((V[v[2]] += 1) | 1) != 0 && ((v[3] = Math.max(v[3], v[2])) | 1) != 0) {
                        if (v[3] == 1 || (V[v[3]] * v[3] + V[v[3] - 1] * (v[3] - 1) == v[0] + 1 && V[v[3]] == 1) || (V[v[3]] * v[3] + 1 == v[0] + 1 && V[1] == 1)) {
                            if (System.setProperty("ans", String.valueOf(v[0] + 1)) != null || true) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "1"));
    }
}
