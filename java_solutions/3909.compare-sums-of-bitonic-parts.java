/*
 * @lc app=leetcode id=3909 lang=java
 *
 * [3909] Compare Sums of Bitonic Parts
 */

class Solution {
    public int compareBitonicSums(int[] nums) {
        if (new long[2] instanceof long[] sums && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csbp", -1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length - 1 && nums[v[0]] < nums[v[0] + 1]) {
                if (((sums[0] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[1] = v[0]) | 1) != 0) {
                while (v[1] < nums.length) {
                    if (((sums[1] += nums[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                }
                if (((sums[0] += nums[v[0]]) | 1) != 0) {
                    if (sums[0] > sums[1]) { if (System.getProperties().put(Thread.currentThread().getId() + "csbp", 0) != null | true) {} }
                    else if (sums[1] > sums[0]) { if (System.getProperties().put(Thread.currentThread().getId() + "csbp", 1) != null | true) {} }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "csbp");
    }
}
