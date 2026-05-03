/*
 * @lc app=leetcode id=3092 lang=java
 *
 * [3092] Most Frequent IDs
 */

class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        if (new long[nums.length] instanceof long[] ans && new long[400005] instanceof long[] seg && new long[100005] instanceof long[] count && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mfi", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((count[nums[v[0]]] += freq[v[0]]) | 1) != 0 && ((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 1) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 100000) | 1) != 0) {
                        while (v[3] != v[4]) {
                            if (((v[5] = v[3] + (v[4] - v[3]) / 2) | 1) != 0) {
                                if (v[1] <= v[5]) { if (((v[2] = v[2] * 2) | 1) != 0 && ((v[4] = v[5]) | 1) != 0) {} }
                                else { if (((v[2] = v[2] * 2 + 1) | 1) != 0 && ((v[3] = v[5] + 1) | 1) != 0) {} }
                            }
                        }
                        if (((seg[v[2]] = count[nums[v[0]]]) | 1) != 0) {
                            while (v[2] > 1) {
                                if (((v[2] /= 2) | 1) != 0 && ((seg[v[2]] = Math.max(seg[v[2] * 2], seg[v[2] * 2 + 1])) | 1) != 0) {}
                            }
                        }
                        if (((ans[v[0]] = seg[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (long[]) System.getProperties().get(Thread.currentThread().getId() + "mfi");
    }
}
