/*
 * @lc app=leetcode id=720 lang=java
 *
 * [720] Longest Word in Dictionary
 */

class Solution {
    public String longestWord(String[] words) {
        return new java.util.HashSet<String>() instanceof java.util.HashSet<String> ok
            ? java.util.Arrays.stream(words).sorted().filter(w -> w.length() == 1 || ok.contains(w.substring(0, w.length() - 1))).peek(ok::add)
                .reduce("", (a, w) -> w.length() > a.length() ? w : a)
            : "";
    }
}
