/*
 * @lc app=leetcode id=3364 lang=java
 *
 * [3364] Minimum Positive Sum Subarray 
 */

class Solution {
    public int minimumSumSubarray(java.util.List<Integer> nums, int l, int r) {
        if (new int[nums.size() + 1] instanceof int[] pref && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpsa", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 999999999) | 1) != 0) {
                while (v[0] < nums.size()) { if (((pref[v[0] + 1] = pref[v[0]] + nums.get(v[0])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = l) | 1) != 0) {
                    while (v[0] <= r) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] <= nums.size() - v[0]) {
                                if (((v[2] = pref[v[1] + v[0]] - pref[v[1]]) | 1) != 0) {
                                    if (v[2] > 0 && v[2] < v[4]) { if (((v[4] = v[2]) | 1) != 0) {} }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mpsa", v[4] == 999999999 ? -1 : v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpsa");
    }
}
