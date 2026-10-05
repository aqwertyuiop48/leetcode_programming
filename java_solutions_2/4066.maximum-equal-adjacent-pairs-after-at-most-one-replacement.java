/*
 * @lc app=leetcode id=4066 lang=java
 *
 * [4066] Maximum Equal Adjacent Pairs After at Most One Replacement
 */

class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        return java.util.stream.IntStream.range(1, nums.length).collect(() -> new Object[]{new int[2], new java.util.HashMap<Long, Integer>()}, (st, i) -> java.util.Optional.of((long) Math.min(nums[i - 1], nums[i]) << 32 | Math.max(nums[i - 1], nums[i])).filter(k -> (k >>> 32) == (k & 0xFFFFFFFFL) ? (((int[]) st[0])[0]++) * 0 == 0 : (((int[]) st[0])[1] = Math.max(((int[]) st[0])[1], ((java.util.Map<Long, Integer>) st[1]).merge(k, 1, Integer::sum))) > -1), (a, b) -> {}) instanceof Object[] arr ? ((int[]) arr[0])[0] + ((int[]) arr[0])[1] : 0;
    }
}
