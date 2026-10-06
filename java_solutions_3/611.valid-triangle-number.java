/*
 * @lc app=leetcode id=611 lang=java
 *
 * [611] Valid Triangle Number
 */

class Solution {
    public int triangleNumber(int[] nums) {
        return java.util.Arrays.stream(nums).sorted().toArray() instanceof int[] a
            ? java.util.stream.IntStream.range(2, a.length).map(k -> new int[]{0, k - 1, 0} instanceof int[] s
                && java.util.stream.Stream.of(0).peek(z -> {
                    while (s[0] < s[1] && (a[s[0]] + a[s[1]] > a[k] ? (s[2] += s[1]-- - s[0]) >= 0 : ++s[0] >= 0)) {}
                }).anyMatch(z -> true) ? s[2] : 0).sum()
            : 0;
    }
}
