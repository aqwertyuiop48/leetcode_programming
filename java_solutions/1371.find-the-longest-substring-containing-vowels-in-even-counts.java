/*
 * @lc app=leetcode id=1371 lang=java
 *
 * [1371] Find the Longest Substring Containing Vowels in Even Counts
 */

class Solution {
    public int findTheLongestSubstring(String s) {
        return (int) java.util.stream.IntStream.range(0, s.length()).boxed().reduce(new Object[]{0, 0, java.util.stream.IntStream.range(0, 32).map(x -> x == 0 ? -1 : -2).toArray()}, (state, i) -> new Object[]{(int)state[0] ^ (s.charAt(i) == 'a' ? 1 : s.charAt(i) == 'e' ? 2 : s.charAt(i) == 'i' ? 4 : s.charAt(i) == 'o' ? 8 : s.charAt(i) == 'u' ? 16 : 0), Math.max((int)state[1], ((int[])state[2])[(int)state[0] ^ (s.charAt(i) == 'a' ? 1 : s.charAt(i) == 'e' ? 2 : s.charAt(i) == 'i' ? 4 : s.charAt(i) == 'o' ? 8 : s.charAt(i) == 'u' ? 16 : 0)] == -2 ? ((((int[])state[2])[(int)state[0] ^ (s.charAt(i) == 'a' ? 1 : s.charAt(i) == 'e' ? 2 : s.charAt(i) == 'i' ? 4 : s.charAt(i) == 'o' ? 8 : s.charAt(i) == 'u' ? 16 : 0)] = i) & 0) : i - ((int[])state[2])[(int)state[0] ^ (s.charAt(i) == 'a' ? 1 : s.charAt(i) == 'e' ? 2 : s.charAt(i) == 'i' ? 4 : s.charAt(i) == 'o' ? 8 : s.charAt(i) == 'u' ? 16 : 0)]), state[2]}, (a, b) -> a)[1];
    }
}
