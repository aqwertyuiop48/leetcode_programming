/*
 * @lc app=leetcode id=3976 lang=java
 *
 * [3976] Maximum Subarray Sum After Multiplier
 */

class Solution {
public long maxSubarraySum(int[] v, int k) {
    return IntStream.of(0, 1).mapToLong(f -> LongStream.of(f == 0 ? v[0] / k : (long) v[0] * k).mapToObj(o -> Arrays.stream(v, 1, v.length).boxed().reduce(new long[]{v[0], o, -(long) 1e18, Math.max(v[0], o)}, (s, x) -> LongStream.of(f == 0 ? x / k : (long) x * k).mapToObj(val -> LongStream.of(Math.max(val, Math.max(s[0] + val, s[1] + val))).mapToObj(n2 -> LongStream.of(Math.max(s[1] + x, Math.max(s[2] + x, n2))).mapToObj(n3 -> new long[]{Math.max(x, s[0] + x), n2, n3, Math.max(s[3], Math.max(Math.max(x, s[0] + x), Math.max(n2, n3)))}).findFirst().get()).findFirst().get()).findFirst().get(), (a, b) -> a)).findFirst().get()[3]).max().getAsLong();
}
}
