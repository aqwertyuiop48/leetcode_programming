/*
 * @lc app=leetcode id=1569 lang=java
 *
 * [1569] Number of Ways to Reorder Array to Get Same BST
 */

class Solution {
    public int numOfWays(int[] nums) {
        if (new int[]{0, 0, 0, 1000000007, nums.length, 0} instanceof int[] v && new Object[]{new long[nums.length + 1][nums.length + 1], new int[nums.length + 1], new int[nums.length + 1], new int[nums.length + 1], new long[nums.length + 1]} instanceof Object[] obj) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] <= v[4]) {
                        if ((((long[][])obj[0])[v[1]][0] = 1) != 0 || true) {
                            if ((((int[])obj[1])[v[1]] = v[4]) != 0 || true) {
                                if ((((int[])obj[2])[v[1]] = v[4]) != 0 || true) {
                                    if (((v[2] = 1) | 1) != 0) {
                                        if (((v[0] = 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    } else {
                        if ((((long[])obj[4])[v[4]] = 1) != 0 || true) {
                            if (((v[1] = 1) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[2] <= v[1]) {
                        if ((((long[][])obj[0])[v[1]][v[2]] = (((long[][])obj[0])[v[1] - 1][v[2] - 1] + ((long[][])obj[0])[v[1] - 1][v[2]]) % v[3]) != 0 || true) {
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0) {
                            if (((v[0] = 0) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[1] < v[4]) {
                        if (((v[2] = 0) | 1) != 0) {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = v[4] - 1) | 1) != 0) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 3) {
                    if (nums[v[1]] < nums[v[2]]) {
                        if (((int[])obj[1])[v[2]] == v[4]) {
                            if ((((int[])obj[1])[v[2]] = v[1]) != 0 || true) {
                                if (((v[1] += 1) | 1) != 0) {
                                    if (((v[0] = 2) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[2] = ((int[])obj[1])[v[2]]) | 1) != 0) {}
                        }
                    } else {
                        if (((int[])obj[2])[v[2]] == v[4]) {
                            if ((((int[])obj[2])[v[2]] = v[1]) != 0 || true) {
                                if (((v[1] += 1) | 1) != 0) {
                                    if (((v[0] = 2) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[2] = ((int[])obj[2])[v[2]]) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 4) {
                    if (v[1] >= 0) {
                        if ((((int[])obj[3])[v[1]] = 1 + ((int[])obj[3])[((int[])obj[1])[v[1]]] + ((int[])obj[3])[((int[])obj[2])[v[1]]]) != 0 || true) {
                            if ((((long[])obj[4])[v[1]] = (((((long[][])obj[0])[((int[])obj[3])[v[1]] - 1][((int[])obj[3])[((int[])obj[1])[v[1]]]] * ((long[])obj[4])[((int[])obj[1])[v[1]]]) % v[3]) * ((long[])obj[4])[((int[])obj[2])[v[1]]]) % v[3]) != 0 || true) {
                                if (((v[1] -= 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((nums[0] = (int)((((long[])obj[4])[0] - 1 + v[3]) % v[3])) | 1) != 0) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return nums[0];
    }
}
