/*
 * @lc app=leetcode id=1753 lang=java
 *
 * [1753] Maximum Score From Removing Stones
 */

class Solution {
    public int maximumScore(int a, int b, int c) {
        return java.util.Optional.of(java.util.stream.IntStream.of(a, b, c).sorted().toArray()).map(arr -> arr[0] + arr[1] <= arr[2] ? arr[0] + arr[1] : (arr[0] + arr[1] + arr[2]) / 2).get();
    }
}
