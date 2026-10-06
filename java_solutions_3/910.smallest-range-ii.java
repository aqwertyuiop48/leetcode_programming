/*
 * @lc app=leetcode id=910 lang=java
 *
 * [910] Smallest Range II
 */

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        return java.util.Arrays.stream(nums).sorted().toArray() instanceof int[] a
            ? Math.min(a[a.length - 1] - a[0], java.util.stream.IntStream.range(0, a.length - 1)
                .map(i -> Math.max(a[a.length - 1] - k, a[i] + k) - Math.min(a[0] + k, a[i + 1] - k)).min().orElse(Integer.MAX_VALUE)) : 0;
    }
}
