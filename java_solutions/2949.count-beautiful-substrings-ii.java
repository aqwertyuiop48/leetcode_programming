/*
 * @lc app=leetcode id=2949 lang=java
 *
 * [2949] Count Beautiful Substrings II
 */

class Solution { public long beautifulSubstrings(String s, int k) { return ((Function<Integer, Long>) l -> ((Function<Map<Long, Long>, Long>) seen -> ((Function<long[], Long>) state -> (seen.put(((long)(l - 1) << 32) | 0L, 1L) == null || true ? 0L : 0L) + IntStream.range(0, s.length()).mapToLong(i -> (state[1] += ("aeiouAEIOU".indexOf(s.charAt(i)) >= 0 ? 1 : -1)) * 0L + (state[0] += seen.getOrDefault(((long)(i % l) << 32) | (state[1] & 0xFFFFFFFFL), 0L)) * 0L + seen.merge(((long)(i % l) << 32) | (state[1] & 0xFFFFFFFFL), 1L, (a, b) -> a + b) * 0L).sum() * 0L == 0L ? state[0] : 0L).apply(new long[2])).apply(new HashMap<>())).apply(IntStream.iterate(1, x -> x + 1).filter(x -> (x * x) % (k * 4) == 0).findFirst().orElse(1)); } }
