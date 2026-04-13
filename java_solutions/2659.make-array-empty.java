/*
 * @lc app=leetcode id=2659 lang=java
 *
 * [2659] Make Array Empty
 */

class Solution { public long countOperationsToEmptyArray(int[] A) { return ((Function<int[][], Long>) sorted -> A.length + IntStream.range(1, A.length).mapToLong(i -> sorted[i][1] < sorted[i - 1][1] ? A.length - i : 0L).sum()).apply(IntStream.range(0, A.length).mapToObj(i -> new int[]{A[i], i}).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)); } }
