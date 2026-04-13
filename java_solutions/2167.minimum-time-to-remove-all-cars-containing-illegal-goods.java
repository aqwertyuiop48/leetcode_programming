/*
 * @lc app=leetcode id=2167 lang=java
 *
 * [2167] Minimum Time to Remove All Cars Containing Illegal Goods
 */

class Solution { public int minimumTime(String s) { return ((Function<int[], Integer>) state -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> (state[0] = Math.min(state[0] + (s.charAt(i) - '0') * 2, i + 1)) * 0 + (state[1] = Math.min(state[1], state[0] + s.length() - 1 - i)) * 0) * 0 == 0 ? state[1] : 0).apply(new int[]{0, s.length()}); } }
