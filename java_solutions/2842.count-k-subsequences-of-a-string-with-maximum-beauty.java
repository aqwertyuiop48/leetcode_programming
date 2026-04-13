/*
 * @lc app=leetcode id=2842 lang=java
 *
 * [2842] Count K-Subsequences of a String With Maximum Beauty
 */

class Solution { public int countKSubsequencesWithMaxBeauty(String s, int k) { return ((Function<int[], Integer>) count -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> (count[s.charAt(i) - 'a']++) * 0) * 0 == 0 ? ((Function<int[], Integer>) sorted -> (k > 26 || sorted[26 - k] == 0) ? 0 : ((ToIntFunction<long[]>) state -> IntStream.of(sorted).reduce(0, (acc, freq) -> freq > sorted[26 - k] ? (int)((state[2]--) * 0L + (state[0] = (state[0] * freq) % 1000000007L) * 0L) : freq == sorted[26 - k] ? (int)((state[3]++) * 0L) : 0) * 0 == 0 && IntStream.range(0, (int)state[2]).reduce(0, (acc, i) -> (int)((state[1] = (state[1] * (state[3] - i) / (i + 1))) * 0L + (state[0] = (state[0] * sorted[26 - k]) % 1000000007L) * 0L)) * 0 == 0 ? (int)((state[0] * (state[1] % 1000000007L)) % 1000000007L) : 0).applyAsInt(new long[]{1L, 1L, k, 0L})).apply(IntStream.of(count).sorted().toArray()) : 0).apply(new int[26]); } }
