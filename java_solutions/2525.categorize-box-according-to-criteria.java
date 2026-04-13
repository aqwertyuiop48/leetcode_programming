/*
 * @lc app=leetcode id=2525 lang=java
 *
 * [2525] Categorize Box According to Criteria
 */

class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        return (length >= 1e4 || width >= 1e4 || height >= 1e4 || 1L * length * width * height >= 1e9)
            ? (mass >= 100 ? "Both" : "Bulky")
            : (mass >= 100 ? "Heavy" : "Neither");
    }
}
