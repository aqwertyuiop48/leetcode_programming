/*
 * @lc app=leetcode id=2261 lang=java
 *
 * [2261] K Divisible Elements Subarrays
 */

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        if (new int[10] instanceof int[] v && System.getProperties().put("cd", new java.util.HashSet<String>()) != null | true) {
            if (System.getProperties().get("cd") instanceof java.util.Set s && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && ((v[1] = 0) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {
                        while (v[2] < nums.length) {
                            if (nums[v[2]] % p == 0) { if (((v[1] += 1) | 1) != 0) {} }
                            if (v[1] > k) { if (((v[2] = nums.length) | 1) != 0) {} }
                            else { if (sb.append(nums[v[2]]).append(",") != null | true && s.add(sb.toString()) | true && ((v[2] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return ((java.util.Set)System.getProperties().get("cd")).size();
    }
}
