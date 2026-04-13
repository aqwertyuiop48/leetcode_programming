/*
 * @lc app=leetcode id=3229 lang=java
 *
 * [3229] Minimum Operations to Make Array Equal to Target
 */

class Solution { public long minimumOperations(int[] nums, int[] target) { return ((Function<long[], Long>) state -> IntStream.range(0, nums.length).mapToLong(i -> (long)target[i] - nums[i]).reduce(0L, (dummy, diff) -> diff > 0 ? ((state[2] += (state[0] < diff ? diff - state[0] : 0L)) * 0L) + ((state[0] = diff) * 0L) + ((state[1] = 0L) * 0L) : diff < 0 ? ((state[2] += (diff < state[1] ? state[1] - diff : 0L)) * 0L) + ((state[1] = diff) * 0L) + ((state[0] = 0L) * 0L) : ((state[0] = 0L) * 0L) + ((state[1] = 0L) * 0L)) * 0L == 0L ? state[2] : 0L).apply(new long[3]); } }
