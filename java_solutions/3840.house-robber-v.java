/*
 * @lc app=leetcode id=3840 lang=java
 *
 * [3840] House Robber V
 */

class Solution {
    public long rob(int[] nums, int[] colors) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "hr5", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = nums[0]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[2] < nums.length) {
                if (colors[(int)v[2] - 1] == colors[(int)v[2]]) {
                    if (((v[3] = v[0] + nums[(int)v[2]]) | 1) != 0 && ((v[0] = Math.max(v[0], v[1])) | 1) != 0 && ((v[1] = v[3]) | 1) != 0) {}
                } else {
                    if (((v[3] = Math.max(v[0], v[1]) + nums[(int)v[2]]) | 1) != 0 && ((v[0] = Math.max(v[0], v[1])) | 1) != 0 && ((v[1] = v[3]) | 1) != 0) {}
                }
                if (((v[2] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "hr5", Math.max(v[0], v[1])) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "hr5");
    }
}
