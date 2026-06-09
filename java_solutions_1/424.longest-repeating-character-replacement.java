/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

class Solution {
    public int characterReplacement(String s, int k) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[26], new int[3]}).map(a -> java.util.stream.IntStream.range(0, s.length()).map(right -> java.util.stream.Stream.of(0).peek(_v -> ((int[])a[1])[0] = Math.max(((int[])a[1])[0], ++((int[])a[0])[s.charAt(right) - 'A'])).peek(_v -> java.util.stream.Stream.iterate(0, _x -> right - ((int[])a[1])[1] + 1 - ((int[])a[1])[0] > k, _x -> _x).forEach(_x -> ((int[])a[0])[s.charAt(((int[])a[1])[1]++) - 'A']--)).mapToInt(_v -> ((int[])a[1])[2] = Math.max(((int[])a[1])[2], right - ((int[])a[1])[1] + 1)).findFirst().getAsInt()).max().orElse(0)).findFirst().get();
    }
}
