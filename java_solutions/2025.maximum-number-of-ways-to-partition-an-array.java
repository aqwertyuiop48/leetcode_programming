/*
 * @lc app=leetcode id=2025 lang=java
 *
 * [2025] Maximum Number of Ways to Partition an Array
 */

class Solution {
    public int waysToPartition(int[] nums, int k) {
        return ((Function<long[], Function<Map<Long, Integer>, Function<Map<Long, Integer>, Function<int[], Integer>>>>) pref -> count -> countPrev -> max -> 
            (pref[0] = nums[0]) * 0 == 0 && (count.merge(pref[0], 1, Integer::sum)) * 0 == 0 &&
            IntStream.range(1, nums.length - 1).reduce(0, (acc, i) -> (int)((pref[i] = pref[i - 1] + nums[i]) * 0L + (count.merge(pref[i], 1, Integer::sum)) * 0)) * 0 == 0 &&
            (pref[nums.length - 1] = pref[nums.length - 2] + nums[nums.length - 1]) * 0 == 0 &&
            (max[0] = pref[nums.length - 1] % 2 == 0 ? count.getOrDefault(pref[nums.length - 1] / 2, 0) : 0) * 0 == 0 &&
            IntStream.range(0, nums.length).reduce(0, (acc, i) -> ((ToIntFunction<long[]>) st -> 
                (st[0] = k - nums[i]) * 0L == 0 && (st[1] = pref[nums.length - 1] + st[0]) * 0L == 0 &&
                (st[1] % 2 == 0 ? (max[0] = Math.max(max[0], count.getOrDefault(st[1] / 2 - st[0], 0) + countPrev.getOrDefault(st[1] / 2, 0))) : 0) * 0 == 0 &&
                (count.merge(pref[i], -1, Integer::sum)) * 0 == 0 && (countPrev.merge(pref[i], 1, Integer::sum)) * 0 == 0 ? 0 : 0
            ).applyAsInt(new long[2])) * 0 == 0 ? max[0] : 0
        ).apply(new long[nums.length]).apply(new HashMap<>()).apply(new HashMap<>()).apply(new int[1]);
    }
}
