/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return triangle.reversed().stream().reduce((below, above) -> IntStream.range(0, above.size()).mapToObj(i -> above.get(i) + Math.min(below.get(i), below.get(i + 1))).toList()).map(l -> l.get(0)).orElse(0);
    }
}
