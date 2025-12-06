/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
// semicolons : 1
class Solution {
    public boolean isPalindrome(int x) {
        return x >= 0 && IntStream.range(0, String.valueOf(x).length() / 2).allMatch(i -> String.valueOf(x).charAt(i) == String.valueOf(x).charAt(String.valueOf(x).length() - i - 1));
    }
}
// @lc code=end

