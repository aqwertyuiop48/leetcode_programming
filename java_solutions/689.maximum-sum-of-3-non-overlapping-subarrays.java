/*
 * @lc app=leetcode id=689 lang=java
 *
 * [689] Maximum Sum of 3 Non-Overlapping Subarrays
 */

class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        if (System.getProperties().put("ans689", new int[3]) != null || true) {
            if (new int[]{0, nums.length, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[nums.length + 1], new int[nums.length], new int[nums.length], System.getProperties().get("ans689")} instanceof Object[] obj) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (v[2] < v[1]) {
                            if ((((int[])obj[0])[v[2] + 1] = ((int[])obj[0])[v[2]] + nums[v[2]]) != -1) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = ((int[])obj[0])[k] - ((int[])obj[0])[0]) | 1) != 0 && ((v[2] = k) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[2] < v[1]) {
                            if (((int[])obj[0])[v[2] + 1] - ((int[])obj[0])[v[2] + 1 - k] > v[4]) {
                                if (((v[3] = v[2] + 1 - k) | 1) != 0 && ((v[4] = ((int[])obj[0])[v[2] + 1] - ((int[])obj[0])[v[3]]) | 1) != 0) {}
                            }
                            if ((((int[])obj[1])[v[2]] = v[3]) != -1) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 2) | 1) != 0 && ((v[3] = v[1] - k) | 1) != 0 && ((v[4] = ((int[])obj[0])[v[1]] - ((int[])obj[0])[v[1] - k]) | 1) != 0 && ((v[2] = v[1] - k - 1) | 1) != 0) {
                                if ((((int[])obj[2])[v[1] - k] = v[3]) != -1) {}
                            }
                        }
                    } else if (v[0] == 2) {
                        if (v[2] >= 0) {
                            if (((int[])obj[0])[v[2] + k] - ((int[])obj[0])[v[2]] >= v[4]) {
                                if (((v[3] = v[2]) | 1) != 0 && ((v[4] = ((int[])obj[0])[v[2] + k] - ((int[])obj[0])[v[2]]) | 1) != 0) {}
                            }
                            if ((((int[])obj[2])[v[2]] = v[3]) != -1) {
                                if (((v[2] -= 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 3) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[2] = k) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[2] <= v[1] - 2 * k) {
                            if (((v[5] = ((int[])obj[1])[v[2] - 1]) | 1) != 0 && ((v[6] = ((int[])obj[2])[v[2] + k]) | 1) != 0) {
                                if (((int[])obj[0])[v[5] + k] - ((int[])obj[0])[v[5]] + ((int[])obj[0])[v[2] + k] - ((int[])obj[0])[v[2]] + ((int[])obj[0])[v[6] + k] - ((int[])obj[0])[v[6]] > v[4]) {
                                    if (((v[4] = ((int[])obj[0])[v[5] + k] - ((int[])obj[0])[v[5]] + ((int[])obj[0])[v[2] + k] - ((int[])obj[0])[v[2]] + ((int[])obj[0])[v[6] + k] - ((int[])obj[0])[v[6]]) | 1) != 0) {
                                        if ((((int[])obj[3])[0] = v[5]) != -1 && ((((int[])obj[3])[1] = v[2]) != -1) && ((((int[])obj[3])[2] = v[6]) != -1)) {}
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("ans689");
    }
}
