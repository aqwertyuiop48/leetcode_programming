/*
 * @lc app=leetcode id=2233 lang=java
 *
 * [2233] Maximum Product After K Increments
 */

class Solution {
    public int maximumProduct(int[] nums, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpki", 0) != null | true) && new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue pq && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (pq.add(nums[(int)v[0]]) | true && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < k) { if (pq.add((int)pq.poll() + 1) | true && ((v[0] += 1) | 1) != 0) {} }
                if (((v[1] = 1) | 1) != 0) {
                    while (!pq.isEmpty()) { if (((v[1] = (v[1] * (int)pq.poll()) % 1000000007) | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mpki", (int)v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpki");
    }
}
