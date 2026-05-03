/*
 * @lc app=leetcode id=3066 lang=java
 *
 * [3066] Minimum Operations to Exceed Threshold Value II
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        if (new java.util.PriorityQueue<Long>() instanceof java.util.PriorityQueue pq && new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mop", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                // Populate the Priority Queue
                while (v[0] < nums.length) {
                    if (pq.add((long)nums[(int)v[0]]) | true) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
                
                // Process elements until threshold is met
                if (((v[1] = 0) | 1) != 0) {
                    while (pq.size() >= 2 && (long)pq.peek() < k) {
                        if (((v[2] = (long)pq.poll()) | 1) != 0 && ((v[3] = (long)pq.poll()) | 1) != 0) {
                            if (pq.add(Math.min(v[2], v[3]) * 2L + Math.max(v[2], v[3])) | true) {}
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mop", (int)v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mop");
    }
}
