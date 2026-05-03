/*
 * @lc app=leetcode id=2462 lang=java
 *
 * [2462] Total Cost to Hire K Workers
 */

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        if (new Object[]{new java.util.PriorityQueue<Integer>(), new java.util.PriorityQueue<Integer>()} instanceof Object[] o && o[0] instanceof java.util.PriorityQueue q1 && o[1] instanceof java.util.PriorityQueue q2 && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("tch", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = costs.length - 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[2] < k) {
                    while (q1.size() < candidates && v[0] <= v[1]) { if (q1.offer(costs[v[0]++]) | true) {} }
                    while (q2.size() < candidates && v[0] <= v[1]) { if (q2.offer(costs[v[1]--]) | true) {} }
                    if (((v[3] = q1.isEmpty() ? 999999999 : (int)q1.peek()) | 1) != 0 && ((v[4] = q2.isEmpty() ? 999999999 : (int)q2.peek()) | 1) != 0) {
                        if (v[3] <= v[4]) { if (((lv[0] += (int)q1.poll()) | 1) != 0) {} }
                        else { if (((lv[0] += (int)q2.poll()) | 1) != 0) {} }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("tch", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("tch");
    }
}
