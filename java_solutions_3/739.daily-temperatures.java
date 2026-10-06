/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return new int[temperatures.length] instanceof int[] res && new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> st
            && java.util.stream.IntStream.range(0, temperatures.length).peek(i -> {
                while (!st.isEmpty() && temperatures[st.peekFirst()] < temperatures[i] && (res[st.peekFirst()] = i - st.pollFirst()) >= 0) {}
                if (st.offerFirst(i)) {}
            }).allMatch(x -> true)
            ? res : null;
    }
}
