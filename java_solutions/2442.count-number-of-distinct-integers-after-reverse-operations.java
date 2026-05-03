/*
 * @lc app=leetcode id=2442 lang=java
 *
 * [2442] Count Number of Distinct Integers After Reverse Operations
 */

class Solution {
    public int countDistinctIntegers(int[] nums) {
        if (System.getProperties().put("cdi", new java.util.HashSet<Integer>()) != null | true && new int[10] instanceof int[] v) {
            if (System.getProperties().get("cdi") instanceof java.util.Set s && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (s.add(nums[v[0]]) | true && ((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] > 0) { if (((v[2] = v[2] * 10 + v[1] % 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                        if (s.add(v[2]) | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return ((java.util.Set)System.getProperties().get("cdi")).size();
    }
}
