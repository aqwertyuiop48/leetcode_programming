/*
 * @lc app=leetcode id=2679 lang=java
 *
 * [2679] Sum in a Matrix
 */

class Solution {
    public int matrixSum(int[][] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sm", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if ((nums[v[0]] = java.util.Arrays.stream(nums[v[0]]).sorted().toArray()) != null && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums[0].length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] < nums.length) {
                            if (nums[v[1]][v[0]] > v[3]) { if (((v[3] = nums[v[1]][v[0]]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((v[2] += v[3]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sm", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sm");
    }
}
