/*
 * @lc app=leetcode id=2448 lang=java
 *
 * [2448] Minimum Cost to Make Array Equal
 */

class Solution { public long minCost(int[] nums, int[] cost) { return ((Function<Function<Long, Long>, Long>) (costFn -> ((Function<long[], Long>) (state -> IntStream.iterate(0, dummy -> state[0] < state[1], dummy -> dummy + 1).mapToLong(dummy -> ((Function<Long, Long>) (mid -> ((Function<Long, Long>) (y1 -> ((Function<Long, Long>) (y2 -> (y1 < y2 ? (state[1] = mid) : (state[0] = mid + 1)) * 0L)).apply(costFn.apply(mid + 1L)))).apply(costFn.apply(mid)))).apply((state[0] + state[1]) / 2L)).sum() * 0L == 0L ? costFn.apply(state[0]) : 0L)).apply(new long[]{Arrays.stream(nums).min().orElse(0), Arrays.stream(nums).max().orElse(1000000)}))).apply(x -> IntStream.range(0, nums.length).mapToLong(i -> Math.abs((long)nums[i] - x) * cost[i]).sum()); } }
