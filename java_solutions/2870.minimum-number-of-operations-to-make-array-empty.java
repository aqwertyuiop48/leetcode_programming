/*
 * @lc app=leetcode id=2870 lang=java
 *
 * [2870] Minimum Number of Operations to Make Array Empty
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (m.put(nums[v[0]], (int)m.getOrDefault(nums[v[0]], 0) + 1) == null | true && ((v[0] += 1) | 1) != 0) {} }
            if (m.values().iterator() instanceof java.util.Iterator it && ((v[2] = 1) | 1) != 0) {
                while (it.hasNext() && v[2] == 1) {
                    if (((v[1] = (int)it.next()) | 1) != 0) {
                        if (v[1] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "mo", -1) != null | true && ((v[2] = 0) | 1) != 0) {} }
                        else { if (((v[3] += (v[1] + 2) / 3) | 1) != 0) {} }
                    }
                }
                if (v[2] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[3]) != null | true) {} }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
