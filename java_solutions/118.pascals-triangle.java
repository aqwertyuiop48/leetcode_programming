/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

class Solution {
    public List<List<Integer>> generate(int n) {
        return Stream.iterate( List.of(1), prev -> IntStream.range(0, prev.size() + 1) .mapToObj(i -> (i == 0 || i == prev.size()) ? 1 : prev.get(i - 1) + prev.get(i)) .toList() ) .limit(n) .toList();
    }
}
