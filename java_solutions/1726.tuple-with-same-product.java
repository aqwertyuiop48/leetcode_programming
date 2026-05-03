/*
 * @lc app=leetcode id=1726 lang=java
 *
 * [1726] Tuple with Same Product
 */

class Solution {
    public int tupleSameProduct(int[] nums) {
        return java.util.Optional.of(new java.util.HashMap<Integer, Integer>()).map(m -> java.util.stream.IntStream.range(0, nums.length).flatMap(i -> java.util.stream.IntStream.range(i + 1, nums.length).map(j -> nums[i] * nums[j])).map(p -> m.put(p, m.getOrDefault(p, 0) + 1) != null ? 0 : 0).sum() * 0 + m.values().stream().mapToInt(v -> v * (v - 1) / 2 * 8).sum()).get();
    }
}
