/*
 * @lc app=leetcode id=2999 lang=java
 *
 * [2999] Count the Number of Powerful Integers
 */

class Solution { public long numberOfPowerfulInt(long rangeStart, long rangeEnd, int limit, String s) { return ((Function<LongUnaryOperator, Long>) countFunc -> countFunc.applyAsLong(rangeEnd) - countFunc.applyAsLong(rangeStart - 1)).apply(cap -> ((ToLongFunction<String>) flow -> flow.length() < s.length() ? 0L : ((ToLongFunction<long[]>) state -> IntStream.rangeClosed(1, flow.length() - s.length()).map(i -> flow.length() - s.length() - i).reduce(0, (acc, i) -> (int)((state[1] = (flow.charAt(i) - '0' <= limit ? (flow.charAt(i) - '0') * state[0] + state[1] : (limit + 1L) * state[0])) * 0L + (state[0] = state[0] * (limit + 1L)) * 0L)) * 0 == 0 ? state[1] : 0L).applyAsLong(new long[]{1L, flow.substring(flow.length() - s.length()).compareTo(s) >= 0 ? 1L : 0L})).applyAsLong(Long.toString(cap))); } }
