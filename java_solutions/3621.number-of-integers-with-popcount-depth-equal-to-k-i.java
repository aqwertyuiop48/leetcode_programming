/*
 * @lc app=leetcode id=3621 lang=java
 *
 * [3621] Number of Integers With Popcount-Depth Equal to K I
 */

class Solution { public long popcountDepth(long n, int k) { return ((Function<Object[], Long>) s -> ((s[0] = new long[65][65]) != null) && IntStream.range(0, 65).allMatch(i -> IntStream.range(0, i + 1).allMatch(j -> (((long[][])s[0])[i][j] = (j == 0 || j == i) ? 1 : ((long[][])s[0])[i-1][j-1] + ((long[][])s[0])[i-1][j]) > 0 ) ) && ((s[1] = (IntFunction<Integer>) x -> x == 1 ? 0 : 1 + ((IntFunction<Integer>)s[1]).apply(Integer.bitCount(x))) != null) && ((s[2] = (Function<int[], Long>) p -> (p[1] > p[2]) ? 0L : (p[0] < 0) ? (p[1] == p[2] ? 1L : 0L) : (((n >> p[0]) & 1) == 0) ? ((Function<int[], Long>)s[2]).apply(new int[]{p[0] - 1, p[1], p[2]}) : (((p[2] - p[1] <= p[0]) ? ((long[][])s[0])[p[0]][p[2] - p[1]] : 0L) + ((Function<int[], Long>)s[2]).apply(new int[]{p[0] - 1, p[1] + 1, p[2]})) ) != null) ? (k == 0 ? (n >= 1 ? 1L : 0L) : IntStream.range(1, 64) .filter(t -> ((IntFunction<Integer>)s[1]).apply(t) == k - 1) .mapToLong(t -> ((Function<int[], Long>)s[2]).apply(new int[]{62, 0, t}) - (t == 1 ? 1 : 0)) .sum() ) : 0L ).apply(new Object[10]); } }
