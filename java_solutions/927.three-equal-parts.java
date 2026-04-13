/*
 * @lc app=leetcode id=927 lang=java
 *
 * [927] Three Equal Parts
 */

class Solution {
    public int[] threeEqualParts(int[] arr) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, -1, -1} instanceof int[] v) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[1] < arr.length) {
                        if (arr[v[1]] == 1) {
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (v[2] == 0) {
                            if (((arr[0] = 0) | 1) != 0 && ((arr[1] = 2) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                        } else if (v[2] % 3 != 0) {
                            if (((arr[0] = -1) | 1) != 0 && ((arr[1] = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[3] = v[2] / 3) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[1] < arr.length) {
                        if (arr[v[1]] == 1) {
                            if (v[4] == 0) {
                                if (((v[5] = v[1]) | 1) != 0) {}
                            } else if (v[4] == v[3]) {
                                if (((v[6] = v[1]) | 1) != 0) {}
                            } else if (v[4] == 2 * v[3]) {
                                if (((v[7] = v[1]) | 1) != 0) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[8] = v[7]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[8] < arr.length) {
                        if (arr[v[5]] != arr[v[8]] || arr[v[6]] != arr[v[8]]) {
                            if (((arr[0] = -1) | 1) != 0 && ((arr[1] = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                        } else {
                            if (((v[5] += 1) | 1) != 0 && ((v[6] += 1) | 1) != 0 && ((v[8] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((arr[0] = v[5] - 1) | 1) != 0 && ((arr[1] = v[6]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                }
            }
        }
        return new int[]{arr[0], arr[1]};
    }
}
