/*
 * @lc app=leetcode id=3731 lang=java
 *
 * [3731] Find Missing Elements
 */

class Solution {
    public java.util.List<Integer> findMissingElements(int[] nums) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && new int[10] instanceof int[] v && new boolean[105] instanceof boolean[] present && (System.getProperties().put(Thread.currentThread().getId() + "fme", ans) != null | true) && ((v[0] = 100) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[2] < nums.length) {
                if (nums[v[2]] < v[0]) { if (((v[0] = nums[v[2]]) | 1) != 0) {} }
                if (nums[v[2]] > v[1]) { if (((v[1] = nums[v[2]]) | 1) != 0) {} }
                if (((present[nums[v[2]]] = true) | true) && ((v[2] += 1) | 1) != 0) {}
            }
            if (((v[2] = v[0] + 1) | 1) != 0) {
                while (v[2] < v[1]) {
                    if (!present[v[2]]) { if (ans.add(v[2]) | true) {} }
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "fme");
    }
}
