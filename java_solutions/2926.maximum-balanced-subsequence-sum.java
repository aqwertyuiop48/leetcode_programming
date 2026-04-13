/*
 * @lc app=leetcode id=2926 lang=java
 *
 * [2926] Maximum Balanced Subsequence Sum
 */

class Solution { public long maxBalancedSubsequenceSum(int[] nums) { return ((Function<TreeMap<Integer, Long>, Function<long[], Long>>) map -> ans -> IntStream.range(0, nums.length).mapToLong(i -> nums[i] <= 0 ? (ans[0] = Math.max(ans[0], nums[i])) * 0L : ((Function<Long, Long>) temp -> IntStream.iterate(0, x -> map.ceilingEntry(nums[i] - i) != null && map.ceilingEntry(nums[i] - i).getValue() < temp, x -> x + 1).mapToLong(x -> map.remove(map.ceilingKey(nums[i] - i)) == null ? 0L : 0L).sum() * 0L + ((map.floorEntry(nums[i] - i) == null || map.floorEntry(nums[i] - i).getValue() < temp) ? (map.put(nums[i] - i, temp) == null ? 0L : 0L) : 0L) + (ans[0] = Math.max(ans[0], temp)) * 0L).apply(nums[i] + (map.floorEntry(nums[i] - i) != null ? map.floorEntry(nums[i] - i).getValue() : 0L))).sum() * 0L == 0L ? ans[0] : 0L).apply(new TreeMap<>()).apply(new long[]{Integer.MIN_VALUE}); } }
