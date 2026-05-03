/*
 * @lc app=leetcode id=1838 lang=java
 *
 * [1838] Frequency of the Most Frequent Element
 */

class Solution {
    public int maxFrequency(int[] nums, int k) {
        return java.util.Optional.of(java.util.Arrays.stream(nums).sorted().toArray()).map(a -> java.util.Optional.of(new long[]{0, 0, 0}).map(s -> java.util.stream.IntStream.range(0, a.length).map(j -> (int)((s[1] += a[j]) * 0 + java.util.stream.Stream.generate(() -> 0).takeWhile(d -> (long)a[j] * (j - s[0] + 1) > s[1] + k).map(d -> s[1] -= a[(int)s[0]++]).count() * 0 + (s[2] = Math.max(s[2], j - s[0] + 1)))).max().getAsInt()).get()).get();
    }
}
