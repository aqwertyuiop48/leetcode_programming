/*
 * @lc app=leetcode id=915 lang=java
 *
 * [915] Partition Array into Disjoint Intervals
 */

class Solution {
    public int partitionDisjoint(int[] nums) {
        return new int[nums.length + 1] instanceof int[] suf && (suf[nums.length] = Integer.MAX_VALUE) > 0 && new int[]{Integer.MIN_VALUE} instanceof int[] mx
            && java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).peek(i -> suf[i] = Math.min(nums[i], suf[i + 1])).allMatch(x -> true)
            ? java.util.stream.IntStream.range(0, nums.length - 1).filter(i -> (mx[0] = Math.max(mx[0], nums[i])) <= suf[i + 1]).findFirst().getAsInt() + 1 : 0;
    }
}
