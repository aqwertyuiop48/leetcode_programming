/*
 * @lc app=leetcode id=3854 lang=java
 *
 * [3854] Minimum Operations to Make Array Parity Alternating
 */

class Solution {
    public int[] makeParityAlternating(int[] nums) {
        if (new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpa", new int[2]) != null | true)) {
            if (((v[0] = 2000000000) | 1) != 0 && ((v[1] = -2000000000) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[2] < nums.length) {
                    if (nums[v[2]] < v[0]) { if (((v[0] = nums[v[2]]) | 1) != 0) {} }
                    if (nums[v[2]] > v[1]) { if (((v[1] = nums[v[2]]) | 1) != 0) {} }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (((v[3] = 2000000000) | 1) != 0 && ((v[4] = 2000000000) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                    while (v[5] <= 1) { 
                        if (((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                            while (v[7] < nums.length) {
                                if ((Math.abs(nums[v[7]]) % 2) != (v[7] % 2 == v[5] ? 0 : 1)) { if (((v[6] += 1) | 1) != 0) {} }
                                if (((v[7] += 1) | 1) != 0) {}
                            }
                            if (v[6] < v[3]) { if (((v[3] = v[6]) | 1) != 0 && ((v[4] = 2000000000) | 1) != 0) {} }
                            if (v[6] == v[3]) {
                                if (((v[7] = v[0] - 1) | 1) != 0) {
                                    while (v[7] <= v[0] + 1) {
                                        if (((v[8] = v[1] - 1) | 1) != 0) {
                                            while (v[8] <= v[1] + 1) {
                                                if (v[7] <= v[8]) {
                                                    if (((v[9] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                                        while (v[2] < nums.length && v[9] == 1) {
                                                            if ((Math.abs(nums[v[2]]) % 2) == (v[2] % 2 == v[5] ? 0 : 1)) {
                                                                if (nums[v[2]] < v[7] || nums[v[2]] > v[8]) { if (((v[9] = 0) | 1) != 0) {} }
                                                            } else {
                                                                if ((nums[v[2]] - 1 < v[7] || nums[v[2]] - 1 > v[8]) && (nums[v[2]] + 1 < v[7] || nums[v[2]] + 1 > v[8])) {
                                                                    if (((v[9] = 0) | 1) != 0) {}
                                                                }
                                                            }
                                                            if (((v[2] += 1) | 1) != 0) {}
                                                        }
                                                        if (v[9] == 1 && v[8] - v[7] < v[4]) { if (((v[4] = v[8] - v[7]) | 1) != 0) {} }
                                                    }
                                                }
                                                if (((v[8] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[7] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mpa", new int[]{v[3], v[4]}) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mpa");
    }
}
