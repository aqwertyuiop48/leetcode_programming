/*
 * @lc app=leetcode id=946 lang=java
 *
 * [946] Validate Stack Sequences
 */

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        return new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> st && new int[1] instanceof int[] j
            && java.util.Arrays.stream(pushed).peek(x -> {
                if (st.offerFirst(x)) {}
                while (j[0] < popped.length && st.peekFirst() != null && st.peekFirst() == popped[j[0]] && st.pollFirst() != null && ++j[0] > 0) {}
            }).allMatch(x -> true) && j[0] == popped.length;
    }
}
