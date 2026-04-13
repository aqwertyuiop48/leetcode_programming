/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        return (int) stones.chars()
            .filter(s -> jewels.indexOf(s) != -1)
            .count();
    }
}
