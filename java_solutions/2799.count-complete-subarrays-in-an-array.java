/*
 * @lc app=leetcode id=2799 lang=java
 *
 * [2799] Count Complete Subarrays in an Array
 */

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet s && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ccs", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (s.add(nums[v[0]]) | true && ((v[0] += 1) | 1) != 0) {} }
            if (((v[1] = s.size()) | 1) != 0 && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && ((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (m.put(nums[v[0]], (int)m.getOrDefault(nums[v[0]], 0) + 1) == null | true) {
                        while (m.size() == v[1]) {
                            if (((v[3] += nums.length - v[0]) | 1) != 0 && m.put(nums[v[2]], (int)m.get(nums[v[2]]) - 1) == null | true) {
                                if ((int)m.get(nums[v[2]]) == 0) { if (m.remove(nums[v[2]]) == null | true) {} }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ccs", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ccs");
    }
}
