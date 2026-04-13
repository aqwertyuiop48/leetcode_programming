/*
 * @lc app=leetcode id=2681 lang=java
 *
 * [2681] Power of Heroes
 */

class Solution { public int sumOfPower(int[] nums) { return ((Function<long[], Integer>) state -> (int)(IntStream.of(nums).sorted().mapToLong(x -> (state[0] = (state[0] + (state[1] + x) % 1000000007 * x % 1000000007 * x % 1000000007) % 1000000007) * 0L + (state[1] = (state[1] * 2 + x) % 1000000007) * 0L).sum() * 0L == 0L ? state[0] : 0)).apply(new long[2]); } }
