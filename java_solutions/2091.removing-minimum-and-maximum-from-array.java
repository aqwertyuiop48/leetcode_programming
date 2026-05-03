/*
 * @lc app=leetcode id=2091 lang=java
 *
 * [2091] Removing Minimum and Maximum From Array
 */

class Solution {
    public int minimumDeletions(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "md", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = nums[0]) | 1) != 0 && ((v[4] = nums[0]) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] < v[3]) { if (((v[3] = nums[v[0]]) | 1) != 0 && ((v[1] = v[0]) | 1) != 0) {} }
                if (nums[v[0]] > v[4]) { if (((v[4] = nums[v[0]]) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[5] = Math.min(v[1], v[2])) | 1) != 0 && ((v[6] = Math.max(v[1], v[2])) | 1) != 0) {
                if (System.getProperties().put(Thread.currentThread().getId() + "md", Math.min(v[6] + 1, Math.min(nums.length - v[5], v[5] + 1 + nums.length - v[6]))) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "md");
    }
}
