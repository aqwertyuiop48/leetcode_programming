/*
 * @lc app=leetcode id=3992 lang=java
 *
 * [3992] Rearrange String to Avoid Character Pair
 */

class Solution {
    public String rearrangeString(String s, char x, char y) {
        return s.chars()
                .boxed()
                .sorted(y < x ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
