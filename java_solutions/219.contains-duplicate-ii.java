/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        return Stream.of(new HashMap<Integer,Integer>())
            .anyMatch(map -> IntStream.range(0, nums.length)
                .anyMatch(i -> Optional.ofNullable(map.put(nums[i], i))
                    .map(prev -> i - prev <= k)
                    .orElse(false)));
    }
}
