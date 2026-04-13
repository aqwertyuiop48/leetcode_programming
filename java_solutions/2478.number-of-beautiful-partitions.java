/*
 * @lc app=leetcode id=2478 lang=java
 *
 * [2478] Number of Beautiful Partitions
 */

class Solution { public int beautifulPartitions(String s, int k, int minL) { return (minL * k > s.length() || "2357".indexOf(s.charAt(0)) < 0 || "2357".indexOf(s.charAt(s.length() - 1)) >= 0) ? 0 : (k == 1 ? 1 : ((Function<int[], Integer>) begins -> begins.length < k - 1 ? 0 : ((Function<int[][], Integer>) dp -> ((Function<Object[], Integer>) box -> ((Function<int[], Integer>) (box[0] = (Function<int[], Integer>) state -> state[0] == 0 ? 1 : (dp[state[0]][state[1]] > -1 ? dp[state[0]][state[1]] : (dp[state[0]][state[1]] = IntStream.rangeClosed(state[1], begins.length - state[0]).filter(i -> begins[i] - state[2] >= minL).map(i -> ((Function<int[], Integer>)box[0]).apply(new int[]{state[0] - 1, i + 1, begins[i]})).reduce(0, (a, b) -> (a + b) % 1000000007))))).apply(new int[]{k - 1, 0, 0})).apply(new Object[1])).apply(IntStream.range(0, k).mapToObj(i -> IntStream.range(0, begins.length).map(j -> -1).toArray()).toArray(int[][]::new))).apply(IntStream.rangeClosed(minL, s.length() - minL).filter(i -> "2357".indexOf(s.charAt(i)) >= 0 && "2357".indexOf(s.charAt(i - 1)) < 0).toArray())); } }
