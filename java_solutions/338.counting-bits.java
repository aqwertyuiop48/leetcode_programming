/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

class Solution {
    public int[] countBits(int n) {
        return IntStream.rangeClosed(0, n)
                .map(i -> (int) Integer.toBinaryString(i).chars().filter(c -> c == '1').count())
                .toArray();
    }
}
