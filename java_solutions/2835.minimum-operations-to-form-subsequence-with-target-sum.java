/*
 * @lc app=leetcode id=2835 lang=java
 *
 * [2835] Minimum Operations to Form Subsequence With Target Sum
 */

class Solution { public int minOperations(List<Integer> A, int target) { return ((Function<long[], Function<List<Integer>, Integer>>) state -> sortedA -> state[0] < target ? -1 : (int)(IntStream.iterate(0, dummy -> state[1] > 0, dummy -> ((Function<Integer, Integer>) a -> (state[0] - a >= state[1]) ? (int)((state[0] -= a) * 0) : (a <= state[1]) ? (int)((state[0] -= a) * 0 + (state[1] -= a) * 0) : (sortedA.add(a / 2) && sortedA.add(a / 2) ? 0 : 0) + (int)((state[2]++) * 0)).apply(sortedA.remove(sortedA.size() - 1))).count() * 0 + state[2])).apply(new long[]{A.stream().mapToLong(i -> i).sum(), target, 0}).apply(A.stream().sorted().collect(Collectors.toList())); } }
