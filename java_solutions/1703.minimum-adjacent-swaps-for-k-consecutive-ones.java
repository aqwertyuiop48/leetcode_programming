/*
 * @lc app=leetcode id=1703 lang=java
 *
 * [1703] Minimum Adjacent Swaps for K Consecutive Ones
 */

class Solution {
    public int minMoves(int[] nums, int k) {
        if (new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof long[] v && new Object[]{new int[nums.length + 1], new long[nums.length + 1]} instanceof Object[] obj) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] < nums.length) {
                        if (nums[(int)v[1]] == 1) {
                            if ((((int[])obj[0])[(int)v[2]] = (int)v[1]) != 0 || true) {
                                if ((((long[])obj[1])[(int)v[2] + 1] = ((long[])obj[1])[(int)v[2]] + v[1]) != 0 || true) {
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[4] = k / 2) | 1) != 0) {
                            if (((v[5] = k - 1 - v[4]) | 1) != 0) {
                                if (((v[6] = v[4] * (v[4] + 1) / 2 + v[5] * (v[5] + 1) / 2) | 1) != 0) {
                                    if (((v[3] = Long.MAX_VALUE) | 1) != 0) {
                                        if (((v[7] = 0) | 1) != 0) {
                                            if (((v[0] = 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[7] <= v[2] - k) {
                        if (((v[8] = v[7] + v[4]) | 1) != 0) {
                            if (((v[9] = ((long[])obj[1])[(int)v[8]] - ((long[])obj[1])[(int)v[7]]) | 1) != 0) {
                                if (((v[10] = ((long[])obj[1])[(int)(v[7] + k)] - ((long[])obj[1])[(int)(v[8] + 1)]) | 1) != 0) {
                                    if (((v[11] = v[10] - v[9] - (long)((int[])obj[0])[(int)v[8]] * (v[5] - v[4]) - v[6]) | 1) != 0) {
                                        if (((v[3] = Math.min(v[3], v[11])) | 1) != 0) {
                                            if (((v[7] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (((nums[0] = (int)v[3]) | 1) != 0) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return nums[0];
    }
}
