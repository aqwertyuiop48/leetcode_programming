/*
 * @lc app=leetcode id=986 lang=java
 *
 * [986] Interval List Intersections
 */

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        return java.util.Arrays.stream(firstList).flatMap(a -> java.util.Arrays.stream(secondList).filter(b -> Math.max(a[0], b[0]) <= Math.min(a[1], b[1]))
            .map(b -> new int[]{Math.max(a[0], b[0]), Math.min(a[1], b[1])})).toArray(int[][]::new);
    }
}
