/*
 * @lc app=leetcode id=1652 lang=java
 *
 * [1652] Defuse the Bomb
 */

class Solution {
    public int[] decrypt(int[] code, int k) {
        return IntStream.range(0, code.length)
                .map(i -> IntStream.rangeClosed(1, Math.abs(k))
                        .map(j -> code[(i + (k > 0 ? j : code.length - j)) % code.length])
                        .sum())
                .toArray();
    }
}
