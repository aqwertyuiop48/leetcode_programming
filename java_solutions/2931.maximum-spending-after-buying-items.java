/*
 * @lc app=leetcode id=2931 lang=java
 *
 * [2931] Maximum Spending After Buying Items
 */

class Solution { public long maxSpending(int[][] values) { return ((Function<long[], Long>) arr -> IntStream.range(0, arr.length).mapToLong(i -> arr[i] * (i + 1L)).sum()).apply(Arrays.stream(values).flatMapToInt(Arrays::stream).mapToLong(i -> i).sorted().toArray()); } }
