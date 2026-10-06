/*
 * @lc app=leetcode id=791 lang=java
 *
 * [791] Custom Sort String
 */

class Solution {
    public String customSortString(String order, String s) {
        return s.chars().boxed().sorted(java.util.Comparator.comparingInt(c -> order.indexOf(c)))
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
