/*
 * @lc app=leetcode id=820 lang=java
 *
 * [820] Short Encoding of Words
 */

class Solution {
    public int minimumLengthEncoding(String[] words) {
        return new java.util.HashSet<>(java.util.Arrays.asList(words)) instanceof java.util.HashSet<String> st
            && java.util.Arrays.stream(words).peek(w -> java.util.stream.IntStream.range(1, w.length()).forEach(k -> st.remove(w.substring(k)))).allMatch(x -> true)
            ? st.stream().mapToInt(w -> w.length() + 1).sum() : 0;
    }
}
