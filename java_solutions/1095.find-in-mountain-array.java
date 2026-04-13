/*
 * @lc app=leetcode id=1095 lang=java
 *
 * [1095] Find in Mountain Array
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if (new int[]{0, 0, mountainArr.length() - 1, 0, 0, 0, target} instanceof int[] v) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[1] < v[2]) {
                        if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                            if (mountainArr.get(v[3]) < mountainArr.get(v[3] + 1)) {
                                if (((v[1] = v[3] + 1) | 1) != 0) {}
                            } else {
                                if (((v[2] = v[3]) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[4] = v[1]) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = v[4]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= v[2]) {
                        if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0 && ((v[5] = mountainArr.get(v[3])) | 1) != 0) {
                            if (v[5] < v[6]) {
                                if (((v[1] = v[3] + 1) | 1) != 0) {}
                            } else if (v[5] > v[6]) {
                                if (((v[2] = v[3] - 1) | 1) != 0) {}
                            } else {
                                if (((target = v[3]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] = v[4]) | 1) != 0 && ((v[2] = mountainArr.length() - 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[1] <= v[2]) {
                        if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0 && ((v[5] = mountainArr.get(v[3])) | 1) != 0) {
                            if (v[5] < v[6]) {
                                if (((v[2] = v[3] - 1) | 1) != 0) {}
                            } else if (v[5] > v[6]) {
                                if (((v[1] = v[3] + 1) | 1) != 0) {}
                            } else {
                                if (((target = v[3]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((target = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                }
            }
        }
        return target;
    }
}
