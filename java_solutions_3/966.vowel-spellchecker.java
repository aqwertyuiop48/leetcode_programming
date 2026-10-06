/*
 * @lc app=leetcode id=966 lang=java
 *
 * [966] Vowel Spellchecker
 */

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        return new java.util.HashSet<>(java.util.Arrays.asList(wordlist)) instanceof java.util.HashSet<String> ex
            && new java.util.HashMap<String, String>() instanceof java.util.HashMap<String, String> cap && new java.util.HashMap<String, String>() instanceof java.util.HashMap<String, String> vow
            && java.util.Arrays.stream(wordlist).allMatch(w -> (cap.putIfAbsent(w.toLowerCase(), w) == null || true) && (vow.putIfAbsent(w.toLowerCase().replaceAll("[aeiou]", "*"), w) == null || true))
            ? java.util.Arrays.stream(queries).map(q -> ex.contains(q) ? q : cap.getOrDefault(q.toLowerCase(), vow.getOrDefault(q.toLowerCase().replaceAll("[aeiou]", "*"), ""))).toArray(String[]::new)
            : null;
    }
}
