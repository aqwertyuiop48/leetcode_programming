/*
 * @lc app=leetcode id=3810 lang=java
 *
 * [3810] Minimum Operations to Reach Target Array
 */

class Solution {
    public int minOperations(int[] nums, int[] target) {
        if (new int[100005] instanceof int[] seen && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "morta", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] != target[v[0]]) {
                        if (seen[nums[v[0]]] == 0) {
                            if (((seen[nums[v[0]]] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "morta", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "morta");
    }
}
