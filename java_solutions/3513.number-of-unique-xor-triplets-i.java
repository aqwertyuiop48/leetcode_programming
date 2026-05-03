/*
 * @lc app=leetcode id=3513 lang=java
 *
 * [3513] Number of Unique XOR Triplets I
 */

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if (new int[2] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nux1", 0) != null | true)) {
            if (((v[0] = nums.length) | 1) != 0) {
                if (v[0] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "nux1", 1) != null | true) {} }
                else if (v[0] == 2) { if (System.getProperties().put(Thread.currentThread().getId() + "nux1", 2) != null | true) {} }
                else { if (System.getProperties().put(Thread.currentThread().getId() + "nux1", Integer.highestOneBit(v[0]) << 1) != null | true) {} }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nux1");
    }
}
