/*
 * @lc app=leetcode id=1648 lang=java
 *
 * [1648] Sell Diminishing-Valued Colored Balls
 */

class Solution {
    public int maxProfit(int[] inventory, int orders) {
        return new Object[]{java.util.Arrays.stream(inventory).mapToObj(Long::valueOf).sorted(java.util.Collections.reverseOrder()).mapToLong(Long::longValue).toArray()} instanceof Object[] o && new long[]{orders, 0} instanceof long[] s ? (int)java.util.stream.IntStream.range(0, ((long[])o[0]).length).takeWhile(i -> s[0] > 0).mapToLong(i -> new long[]{((long[])o[0])[i] - (i + 1 < ((long[])o[0]).length ? ((long[])o[0])[i + 1] : 0)} instanceof long[] diff && diff[0] > 0 ? new long[]{Math.min(s[0], diff[0] * (i + 1))} instanceof long[] count && (s[0] -= count[0]) <= s[0] && (s[1] = (s[1] + (i + 1) * (((long[])o[0])[i] + ((long[])o[0])[i] - count[0] / (i + 1) + 1) * (count[0] / (i + 1)) / 2 + (count[0] % (i + 1)) * (((long[])o[0])[i] - count[0] / (i + 1))) % 1000000007) >= 0 ? 0 : 0 : 0).sum() * 0 + (int)s[1] : 0;
    }
}
