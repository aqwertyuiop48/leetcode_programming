/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        return Optional.of(IntStream.range(0, bits.length - 1) .map(i -> bits[bits.length - 2 - i]) .takeWhile(v -> v == 1) .count() % 2 == 0).get();
    }
}
