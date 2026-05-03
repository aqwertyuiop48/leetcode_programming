/*
 * @lc app=leetcode id=1414 lang=java
 *
 * [1414] Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
 */

class Solution {
    public int findMinFibonacciNumbers(int k) {
        return java.util.Optional.of(new java.util.ArrayList<Integer>(java.util.Arrays.asList(1, 1)))
            .filter(l -> java.util.stream.Stream.generate(() -> l.get(l.size() - 1) + l.get(l.size() - 2))
                .takeWhile(next -> next <= k)
                .allMatch(l::add))
            .map(l -> java.util.stream.IntStream.iterate(l.size() - 1, i -> i >= 0, i -> i - 1)
                .mapToObj(l::get)
                .reduce(new int[]{k, 0}, (state, fib) -> fib <= state[0] ? new int[]{state[0] - fib, state[1] + 1} : state, (a, b) -> a)[1])
            .orElse(0);
    }
}
