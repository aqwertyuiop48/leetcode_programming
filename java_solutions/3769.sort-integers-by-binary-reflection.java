/*
 * @lc app=leetcode id=3769 lang=java
 *
 * [3769] Sort Integers by Binary Reflection
 */

class Solution {
    public int[] sortByReflection(int[] nums) {
        if (new long[nums.length] instanceof long[] a && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sibr", nums) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] > 0) { if (((v[2] = (v[2] << 1) | (v[1] & 1)) | 1) != 0 && ((v[1] >>= 1) | 1) != 0) {} }
                    if (((a[v[0]] = ((long)v[2] << 32) | nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if ((a = java.util.Arrays.stream(a).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((nums[v[0]] = (int)(a[v[0]] & 0xFFFFFFFFL)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "sibr");
    }
}
