/*
 * @lc app=leetcode id=722 lang=java
 *
 * [722] Remove Comments
 */

class Solution {
    public List<String> removeComments(String[] source) {
        return java.util.Arrays.stream(String.join("\n", source).replaceAll("(?s)/\\*.*?\\*/|//[^\\n]*", "").split("\n")).filter(l -> !l.isEmpty()).toList();
    }
}
