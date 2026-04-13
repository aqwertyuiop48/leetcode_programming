/*
 * @lc app=leetcode id=1713 lang=java
 *
 * [1713] Minimum Operations to Make a Subsequence
 */

class Solution {
    public int minOperations(int[] target, int[] arr) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, target.length} instanceof int[] v && new int[300007] instanceof int[] keys && new int[300007] instanceof int[] vals && new int[100005] instanceof int[] max) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < 300007) {
                        if (((keys[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < v[7]) {
                        if (((v[2] = (target[v[1]] & 2147483647) % 300007) | 1) != 0) {
                            while (keys[v[2]] != -1) {
                                if (((v[2] = (v[2] + 1) % 300007) | 1) != 0) {}
                            }
                            if (((keys[v[2]] = target[v[1]]) | 1) != 0 && ((vals[v[2]] = v[1]) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[1] < arr.length) {
                        if (((v[2] = (arr[v[1]] & 2147483647) % 300007) | 1) != 0) {
                            while (keys[v[2]] != -1 && keys[v[2]] != arr[v[1]]) {
                                if (((v[2] = (v[2] + 1) % 300007) | 1) != 0) {}
                            }
                            if (keys[v[2]] == arr[v[1]]) {
                                if (((v[4] = 0) | 1) != 0 && ((v[5] = v[3] - 1) | 1) != 0) {
                                    while (v[4] <= v[5]) {
                                        if (((v[6] = (v[4] + v[5]) >>> 1) | 1) != 0) {
                                            if (max[v[6]] < vals[v[2]]) {
                                                if (((v[4] = v[6] + 1) | 1) != 0) {}
                                            } else {
                                                if (((v[5] = v[6] - 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (((max[v[4]] = vals[v[2]]) | 1) != 0) {
                                        if (v[4] == v[3]) {
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((target[0] = v[7] - v[3]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
        }
        return target[0];
    }
}
