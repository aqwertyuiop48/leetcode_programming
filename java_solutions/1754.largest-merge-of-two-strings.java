/*
 * @lc app=leetcode id=1754 lang=java
 *
 * [1754] Largest Merge Of Two Strings
 */

class Solution {
    public String largestMerge(String word1, String word2) {
        return java.util.Optional.of(new Object[]{new StringBuilder(), new int[]{0, 0}})
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(word1.length() + word2.length(), 0)).removeIf(dummy -> (((StringBuilder) s[0]).append(((int[]) s[1])[0] < word1.length() && (((int[]) s[1])[1] == word2.length() || word1.substring(((int[]) s[1])[0]).compareTo(word2.substring(((int[]) s[1])[1])) > 0) ? word1.charAt(((int[]) s[1])[0]++) : word2.charAt(((int[]) s[1])[1]++)) != null) && false) || true)
            .map(s -> ((StringBuilder) s[0]).toString())
            .get();
    }
}
