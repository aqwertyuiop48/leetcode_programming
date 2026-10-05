/*
 * @lc app=leetcode id=3941 lang=java
 *
 * [3941] Password Strength
 */

class Solution {
public int passwordStrength(String password) {
    return password.chars().distinct().map(ch -> ch >= 'a' && ch <= 'z' ? 1 : ch >= 'A' && ch <= 'Z' ? 2 : ch >= '0' && ch <= '9' ? 3 : "!@#$".indexOf(ch) != -1 ? 5 : 0).sum();
}
}
