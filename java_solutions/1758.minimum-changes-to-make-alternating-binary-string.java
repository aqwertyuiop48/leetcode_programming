/*
 * @lc app=leetcode id=1758 lang=java
 *
 * [1758] Minimum Changes To Make Alternating Binary String
 */

class Solution {
    public int minOperations(String s) {
        return (int) Math.min(
            IntStream.range(0, s.length()).filter(i -> s.charAt(i) != (i % 2 == 0 ? '0' : '1')).count(), 
            s.length() - IntStream.range(0, s.length()).filter(i -> s.charAt(i) != (i % 2 == 0 ? '0' : '1')).count()
        );
    }
}
