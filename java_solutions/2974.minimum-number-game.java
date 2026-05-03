/*
 * @lc app=leetcode id=2974 lang=java
 *
 * [2974] Minimum Number Game
 */

class Solution {
    public int[] numberGame(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ng", nums) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = nums[v[0]]) | 1) != 0 && ((nums[v[0]] = nums[v[0] + 1]) | 1) != 0 && ((nums[v[0] + 1] = v[1]) | 1) != 0 && ((v[0] += 2) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ng", nums) != null | true) {}
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ng");
    }
}
