/*
 * @lc app=leetcode id=2023 lang=java
 *
 * [2023] Number of Pairs of Strings With Concatenation Equal to Target
 */

class Solution {
    public int numOfPairs(String[] nums, String target) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nop", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < nums.length) {
                        if (v[0] != v[1] && nums[v[0]].length() + nums[v[1]].length() == target.length() && target.startsWith(nums[v[0]]) && target.endsWith(nums[v[1]])) {
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "nop", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nop");
    }
}
