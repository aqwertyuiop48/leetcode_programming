/*
 * @lc app=leetcode id=3834 lang=java
 *
 * [3834] Merge Adjacent Equal Elements
 */

class Solution {
    public java.util.List<Long> mergeAdjacent(int[] nums) {
        if (new long[nums.length + 5] instanceof long[] stack && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mae", new java.util.ArrayList<Long>()) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((stack[v[1]++] = nums[v[0]]) | 1) != 0) {
                        while (v[1] > 1 && stack[v[1] - 1] == stack[v[1] - 2]) {
                            if (((stack[v[1] - 2] += stack[v[1] - 1]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().get(Thread.currentThread().getId() + "mae") instanceof java.util.List res && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[1]) { if (res.add(stack[v[2]]) || true) { if (((v[2] += 1) | 1) != 0) {} } }
                }
            }
        }
        return (java.util.List<Long>) System.getProperties().get(Thread.currentThread().getId() + "mae");
    }
}
