/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// semicolons : 1
class Solution {
    public List<Integer> getRow(int n) {
        return Stream.iterate(List.of(1), prev -> IntStream.range(0, prev.size() + 1).mapToObj(i -> (i == 0 || i == prev.size()) ? 1 : prev.get(i - 1) + prev.get(i)).toList()).skip(n).findFirst().orElse(List.of(1));
    }
}
