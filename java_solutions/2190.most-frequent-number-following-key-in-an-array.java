/*
 * @lc app=leetcode id=2190 lang=java
 *
 * [2190] Most Frequent Number Following Key In an Array
 */

class Solution {
    public int mostFrequent(int[] nums, int key) {
        if (new int[1005] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mf", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length - 1) {
                if (nums[v[0]] == key) {
                    if (((c[nums[v[0] + 1]] += 1) | 1) != 0 && c[nums[v[0] + 1]] > v[2]) { if (((v[2] = c[nums[v[0] + 1]]) | 1) != 0 && ((v[1] = nums[v[0] + 1]) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mf", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mf");
    }
}
