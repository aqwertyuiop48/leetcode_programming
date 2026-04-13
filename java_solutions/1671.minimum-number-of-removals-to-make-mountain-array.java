/*
 * @lc app=leetcode id=1671 lang=java
 *
 * [1671] Minimum Number of Removals to Make Mountain Array
 */

class Solution {
    public int minimumMountainRemovals(int[] nums) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0} instanceof int[] v && new int[nums.length] instanceof int[] LIS && new int[nums.length] instanceof int[] LDS) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < nums.length) {
                            if (((LIS[v[1]] = 1) | 1) != 0 && ((LDS[v[1]] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < nums.length) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < v[1]) {
                                    if (nums[v[1]] > nums[v[2]]) {
                                        if (((LIS[v[1]] = Math.max(LIS[v[1]], LIS[v[2]] + 1)) | 1) != 0) {}
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 2) | 1) != 0 && ((v[1] = nums.length - 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[1] >= 0) {
                            if (((v[2] = nums.length - 1) | 1) != 0) {
                                while (v[2] > v[1]) {
                                    if (nums[v[1]] > nums[v[2]]) {
                                        if (((LDS[v[1]] = Math.max(LDS[v[1]], LDS[v[2]] + 1)) | 1) != 0) {}
                                    }
                                    if (((v[2] -= 1) | 1) != 0) {}
                                }
                                if (((v[1] -= 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 3) | 1) != 0 && ((v[1] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[1] < nums.length - 1) {
                            if (LIS[v[1]] > 1 && LDS[v[1]] > 1) {
                                if (((v[3] = Math.max(v[3], LIS[v[1]] + LDS[v[1]] - 1)) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((res[0] = nums.length - v[3]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
