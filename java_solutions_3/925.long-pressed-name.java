/*
 * @lc app=leetcode id=925 lang=java
 *
 * [925] Long Pressed Name
 */

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        return java.util.regex.Pattern.compile("(.)\\1*").matcher(name).results().map(java.util.regex.MatchResult::group).toList() instanceof java.util.List<String> a
            && java.util.regex.Pattern.compile("(.)\\1*").matcher(typed).results().map(java.util.regex.MatchResult::group).toList() instanceof java.util.List<String> b
            && a.size() == b.size() && java.util.stream.IntStream.range(0, a.size()).allMatch(i -> a.get(i).charAt(0) == b.get(i).charAt(0) && b.get(i).length() >= a.get(i).length());
    }
}
