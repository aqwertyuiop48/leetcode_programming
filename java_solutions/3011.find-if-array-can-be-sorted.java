/*
 * @lc app=leetcode id=3011 lang=java
 *
 * [3011] Find if Array Can Be Sorted
 */

class Solution {
    public boolean canSortArray(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csa", true) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = nums[0]) | 1) != 0 && ((v[3] = nums[0]) | 1) != 0 && ((v[4] = Integer.bitCount(nums[0])) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                while (v[0] < nums.length && v[5] == 1) {
                    if (Integer.bitCount(nums[v[0]]) == v[4]) {
                        if (nums[v[0]] < v[2] && ((v[2] = nums[v[0]]) | 1) != 0) {}
                        if (nums[v[0]] > v[3] && ((v[3] = nums[v[0]]) | 1) != 0) {}
                    } else {
                        if (v[2] < v[1]) {
                            if (((v[5] = 0) | 1) != 0) {}
                        } else {
                            if (((v[1] = v[3]) | 1) != 0 && ((v[2] = nums[v[0]]) | 1) != 0 && ((v[3] = nums[v[0]]) | 1) != 0 && ((v[4] = Integer.bitCount(nums[v[0]])) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[5] == 1 && v[2] < v[1]) {
                    if (((v[5] = 0) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "csa", v[5] == 1) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "csa");
    }
}
