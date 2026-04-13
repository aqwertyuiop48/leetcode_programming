/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (new int[2] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ts", new int[0]) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length - 1 && ((int[])System.getProperties().get(Thread.currentThread().getId() + "ts")).length == 0) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < nums.length && ((int[])System.getProperties().get(Thread.currentThread().getId() + "ts")).length == 0) {
                            if (nums[v[0]] + nums[v[1]] == target) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "ts", new int[]{v[0], v[1]}) != null | true) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ts");
    }
}
