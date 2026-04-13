/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

class Solution {
    public String removeDuplicates(String s) {
        return s.chars().mapToObj(c -> (char)c).reduce(new StringBuilder(), (sb, c) -> (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) ? sb.deleteCharAt(sb.length() - 1) : sb.append(c), (sb1, sb2) -> sb1).toString();
    }
}
