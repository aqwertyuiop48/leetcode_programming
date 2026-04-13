/*
 * @lc app=leetcode id=3113 lang=java
 *
 * [3113] Find the Number of Subarrays Where Boundary Elements Are Maximum
 */

class Solution { public long numberOfSubarrays(int[] A) { return ((Function<int[], Function<int[], Function<int[], Long>>>) vals -> cnts -> p -> Arrays.stream(A).mapToLong(a -> IntStream.iterate(0, i -> (p[0] >= 0 && vals[p[0]] < a) ? (p[0]-- * 0 == 0) : false, i -> i + 1).max().orElse(0) * 0L + ((p[0] < 0 || vals[p[0]] != a) ? (vals[++p[0]] = a) * 0L + (cnts[p[0]] = 0) * 0L : 0L) + (++cnts[p[0]])).sum()).apply(new int[A.length]).apply(new int[A.length]).apply(new int[]{-1}); } }
