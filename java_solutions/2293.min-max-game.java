/*
 * @lc app=leetcode id=2293 lang=java
 *
 * [2293] Min Max Game
 */

class Solution {
    public int minMaxGame(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mmg", nums[0]) != null | true) && ((v[0] = nums.length) | 1) != 0) {
            while (v[0] > 1) {
                if (new int[v[0] / 2] instanceof int[] n && ((v[1] = 0) | 1) != 0) {
                    while (v[1] < v[0] / 2) {
                        if (v[1] % 2 == 0) { if (((n[v[1]] = Math.min(nums[2 * v[1]], nums[2 * v[1] + 1])) | 1) != 0) {} }
                        else { if (((n[v[1]] = Math.max(nums[2 * v[1]], nums[2 * v[1] + 1])) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((nums = n) != null | true) && ((v[0] /= 2) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mmg", nums[0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mmg");
    }
}
