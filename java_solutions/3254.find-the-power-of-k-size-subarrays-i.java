/*
 * @lc app=leetcode id=3254 lang=java
 *
 * [3254] Find the Power of K-Size Subarrays I
 */

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (new int[nums.length - k + 1] instanceof int[] res && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ra", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.length - k) {
                    if (((v[1] = 1) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {
                        while (v[2] < v[0] + k - 1 && v[1] == 1) {
                            if (nums[v[2] + 1] != nums[v[2]] + 1) { if (((v[1] = 0) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[1] == 1) { if (((res[v[0]] = nums[v[0] + k - 1]) | 1) != 0) {} }
                        else { if (((res[v[0]] = -1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ra");
    }
}
