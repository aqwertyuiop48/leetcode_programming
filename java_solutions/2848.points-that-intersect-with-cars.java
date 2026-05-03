/*
 * @lc app=leetcode id=2848 lang=java
 *
 * [2848] Points That Intersect With Cars
 */

class Solution { public int numberOfPoints(java.util.List<java.util.List<Integer>> nums) { return (int)nums.stream().flatMap(l -> java.util.stream.IntStream.rangeClosed(l.get(0), l.get(1)).boxed()).distinct().count(); } }
