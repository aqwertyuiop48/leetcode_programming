/*
 * @lc app=leetcode id=678 lang=java
 *
 * [678] Valid Parenthesis String
 */

class Solution {
    public boolean checkValidString(String s) {
        return s.chars().boxed().reduce(new int[]{0, 0}, (a, c) -> a[1] < 0 ? a : new int[]{Math.max(0, a[0] + (c == '(' ? 1 : -1)), a[1] + (c == ')' ? -1 : 1)}, (a, b) -> a) instanceof int[] r && r[1] >= 0 && r[0] == 0;
    }
}
