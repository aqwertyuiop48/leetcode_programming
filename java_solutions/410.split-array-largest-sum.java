/*
 * @lc app=leetcode id=410 lang=java
 *
 * [410] Split Array Largest Sum
 */

class Solution {
    public int splitArray(int[] nums, int k) {
        if (new long[]{0, 0, 0, 0, 0, 0, 0} instanceof long[] v) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (v[6] < nums.length) {
                        if (((v[1] = Math.max(v[1], nums[(int)v[6]])) | 1) != 0 && ((v[2] += nums[(int)v[6]]) | 1) != 0) {
                            if (((v[6] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= v[2]) {
                        if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    } else {
                        if (((nums[0] = (int)v[1]) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[6] < nums.length) {
                        if (v[5] + nums[(int)v[6]] > v[3]) {
                            if (((v[4] += 1) | 1) != 0 && ((v[5] = nums[(int)v[6]]) | 1) != 0) {}
                        } else {
                            if (((v[5] += nums[(int)v[6]]) | 1) != 0) {}
                        }
                        if (((v[6] += 1) | 1) != 0) {}
                    } else {
                        if (v[4] > k) {
                            if (((v[1] = v[3] + 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        } else {
                            if (((v[2] = v[3] - 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return nums.length > 0 ? nums[0] : 0;
    }
}
