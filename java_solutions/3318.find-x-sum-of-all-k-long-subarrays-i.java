/*
 * @lc app=leetcode id=3318 lang=java
 *
 * [3318] Find X-Sum of All K-Long Subarrays I
 */

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        if (new int[nums.length - k + 1] instanceof int[] ans && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fxs", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.length - k) {
                    if (new int[55] instanceof int[] cnt && new int[55] instanceof int[] vals && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < k) { if (((cnt[nums[v[0] + v[1]]] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                        if (((v[1] = 1) | 1) != 0) { while (v[1] <= 50) { if (((vals[v[1]] = v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] <= 50) {
                                if (((v[2] = v[1] + 1) | 1) != 0) {
                                    while (v[2] <= 50) {
                                        if (cnt[vals[v[1]]] < cnt[vals[v[2]]] || (cnt[vals[v[1]]] == cnt[vals[v[2]]] && vals[v[1]] < vals[v[2]])) {
                                            if (((v[3] = vals[v[1]]) | 1) != 0 && ((vals[v[1]] = vals[v[2]]) | 1) != 0 && ((vals[v[2]] = v[3]) | 1) != 0) {}
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[1] <= x && v[1] <= 50) {
                                if (cnt[vals[v[1]]] > 0) { if (((v[2] += vals[v[1]] * cnt[vals[v[1]]]) | 1) != 0) {} }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                            if (((ans[v[0]] = v[2]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "fxs");
    }
}
