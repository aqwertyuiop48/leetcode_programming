/*
 * @lc app=leetcode id=2376 lang=java
 *
 * [2376] Count Special Integers
 */

class Solution { public int countSpecialNumbers(int n) { return ((Function<int[], Function<BiFunction<Integer, Integer, Integer>, Function<int[], Integer>>>) L -> A -> state -> IntStream.range(1, L.length).map(i -> 9 * A.apply(9, i - 1)).sum() + IntStream.range(0, L.length).takeWhile(i -> state[10] == 0).map(i -> IntStream.range(i > 0 ? 0 : 1, L[i]).filter(j -> state[j] == 0).map(j -> A.apply(9 - i, L.length - i - 1)).sum() + (state[L[i]]++ > 0 ? (state[10] = 1) * 0 : 0)).sum()).apply(String.valueOf(n + 1).chars().map(c -> c - '0').toArray()).apply((m, i) -> IntStream.range(0, i).reduce(1, (res, x) -> res * (m - x))).apply(new int[11]); } }
