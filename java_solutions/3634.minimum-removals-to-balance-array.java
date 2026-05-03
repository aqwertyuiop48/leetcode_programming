/*
 * @lc app=leetcode id=3634 lang=java
 *
 * [3634] Minimum Removals to Balance Array
 */

class Solution {
    public int minRemoval(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mr", 0) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                while (v[1] < nums.length && nums[v[1]] <= (long)nums[v[0]] * k) { if (((v[1] += 1) | 1) != 0) {} }
                if (v[1] - v[0] > v[2]) { if (((v[2] = v[1] - v[0]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mr", nums.length - v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mr");
    }
}
