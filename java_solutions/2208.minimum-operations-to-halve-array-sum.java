/*
 * @lc app=leetcode id=2208 lang=java
 *
 * [2208] Minimum Operations to Halve Array Sum
 */

class Solution {
    public int halveArray(int[] nums) {
        if (System.getProperties().put("moh", 0) != null | true && new double[10] instanceof double[] dv && new int[10] instanceof int[] v && new Object[]{new java.util.PriorityQueue<Double>(java.util.Collections.reverseOrder())} instanceof Object[] o && o[0] instanceof java.util.PriorityQueue pq) {
            if (((v[0] = 0) | 1) != 0 && ((dv[0] = 0) != -1 | true)) {
                while (v[0] < nums.length) {
                    if (((dv[0] += nums[v[0]]) != -1 | true) && pq.offer((double)nums[v[0]]) | true && ((v[0] += 1) | 1) != 0) {}
                }
                if (((dv[1] = dv[0] / 2.0) != -1 | true) && ((v[1] = 0) | 1) != 0) {
                    while (dv[0] > dv[1]) {
                        if (((dv[2] = (double)pq.poll() / 2.0) != -1 | true) && ((dv[0] -= dv[2]) != -1 | true) && pq.offer(dv[2]) | true && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("moh", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("moh");
    }
}
