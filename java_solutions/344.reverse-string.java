/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

class Solution {
    public void reverseString(char[] s) {
        IntStream.range(0, s.length / 2).forEach(i -> s[i] = (char) (s[i] ^ s[s.length - 1 - i] ^ (s[s.length - 1 - i] = s[i])));
    }
}
