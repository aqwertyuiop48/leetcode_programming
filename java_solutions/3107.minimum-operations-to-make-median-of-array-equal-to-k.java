/*
 * @lc app=leetcode id=3107 lang=java
 *
 * [3107] Minimum Operations to Make Median of Array Equal to K
 */

class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mom", 0L) != null | true)) {
            if (new int[256] instanceof int[] cnt && new int[nums.length] instanceof int[] tmp && ((v[0] = 0) | 1) != 0) {
                while (v[0] <= 24) {
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]++] = 0) | 1) != 0) {} } }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < nums.length) { if (((cnt[(nums[v[1]++] >> v[0]) & 255] += 1) | 1) != 0) {} } }
                    if (((v[1] = 1) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]] += cnt[v[1] - 1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[1] = nums.length - 1) | 1) != 0) {
                        while (v[1] >= 0) { if (((tmp[--cnt[(nums[v[1]] >> v[0]) & 255]] = nums[v[1]]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < nums.length) { if (((nums[v[1]] = tmp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[0] += 8) | 1) != 0) {}
                }
                if (((v[0] = nums.length / 2) | 1) != 0) {
                    if (nums[v[0]] == k) { if (System.getProperties().put(Thread.currentThread().getId() + "mom", 0L) != null | true) {} }
                    else if (nums[v[0]] < k) {
                        if (((v[1] = v[0]) | 1) != 0) {
                            while (v[1] < nums.length && nums[v[1]] < k) {
                                if (((lv[0] += k - nums[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] = v[0]) | 1) != 0) {
                            while (v[1] >= 0 && nums[v[1]] > k) {
                                if (((lv[0] += nums[v[1]] - k) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mom", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mom");
    }
}
