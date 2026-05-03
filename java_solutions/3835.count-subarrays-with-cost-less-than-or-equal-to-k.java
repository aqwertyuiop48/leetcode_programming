/*
 * @lc app=leetcode id=3835 lang=java
 *
 * [3835] Count Subarrays With Cost Less Than or Equal to K
 */

class Solution {
    public long countSubarrays(int[] nums, long k) {
        if (new int[nums.length + 5] instanceof int[] q1 && new int[nums.length + 5] instanceof int[] q2 && new int[15] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "csa", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0) {
                while (v[1] < nums.length) {
                    while (v[2] < v[3] && nums[q1[v[3] - 1]] <= nums[v[1]]) { if (((v[3] -= 1) | 1) != 0) {} }
                    while (v[4] < v[5] && nums[q2[v[5] - 1]] >= nums[v[1]]) { if (((v[5] -= 1) | 1) != 0) {} }
                    if (((q1[v[3]++] = v[1]) | 1) != 0 && ((q2[v[5]++] = v[1]) | 1) != 0) {
                        while (v[0] < v[1] && (long)(nums[q1[v[2]]] - nums[q2[v[4]]]) * (v[1] - v[0] + 1) > k) {
                            if (((v[0] += 1) | 1) != 0) {
                                if (q1[v[2]] < v[0]) { if (((v[2] += 1) | 1) != 0) {} }
                                if (q2[v[4]] < v[0]) { if (((v[4] += 1) | 1) != 0) {} }
                            }
                        }
                        if (((lv[0] += (v[1] - v[0] + 1)) | 1) != 0) {}
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "csa", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "csa");
    }
}
