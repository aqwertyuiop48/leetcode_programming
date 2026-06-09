/*
 * @lc app=leetcode id=523 lang=java
 *
 * [523] Continuous Subarray Sum
 */

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Integer>(), new int[]{0}}).peek(a -> ((java.util.Map<Integer, Integer>) a[0]).put(0, -1)).map(a -> java.util.stream.IntStream.range(0, nums.length).anyMatch(i -> java.util.stream.Stream.of(0).peek(_x -> ((int[]) a[1])[0] = (((int[]) a[1])[0] + nums[i]) % k).map(_x -> ((java.util.Map<Integer, Integer>) a[0]).putIfAbsent(((int[]) a[1])[0], i) == null ? false : i - ((java.util.Map<Integer, Integer>) a[0]).get(((int[]) a[1])[0]) >= 2).findFirst().get())).findFirst().get();
    }
}
