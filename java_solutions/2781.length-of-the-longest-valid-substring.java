/*
 * @lc app=leetcode id=2781 lang=java
 *
 * [2781] Length of the Longest Valid Substring
 */

class Solution { public int longestValidSubstring(String word, List<String> forbidden) { return ((Function<Set<String>, Function<int[], Integer>>) set -> state -> IntStream.rangeClosed(1, word.length()).map(inv -> word.length() - inv).map(i -> (state[0] = IntStream.rangeClosed(i + 1, Math.min(i + 10, state[0])).filter(j -> set.contains(word.substring(i, j))).findFirst().orElse(state[0] + 1) - 1) * 0 + (state[1] = Math.max(state[1], state[0] - i)) * 0).sum() * 0 == 0 ? state[1] : 0).apply(new HashSet<>(forbidden)).apply(new int[]{word.length(), 0}); } }
