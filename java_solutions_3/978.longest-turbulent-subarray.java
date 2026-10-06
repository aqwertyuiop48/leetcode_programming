/*
 * @lc app=leetcode id=978 lang=java
 *
 * [978] Longest Turbulent Subarray
 */

class Solution {
    public int maxTurbulenceSize(int[] arr) {
        return java.util.stream.IntStream.range(1, arr.length).boxed().reduce(new int[]{1, 1, 1},
            (s, i) -> arr[i - 1] < arr[i] ? new int[]{s[1] + 1, 1, Math.max(s[2], s[1] + 1)} : arr[i - 1] > arr[i] ? new int[]{1, s[0] + 1, Math.max(s[2], s[0] + 1)} : new int[]{1, 1, s[2]}, (a, b) -> a)[2];
    }
}
