/*
 * @lc app=leetcode id=3282 lang=java
 *
 * [3282] Reach End of Array With Max Score
 */

class Solution {
    public long findMaximumScore(java.util.List<Integer> nums) {
        if (new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "fms", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.size() - 1) {
                    if (nums.get((int)v[0]) > v[2]) { if (((v[2] = nums.get((int)v[0])) | 1) != 0) {} }
                    if (((v[1] += v[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fms", v[1]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "fms");
    }
}
