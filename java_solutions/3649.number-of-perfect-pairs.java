/*
 * @lc app=leetcode id=3649 lang=java
 *
 * [3649] Number of Perfect Pairs
 */

class Solution {
    public long perfectPairs(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "npp", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((nums[v[0]] = Math.abs(nums[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if ((nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
                while (v[1] < nums.length) {
                    while ((long)nums[v[0]] * 2 < nums[v[1]]) { if (((v[0] += 1) | 1) != 0) {} }
                    if (((ans[0] += v[1] - v[0]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "npp", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "npp");
    }
}
