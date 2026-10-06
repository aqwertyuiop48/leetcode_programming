/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */

class Solution {
    public int rotatedDigits(int n) {
        return (int) java.util.stream.IntStream.rangeClosed(1, n).filter(x -> String.valueOf(x).matches("[0125689]*") && String.valueOf(x).matches(".*[2569].*")).count();
    }
}
