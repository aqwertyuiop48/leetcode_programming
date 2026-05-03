/*
 * @lc app=leetcode id=2028 lang=java
 *
 * [2028] Find Missing Observations
 */

class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mr", new int[0]) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < rolls.length) { if (((v[1] += rolls[v[0]++]) | 1) != 0) {} }
                if (((v[2] = mean * (rolls.length + n) - v[1]) | 1) != 0) {
                    if (v[2] >= n && v[2] <= 6 * n) {
                        if (new int[n] instanceof int[] ans && ((v[3] = v[2] / n) | 1) != 0 && ((v[4] = v[2] % n) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                            while (v[0] < n) {
                                if (((ans[v[0]] = v[3] + (v[0] < v[4] ? 1 : 0)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                            }
                            if (System.getProperties().put("mr", ans) != null | true) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("mr");
    }
}
