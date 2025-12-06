/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
// semicolons : 1
class Solution {
    public boolean isMatch(String s, String p) {
        return java.util.regex.Pattern.compile(p).matcher(s).matches();
    }
}

// @lc code=end

