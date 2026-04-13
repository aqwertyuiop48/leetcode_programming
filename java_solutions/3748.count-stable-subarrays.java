/*
 * @lc app=leetcode id=3748 lang=java
 *
 * [3748] Count Stable Subarrays
 */

class Solution {
    public long[] countStableSubarrays(int[] nums, int[][] queries) {
        return Stream.<Object[]>of(new Object[]{ new long[nums.length], new long[nums.length + 1], new int[nums.length], new long[queries.length] }).peek(s -> IntStream.range(0, nums.length).forEach(i -> ((long[])s[0])[i] = (i == 0 || nums[i-1] > nums[i]) ? 1 : ((long[])s[0])[i-1] + 1)).peek(s -> IntStream.range(0, nums.length).forEach(i -> ((long[])s[1])[i+1] = ((long[])s[1])[i] + ((long[])s[0])[i])).peek(s -> IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).forEach(i -> ((int[])s[2])[i] = (i == nums.length - 1 || nums[i] > nums[i+1]) ? i : ((int[])s[2])[i+1])).map(s -> IntStream.range(0, queries.length).mapToLong(qi -> Stream.of(queries[qi]).mapToLong(q -> LongStream.of(Math.min(((int[])s[2])[q[0]], q[1])).map(r -> (r - q[0] + 1) * (r - q[0] + 2) / 2 + (r < q[1] ? ((long[])s[1])[q[1] + 1] - ((long[])s[1])[(int)r + 1] : 0)).findFirst().getAsLong()).findFirst().getAsLong()).peek(val -> {}).toArray()).map(res -> (long[])res).findFirst().get();
    }
}
