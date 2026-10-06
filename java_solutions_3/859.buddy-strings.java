/*
 * @lc app=leetcode id=859 lang=java
 *
 * [859] Buddy Strings
 */

class Solution {
    public boolean buddyStrings(String s, String goal) {
        return s.length() == goal.length() && (s.equals(goal) ? s.chars().distinct().count() < s.length()
            : java.util.stream.IntStream.range(0, s.length()).filter(i -> s.charAt(i) != goal.charAt(i)).boxed().toList() instanceof java.util.List<Integer> d
                && d.size() == 2 && s.charAt(d.get(0)) == goal.charAt(d.get(1)) && s.charAt(d.get(1)) == goal.charAt(d.get(0)));
    }
}
