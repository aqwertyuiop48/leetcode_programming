/*
 * @lc app=leetcode id=2295 lang=java
 *
 * [2295] Replace Elements in an Array
 */

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && (System.getProperties().put(Thread.currentThread().getId() + "ac", nums) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (m.put(nums[v[0]], v[0]) == null | true && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < operations.length) {
                    if (((v[1] = (int)m.get(operations[v[0]][0])) | 1) != 0 && ((nums[v[1]] = operations[v[0]][1]) | 1) != 0 && m.remove(operations[v[0]][0]) == null | true && m.put(operations[v[0]][1], v[1]) == null | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ac");
    }
}
