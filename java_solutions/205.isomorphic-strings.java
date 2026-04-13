/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        return IntStream.range(0, s.length())
            .mapToObj(i -> s.indexOf(s.charAt(i)) == t.indexOf(t.charAt(i)))
            .reduce(true, (a, b) -> a && b);
    }
}
