/*
 * @lc app=leetcode id=2968 lang=java
 *
 * [2968] Apply Operations to Maximize Frequency Score
 */

class Solution { public int maxFrequencyScore(int[] nums, long k) { return ((Function<int[], Integer>) sorted -> ((Function<long[], Integer>) pref -> (IntStream.range(0, sorted.length).map(i -> (int)(pref[i + 1] = pref[i] + sorted[i])).sum() * 0 == 0) ? ((Function<int[], Integer>) state -> ((Function<BiFunction<Integer, Integer, Long>, Integer>) getCost -> IntStream.rangeClosed(2, sorted.length).map(end -> (state[0] += (int) IntStream.iterate(state[0], s -> s < end && getCost.apply(s, end) > k, s -> s + 1).count()) * 0 + (state[1] = Math.max(state[1], end - state[0])) * 0).sum() * 0 == 0 ? state[1] : 0).apply((BiFunction<Integer, Integer, Long>) (s, e) -> ((Function<Integer, Long>) m -> ((Function<Long, Long>) t -> (Long) ((t * (m - s) - (pref[m] - pref[s])) + (pref[e] - pref[m] - t * (e - m)))).apply((long)sorted[m])).apply((s + e) / 2))).apply(new int[]{0, 1}) : 0).apply(new long[sorted.length + 1])).apply(Arrays.stream(nums).sorted().toArray()); } }
