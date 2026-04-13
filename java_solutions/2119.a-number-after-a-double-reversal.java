/*
 * @lc app=leetcode id=2119 lang=java
 *
 * [2119] A Number After a Double Reversal
 */

class Solution {
    public boolean isSameAfterReversals(int num) {
        return Integer.valueOf(new StringBuilder(String.valueOf(Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString()))).reverse().toString()) == num;

    }
}
