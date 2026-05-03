/*
 * @lc app=leetcode id=3779 lang=java
 *
 * [3779] Minimum Number of Operations to Have Distinct Elements
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[10] instanceof int[] v && new java.util.HashSet<Integer>() instanceof java.util.HashSet st && (System.getProperties().put(Thread.currentThread().getId() + "mno", 0) != null | true) && ((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] >= 0 && v[1] == 0) {
                if (st.contains(nums[v[0]])) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mno", v[0] / 3 + 1) != null | true && ((v[1] = 1) | 1) != 0) {}
                } else {
                    if (st.add(nums[v[0]]) | true && ((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mno");
    }
}
