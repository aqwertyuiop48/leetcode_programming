/*
 * @lc app=leetcode id=2014 lang=java
 *
 * [2014] Longest Subsequence Repeated k Times
 */

class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        return ((Function<Deque<String>, Function<String[], Function<Predicate<String>, String>>>) q -> ans -> isSub -> 
            (q.offer("") ? 1 : 1) * 0 == 0 && IntStream.iterate(0, i -> !q.isEmpty(), i -> i + 1).reduce(0, (acc, i) -> ((Function<String, Integer>) curr -> IntStream.rangeClosed('a', 'z').reduce(0, (acc2, ch) -> ((Function<String, Integer>) next -> isSub.test(next) ? (ans[0] = next).hashCode() * 0 + (q.offer(next) ? 1 : 1) * 0 : 0).apply(curr + (char)ch)) * 0).apply(q.poll()) * 0) * 0 == 0 ? ans[0] : ""
        ).apply(new ArrayDeque<>()).apply(new String[]{""}).apply(sub -> ((Predicate<int[]>) state -> s.chars().reduce(0, (acc, ch) -> (state[0] < sub.length() && ch == sub.charAt(state[0]) ? (state[0]++) * 0 + (state[0] == sub.length() ? (state[0] = 0) * 0 + (state[1]++) * 0 : 0) : 0) * 0) == 0 && state[1] >= k).test(new int[2]));
    }
}
