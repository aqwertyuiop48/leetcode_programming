/*
 * @lc app=leetcode id=1300 lang=java
 *
 * [1300] Sum of Mutated Array Closest to Target
 */

class Solution {
    public int findBestValue(int[] arr, int target) {
        return java.util.Optional.of(new int[]{0, java.util.Arrays.stream(arr).max().getAsInt(), 0}).filter(s -> java.util.stream.IntStream.generate(() -> 0).takeWhile(dummy -> s[0] < s[1] ? ((s[2] = s[0] + (s[1] - s[0]) / 2) >= 0 && java.util.Arrays.stream(arr).map(v -> Math.min(v, s[2])).sum() >= target ? (s[1] = s[2]) >= 0 : (s[0] = s[2] + 1) >= 0) : false).count() >= 0).map(s -> Math.abs(java.util.Arrays.stream(arr).map(v -> Math.min(v, s[0] - 1)).sum() - target) <= Math.abs(java.util.Arrays.stream(arr).map(v -> Math.min(v, s[0])).sum() - target) ? s[0] - 1 : s[0]).get();
    }
}
