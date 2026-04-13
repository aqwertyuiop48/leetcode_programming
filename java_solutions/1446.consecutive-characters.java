/*
 * @lc app=leetcode id=1446 lang=java
 *
 * [1446] Consecutive Characters
 */

class Solution {
    public int maxPower(String s) {
        return Arrays.stream(s.split("(?<=(.))(?!\\1)"))
            .mapToInt(String::length)
            .max()
            .orElse(1);
    }
}
