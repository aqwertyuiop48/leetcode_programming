/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        return nums.length == 0 ? 0 : Optional.of(Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new)).stream().toList()).filter(list -> list.size() > 0).map(list -> list.size() == 1 ? 1 : IntStream.range(0, list.size() - 1).map(i -> list.get(i + 1) - list.get(i)).boxed().reduce(new int[]{0, 0}, (acc, diff) -> diff == 1 ? new int[]{acc[0] + 1, Math.max(acc[1], acc[0] + 1)} : new int[]{0, Math.max(acc[1], acc[0])}, (a, b) -> b)[1] + 1).orElse(0);
    }
}
