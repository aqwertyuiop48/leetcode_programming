/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */

class Solution {
    public int findLHS(int[] nums) {
        return java.util.stream.Stream.of(new java.util.HashMap<Integer, Integer>()).peek(m -> java.util.Arrays.stream(nums).forEach(n -> m.put(n, m.getOrDefault(n, 0) + 1))).map(m -> m.keySet().stream().filter(k -> m.containsKey(k + 1)).mapToInt(k -> m.get(k) + m.get(k + 1)).max().orElse(0)).findFirst().get();
    }
}
