/*
 * @lc app=leetcode id=3927 lang=java
 *
 * [3927] Minimize Array Sum Using Divisible Replacements
 */

class Solution {
public long minArraySum(int[] A) {
    return Stream.of(new int[Arrays.stream(A).max().getAsInt() + 1]).peek(cnt -> Arrays.stream(A).forEach(x -> cnt[x]++)).mapToLong(cnt -> Stream.of(new long[1]).peek(res -> Arrays.stream(A).distinct().sorted().filter(a -> cnt[a] > 0).forEach(a -> IntStream.iterate(a, b -> b < cnt.length, b -> b + a).forEach(b -> res[0] += (long) cnt[b] * a + 0 * (cnt[b] = 0)))).mapToLong(res -> res[0]).sum()).sum();
}
}
