/*
 * @lc app=leetcode id=2136 lang=java
 *
 * [2136] Earliest Possible Day of Full Bloom
 */

class Solution { public int earliestFullBloom(int[] plantTime, int[] growTime) { return ((Function<long[], Integer>) sorted -> ((ToIntFunction<long[]>) state -> IntStream.range(0, sorted.length).reduce(0, (acc, i) -> (int)((state[0] += (sorted[i] & 0xFFFFFFFFL)) * 0L + (state[1] = Math.max(state[1], state[0] + 1000000000L - (sorted[i] >>> 32))) * 0L)) * 0 == 0 ? (int)state[1] : 0).applyAsInt(new long[2])).apply(IntStream.range(0, plantTime.length).mapToLong(i -> ((1000000000L - growTime[i]) << 32) | (long)plantTime[i]).sorted().toArray()); } }
