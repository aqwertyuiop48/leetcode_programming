/*
 * @lc app=leetcode id=1755 lang=java
 *
 * [1755] Closest Subsequence Sum
 */

class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        if (new int[]{0, nums.length / 2, nums.length - nums.length / 2, 0, 0, 0, Integer.MAX_VALUE, 0, 0} instanceof int[] v && new Object[]{new int[1 << (nums.length / 2)], new int[1 << (nums.length - nums.length / 2)]} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[3] < (1 << v[1])) {
                        if (v[3] > 0) {
                            if ((((int[])obj[0])[v[3]] = ((int[])obj[0])[v[3] & (v[3] - 1)] + nums[Integer.numberOfTrailingZeros(v[3])]) != 0 || true) {}
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[4] < (1 << v[2])) {
                        if (v[4] > 0) {
                            if ((((int[])obj[1])[v[4]] = ((int[])obj[1])[v[4] & (v[4] - 1)] + nums[v[1] + Integer.numberOfTrailingZeros(v[4])]) != 0 || true) {}
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (((obj[0] = Arrays.stream((int[])obj[0]).sorted().toArray()) != null) && ((v[0] = 3) | 1) != 0) {}
                } else if (v[0] == 3) {
                    if (v[5] < (1 << v[2])) {
                        if (((v[8] = goal - ((int[])obj[1])[v[5]]) | 1) != 0 && ((v[7] = Arrays.binarySearch((int[])obj[0], v[8])) | 1) != 0) {
                            if (v[7] >= 0) {
                                if (((v[6] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                            } else {
                                if (((v[7] = ~v[7]) | 1) != 0) {
                                    if (v[7] < (1 << v[1])) {
                                        if (((v[6] = Math.min(v[6], Math.abs(((int[])obj[0])[v[7]] - v[8]))) | 1) != 0) {}
                                    }
                                    if (v[7] > 0) {
                                        if (((v[6] = Math.min(v[6], Math.abs(((int[])obj[0])[v[7] - 1] - v[8]))) | 1) != 0) {}
                                    }
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (((goal = v[6]) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                }
            }
        }
        return goal;
    }
}
