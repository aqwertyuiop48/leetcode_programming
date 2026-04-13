/*
 * @lc app=leetcode id=2543 lang=java
 *
 * [2543] Check if Point Is Reachable
 */

class Solution { public boolean isReachable(int x, int y) { return ((Function<Object[], Boolean>) box -> ((Function<Integer, Boolean>) gcd -> (gcd & (gcd - 1)) == 0).apply(((BiFunction<Integer, Integer, Integer>) (box[0] = (BiFunction<Integer, Integer, Integer>) (a, b) -> b == 0 ? a : ((BiFunction<Integer, Integer, Integer>)box[0]).apply(b, a % b))).apply(x, y))).apply(new Object[1]); } }
