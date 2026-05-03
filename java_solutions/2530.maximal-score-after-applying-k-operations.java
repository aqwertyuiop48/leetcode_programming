/*
 * @lc app=leetcode id=2530 lang=java
 *
 * [2530] Maximal Score After Applying K Operations
 */

class Solution {
    public long maxKelements(int[] nums, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mk", 0L) != null | true) && new java.util.PriorityQueue<Integer>((a,b)->Integer.compare(b,a)) instanceof java.util.PriorityQueue pq && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (pq.add(nums[(int)v[0]]) | true && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < k) { if (((v[1] = (int)pq.poll()) | 1) != 0 && ((v[2] += v[1]) | 1) != 0 && pq.add((int)Math.ceil(v[1] / 3.0)) | true && ((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "mk", v[2]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mk");
    }
}
