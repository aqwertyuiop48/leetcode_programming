/*
 * @lc app=leetcode id=1774 lang=java
 *
 * [1774] Closest Dessert Cost
 */

class Solution { public int closestCost(int[] baseCosts, int[] toppingCosts, int target) { return Arrays.stream(baseCosts) .boxed() .flatMap(base -> Arrays.stream(toppingCosts) .boxed() .reduce(Stream.of(base), (reachableCosts, topping) -> reachableCosts .flatMap(v -> Stream.of(v, v + topping, v + 2 * topping)) .distinct(), Stream::concat)) .min(Comparator.<Integer>comparingInt(cost -> Math.abs(cost - target)) .thenComparingInt(cost -> cost)) .orElse(0); } }
