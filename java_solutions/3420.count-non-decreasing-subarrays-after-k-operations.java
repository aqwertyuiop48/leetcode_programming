/*
 * @lc app=leetcode id=3420 lang=java
 *
 * [3420] Count Non-Decreasing Subarrays After K Operations
 */

class Solution { public long countNonDecreasingSubarrays(int[] nums, long k) { return ((Function<long[], Long>) s -> ((Function<int[], Long>) st -> ((Function<int[], Long>) ht -> IntStream.range(0, nums.length).mapToLong(right -> new long[]{ IntStream.generate(() -> 0).takeWhile(x -> ht[1] > ht[0] && nums[nums.length - 1 - st[ht[1] - 1]] < nums[nums.length - 1 - right]).map(x -> (int)new long[]{ s[0] -= 1L * (st[ht[1] - 1] - (ht[1] > ht[0] + 1 ? st[ht[1] - 2] : (int)s[1] - 1)) * (nums[nums.length - 1 - right] - nums[nums.length - 1 - st[ht[1] - 1]]), ht[1]-- }[1] * 0 + 1 ).sum(), st[ht[1]++] = right, IntStream.generate(() -> 0).takeWhile(x -> s[0] < 0).map(x -> (int)new long[]{ s[0] += nums[nums.length - 1 - st[ht[0]]] - nums[nums.length - 1 - (int)s[1]], ht[0] += st[ht[0]] == (int)s[1] ? 1 : 0, s[1]++ }[2] * 0 + 1 ).sum(), right - (int)s[1] + 1 }[3] ).sum() ).apply(new int[2]) ).apply(new int[nums.length]) ).apply(new long[]{k, 0}); } }
