/*
 * @lc app=leetcode id=1850 lang=java
 *
 * [1850] Minimum Adjacent Swaps to Reach the Kth Smallest Number
 */

class Solution {
    public int getMinSwaps(String num, int k) {
        return java.util.Optional.of(java.util.stream.Stream.iterate(num, s -> java.util.stream.IntStream.iterate(s.length() - 2, i -> i >= 0 && s.charAt(i) >= s.charAt(i + 1), i -> i - 1).filter(i -> i < 0 || s.charAt(i) < s.charAt(i + 1)).findFirst().map(i -> java.util.stream.IntStream.iterate(s.length() - 1, j -> j > i && s.charAt(j) <= s.charAt(i), j -> j - 1).filter(j -> s.charAt(j) > s.charAt(i)).findFirst().map(j -> s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1)).map(s2 -> s2.substring(0, i + 1) + new StringBuilder(s2.substring(i + 1)).reverse().toString()).get()).orElse(s)).limit(k + 1).reduce((a, b) -> b).get()).map(target -> java.util.stream.Stream.iterate(new Object[]{num, target, 0, 0}, state -> (int)state[2] < num.length(), state -> ((String)state[0]).charAt((int)state[2]) == ((String)state[1]).charAt((int)state[2]) ? new Object[]{state[0], state[1], (int)state[2] + 1, state[3]} : java.util.stream.IntStream.range((int)state[2] + 1, num.length()).filter(j -> ((String)state[1]).charAt(j) == ((String)state[0]).charAt((int)state[2])).findFirst().map(j -> new Object[]{state[0], ((String)state[1]).substring(0, (int)state[2]) + ((String)state[1]).charAt(j) + ((String)state[1]).substring((int)state[2], j) + ((String)state[1]).substring(j + 1), (int)state[2] + 1, (int)state[3] + j - (int)state[2]}).get()).reduce((a, b) -> b).map(state -> (int)state[3]).get()).get();
    }
}
