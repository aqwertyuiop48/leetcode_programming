/*
 * @lc app=leetcode id=2287 lang=java
 *
 * [2287] Rearrange Characters to Make Target String
 */

class Solution {
    public int rearrangeCharacters(String s, String target) {
        return target.chars().distinct()
            .map(c -> (int) (s.chars().filter(i -> i == c).count() / target.chars().filter(i -> i == c).count()))
            .min()
            .orElse(0);
    }
}
