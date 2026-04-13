/*
 * @lc app=leetcode id=1655 lang=java
 *
 * [1655] Distribute Repeating Integers
 */

class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
        if (new int[]{0, nums.length, quantity.length, 0, 0, 0, 1, 0, 0, 0, 0} instanceof int[] v && new int[100005] instanceof int[] freq && new int[100005] instanceof int[] arr && new int[15] instanceof int[] state && new int[15] instanceof int[] chosen && new int[15][100005] instanceof int[][] seen && new int[15] instanceof int[] attempt) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[4] < v[1]) {
                        if (((freq[nums[v[4]]] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[4] < 100005) {
                        if (freq[v[4]] > 0) {
                            if (((arr[v[3]++] = freq[v[4]]) | 1) != 0) {}
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0 && ((v[4] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[4] < v[2]) {
                        if (((v[5] = v[4] + 1) | 1) != 0) {
                            while (v[5] < v[2]) {
                                if (quantity[v[4]] < quantity[v[5]]) {
                                    if (((v[9] = quantity[v[4]]) | 1) != 0 && ((quantity[v[4]] = quantity[v[5]]) | 1) != 0 && ((quantity[v[5]] = v[9]) | 1) != 0) {}
                                }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[7] == v[2]) {
                        if (((v[8] = 1) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    } else if (v[7] < 0) {
                        if (((v[8] = 0) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    } else {
                        if (v[6] == -1) {
                            if (((arr[chosen[v[7]]] += quantity[v[7]]) | 1) != 0 && ((v[6] = 1) | 1) != 0) {}
                        } else {
                            if (((attempt[v[7]] += 1) | 1) != 0) {}
                        }
                        if (((v[10] = v[7]) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                            while (state[v[10]] < v[3]) {
                                if (arr[state[v[10]]] >= quantity[v[10]] && seen[v[10]][arr[state[v[10]]]] != attempt[v[10]]) {
                                    if (((seen[v[10]][arr[state[v[10]]]] = attempt[v[10]]) | 1) != 0 && ((chosen[v[10]] = state[v[10]]) | 1) != 0 && ((arr[state[v[10]]] -= quantity[v[10]]) | 1) != 0 && ((state[v[10]] += 1) | 1) != 0 && ((v[7] += 1) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((state[v[7]] = 0) | 1) != 0 && ((v[9] = 1) | 1) != 0 && ((state[v[10]] += 1000000) | 1) != 0) {}
                                } else {
                                    if (((state[v[10]] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (v[9] == 1) {
                            if (((state[v[10]] -= 1000000) | 1) != 0) {}
                        } else {
                            if (((v[7] -= 1) | 1) != 0 && ((v[6] = -1) | 1) != 0) {}
                        }
                    }
                }
            }
            if (((nums[0] = v[8]) | 1) != 0) {}
        }
        return nums[0] == 1;
    }
}
