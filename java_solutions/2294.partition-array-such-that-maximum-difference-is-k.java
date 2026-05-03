/*
 * @lc app=leetcode id=2294 lang=java
 *
 * [2294] Partition Array Such That Maximum Difference Is K
 */

class Solution {
    public int partitionArray(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "pa", 0) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = nums[0]) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] - v[2] > k) { if (((v[1] += 1) | 1) != 0 && ((v[2] = nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "pa", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "pa");
    }
}
