/*
 * @lc app=leetcode id=3500 lang=java
 *
 * [3500] Minimum Cost to Divide Array Into Subarrays
 */

class Solution {
    public long minimumCost(int[] nums, int[] cost, int k) {
        return Optional.of(new Object[]{new long[nums.length], new long[nums.length + 1], new long[nums.length + 1]}).map((Object[] st) -> IntStream.range(0, nums.length).map(i -> (int)(((long[])st[0])[i] = i == 0 ? nums[0] : ((long[])st[0])[i - 1] + nums[i]) * 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, nums.length).map(inv -> nums.length - 1 - inv).map(i -> (int)(((long[])st[1])[i] = ((long[])st[1])[i + 1] + cost[i]) * 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, nums.length).map(inv -> nums.length - 1 - inv).map(i -> (int)((((long[])st[2])[i] = IntStream.range(i, nums.length).mapToLong(j -> ((((long[])st[0])[j] - (i == 0 ? 0L : ((long[])st[0])[i - 1]) + k) * ((long[])st[1])[i]) + ((long[])st[2])[j + 1]).min().orElse(Long.MAX_VALUE)) * 0)).sum() == 0 ? st : st).map((Object[] st) -> ((long[])st[2])[0]).get();
    }
}
