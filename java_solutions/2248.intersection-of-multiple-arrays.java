/*
 * @lc app=leetcode id=2248 lang=java
 *
 * [2248] Intersection of Multiple Arrays
 */

class Solution {
    public List<Integer> intersection(int[][] nums) {
        return Arrays.stream(nums)
            .flatMap(row -> Arrays.stream(row).distinct().boxed())
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == nums.length)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());
    }
}
