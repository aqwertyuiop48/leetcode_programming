/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.length() < needle.length() ? -1 :
               IntStream.rangeClosed(0, haystack.length() - needle.length())
                        .filter(i -> haystack.substring(i, i + needle.length()).equals(needle))
                        .findFirst()
                        .orElse(-1);
    }
}
// @lc code=end

