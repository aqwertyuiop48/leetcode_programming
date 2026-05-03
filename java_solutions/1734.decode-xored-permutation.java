/*
 * @lc app=leetcode id=1734 lang=java
 *
 * [1734] Decode XORed Permutation
 */

class Solution {
    public int[] decode(int[] encoded) {
        return java.util.Optional.of(new int[encoded.length + 1]).filter(p -> (p[0] = java.util.stream.IntStream.rangeClosed(1, encoded.length + 1).reduce(0, (a, b) -> a ^ b) ^ java.util.stream.IntStream.range(0, encoded.length).filter(i -> i % 2 != 0).map(i -> encoded[i]).reduce(0, (a, b) -> a ^ b)) >= 0 && java.util.stream.IntStream.range(0, encoded.length).allMatch(i -> (p[i + 1] = p[i] ^ encoded[i]) >= 0 || true)).get();
    }
}
