/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Integer>(), new int[]{0}, new int[]{0}}).peek(a -> ((java.util.Map<Integer, Integer>) a[0]).put(0, 1)).peek(a -> java.util.Arrays.stream(nums).forEach(num -> java.util.stream.Stream.of(0).peek(_x -> ((int[]) a[1])[0] += num).peek(_x -> ((int[]) a[2])[0] += ((java.util.Map<Integer, Integer>) a[0]).getOrDefault(((int[]) a[1])[0] - k, 0)).forEach(_x -> ((java.util.Map<Integer, Integer>) a[0]).put(((int[]) a[1])[0], ((java.util.Map<Integer, Integer>) a[0]).getOrDefault(((int[]) a[1])[0], 0) + 1)))).map(a -> ((int[]) a[2])[0]).findFirst().get();
    }
}
