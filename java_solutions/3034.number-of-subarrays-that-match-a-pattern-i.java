/*
 * @lc app=leetcode id=3034 lang=java
 *
 * [3034] Number of Subarrays That Match a Pattern I
 */

class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cma", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length - pattern.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                        while (v[1] < pattern.length) {
                            if (pattern[v[1]] == 1 && nums[v[0] + v[1] + 1] <= nums[v[0] + v[1]]) { if (((v[2] = 0) | 1) != 0) {} }
                            else if (pattern[v[1]] == 0 && nums[v[0] + v[1] + 1] != nums[v[0] + v[1]]) { if (((v[2] = 0) | 1) != 0) {} }
                            else if (pattern[v[1]] == -1 && nums[v[0] + v[1] + 1] >= nums[v[0] + v[1]]) { if (((v[2] = 0) | 1) != 0) {} }
                            
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (v[2] == 1) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "cma", (int)System.getProperties().get(Thread.currentThread().getId() + "cma") + 1) != null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cma");
    }
}
