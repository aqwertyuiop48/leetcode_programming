/*
 * @lc app=leetcode id=3971 lang=java
 *
 * [3971] Maximum Total Value
 */

class Solution {
public int maxTotalValue(int[] value, int[] decay, int m) {
    return LongStream.of(Stream.iterate(new long[]{1, 1_000_000_000L, 0}, s -> LongStream.of(s[0] + (s[1] - s[0]) / 2).mapToObj(mid -> IntStream.range(0, value.length).filter(i -> value[i] >= mid).mapToLong(i -> (value[i] - mid) / decay[i] + 1).sum() >= m ? new long[]{mid + 1, s[1], mid} : new long[]{s[0], mid - 1, s[2]}).findFirst().get()).dropWhile(s -> s[0] <= s[1]).findFirst().get()[2]).map(th -> IntStream.range(0, value.length).filter(i -> value[i] > th).mapToLong(i -> ((value[i] - th - 1) / decay[i] + 1) * (value[i] + value[i] - (value[i] - th - 1) / decay[i] * decay[i]) / 2).sum() + (m - IntStream.range(0, value.length).filter(i -> value[i] > th).mapToLong(i -> (value[i] - th - 1) / decay[i] + 1).sum()) * th).mapToInt(x -> (int) (x % 1_000_000_007L)).sum();
}
}
