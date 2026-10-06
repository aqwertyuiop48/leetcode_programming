/*
 * @lc app=leetcode id=809 lang=java
 *
 * [809] Expressive Words
 */

class Solution {
    public int expressiveWords(String s, String[] words) {
        return java.util.regex.Pattern.compile("(.)\\1*").matcher(s).results().map(java.util.regex.MatchResult::group).toList() instanceof java.util.List<String> a
            ? (int) java.util.Arrays.stream(words).filter(w -> java.util.regex.Pattern.compile("(.)\\1*").matcher(w).results().map(java.util.regex.MatchResult::group).toList() instanceof java.util.List<String> b
                && a.size() == b.size() && java.util.stream.IntStream.range(0, a.size()).allMatch(i -> a.get(i).charAt(0) == b.get(i).charAt(0)
                    && (a.get(i).length() == b.get(i).length() || a.get(i).length() >= 3 && a.get(i).length() > b.get(i).length()))).count()
            : 0;
    }
}
