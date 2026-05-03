/*
 * @lc app=leetcode id=2012 lang=java
 *
 * [2012] Sum of Beauty in the Array
 */

class Solution {
    public int sumOfBeauties(int[] nums) {
        if (new int[10] instanceof int[] v && new int[nums.length] instanceof int[] rMin && (System.getProperties().put(Thread.currentThread().getId() + "sob", 0) != null | true)) {
            if (((rMin[nums.length - 1] = nums[nums.length - 1]) | 1) != 0 && ((v[0] = nums.length - 2) | 1) != 0) {
                while (v[0] >= 0) { if (((rMin[v[0]] = Math.min(rMin[v[0] + 1], nums[v[0]])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} }
                if (((v[1] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < nums.length - 1) {
                        if (nums[v[0]] > v[1] && nums[v[0]] < rMin[v[0] + 1]) { if (((v[2] += 2) | 1) != 0) {} }
                        else if (nums[v[0]] > nums[v[0] - 1] && nums[v[0]] < nums[v[0] + 1]) { if (((v[2] += 1) | 1) != 0) {} }
                        if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "sob", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sob");
    }
}
