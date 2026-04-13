/*
 * @lc app=leetcode id=2382 lang=java
 *
 * [2382] Maximum Segment Sum After Removals
 */

class Solution { public long[] maximumSegmentSum(int[] nums, int[] removeQueries) { return ((Function<long[], Function<int[], Function<long[], long[]>>>) sums -> other -> state -> ((Function<long[], long[]>) ans -> IntStream.iterate(removeQueries.length - 1, i -> i >= 0, i -> i - 1).map(i -> ((IntUnaryOperator) now -> ((IntUnaryOperator) left -> ((IntUnaryOperator) right -> (other[left] = right) * 0 + (other[right] = left) * 0 + (int)((LongUnaryOperator) sum -> (sums[left] = sum) * 0L + (sums[right] = sum) * 0L + (ans[i] = state[0]) * 0L + (state[0] = Math.max(state[0], sum)) * 0L).applyAsLong(sums[left] + sums[right] + nums[now])).applyAsInt(sums[now + 2] == 0 ? now + 1 : other[now + 2])).applyAsInt(sums[now] == 0 ? now + 1 : other[now])).applyAsInt(removeQueries[i])).sum() * 0 == 0 ? ans : ans).apply(new long[removeQueries.length])).apply(new long[nums.length + 2]).apply(new int[nums.length + 2]).apply(new long[1]); } }
