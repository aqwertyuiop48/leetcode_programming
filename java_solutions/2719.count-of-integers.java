/*
 * @lc app=leetcode id=2719 lang=java
 *
 * [2719] Count of Integers
 */

class Solution { public int count(String num1, String num2, int min_sum, int max_sum) { return ((Function<BiFunction<String, Integer, Integer>, Integer>) calc -> (int) ((((long)calc.apply(num2, max_sum) - calc.apply(num2, min_sum - 1) - calc.apply(num1, max_sum) + calc.apply(num1, min_sum - 1) + (num1.chars().map(c -> c - '0').sum() >= min_sum && num1.chars().map(c -> c - '0').sum() <= max_sum ? 1 : 0)) % 1000000007 + 1000000007) % 1000000007)).apply((s, max_s) -> ((Function<int[][][], Integer>) dp -> ((Function<Object[], Integer>) innerBox -> ((Function<int[], Integer>) (innerBox[0] = (Function<int[], Integer>) state -> state[0] == s.length() ? (state[2] <= max_s ? 1 : 0) : dp[state[0]][state[1]][state[2]] != -1 ? dp[state[0]][state[1]][state[2]] : (dp[state[0]][state[1]][state[2]] = IntStream.rangeClosed(0, state[1] == 1 ? s.charAt(state[0]) - '0' : 9).map(i -> ((Function<int[], Integer>)innerBox[0]).apply(new int[]{state[0] + 1, state[1] == 1 && i == s.charAt(state[0]) - '0' ? 1 : 0, state[2] + i})).reduce(0, (a, b) -> (a + b) % 1000000007)))).apply(new int[]{0, 1, 0})).apply(new Object[1])).apply(IntStream.range(0, s.length()).mapToObj(i -> IntStream.range(0, 2).mapToObj(j -> IntStream.range(0, 401).map(k -> -1).toArray()).toArray(int[][]::new)).toArray(int[][][]::new))); } }
