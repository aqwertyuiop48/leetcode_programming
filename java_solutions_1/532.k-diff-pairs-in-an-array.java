/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */

class Solution {
    public int findPairs(int[] nums, int k) {
        return java.util.stream.Stream.of(0).map(_v -> new java.util.HashMap<Integer, Integer>()).peek(map -> java.util.Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1))).map(map -> (int) map.entrySet().stream().filter(e -> k == 0 ? e.getValue() > 1 : map.containsKey(e.getKey() + k)).count()).findFirst().get();
    }
}
