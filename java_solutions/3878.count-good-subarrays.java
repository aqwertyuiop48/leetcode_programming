/*
 * @lc app=leetcode id=3878 lang=java
 *
 * [3878] Count Good Subarrays
 */

class Solution {
    public long countGoodSubarrays(int[] nums) {
        return Optional.of(new Object[]{new int[31], new int[31], new int[nums.length], new int[nums.length], new HashMap<Integer, Integer>()}).map(st -> IntStream.range(0, 31).map(b -> (((int[])st[0])[b] = -1) * 0 + (((int[])st[1])[b] = nums.length) * 0).sum() * 0 + IntStream.range(0, nums.length).map(i -> (((int[])st[3])[i] = nums.length - 1) * 0).sum() * 0 == 0 ? st : st).map(st -> IntStream.range(0, nums.length).map(i -> IntStream.range(0, 31).map(b -> (nums[i] & (1 << b)) == 0 ? (((int[])st[2])[i] = java.lang.Math.max(((int[])st[2])[i], ((int[])st[0])[b] + 1)) * 0 : (((int[])st[0])[b] = i) * 0).sum() * 0).sum() * 0 == 0 ? st : st).map(st -> IntStream.range(0, nums.length).map(invI -> IntStream.range(0, 31).map(b -> (nums[nums.length - 1 - invI] & (1 << b)) == 0 ? (((int[])st[3])[nums.length - 1 - invI] = java.lang.Math.min(((int[])st[3])[nums.length - 1 - invI], ((int[])st[1])[b] - 1)) * 0 : (((int[])st[1])[b] = nums.length - 1 - invI) * 0).sum() * 0).sum() * 0 == 0 ? st : st).map(st -> IntStream.range(0, nums.length).mapToLong(i -> (long)(i - java.lang.Math.max(((int[])st[2])[i], ((Map<Integer, Integer>)st[4]).getOrDefault(nums[i], -1) + 1) + 1) * (((int[])st[3])[i] - i + 1) + (((Map<Integer, Integer>)st[4]).put(nums[i], i) == null ? 0 : 0)).sum()).get();
    }
}
