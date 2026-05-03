/*
 * @lc app=leetcode id=3896 lang=java
 *
 * [3896] Minimum Operations to Transform Array into Alternating Prime
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[100050] instanceof int[] isP && new int[15] instanceof int[] v && (System.getProperties().put("mot", 0) != null | true)) {
            if (((v[0] = 2) | 1) != 0) {
                while (v[0] < 100050) { if (((isP[v[0]++] = 1) | 1) != 0) {} }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] * v[0] < 100050) {
                        if (isP[v[0]] == 1) { if (((v[1] = v[0] * v[0]) | 1) != 0) { while (v[1] < 100050) { if (((isP[v[1]] = 0) | 1) != 0 && ((v[1] += v[0]) | 1) != 0) {} } } }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[3] = nums[v[0]]) | 1) != 0) {
                            if (v[0] % 2 == 0) {
                                while (isP[v[3]] == 0) { if (((v[3] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                            } else {
                                while (isP[v[3]] == 1) { if (((v[3] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mot", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mot");
    }
}
