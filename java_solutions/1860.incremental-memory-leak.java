/*
 * @lc app=leetcode id=1860 lang=java
 *
 * [1860] Incremental Memory Leak
 */

class Solution {
    public int[] memLeak(int m1, int m2) {
        return java.util.stream.Stream.iterate(new int[]{m1, m2, 1}, s -> s[0] >= s[1] ? (s[0] >= s[2] ? new int[]{s[0] - s[2], s[1], s[2] + 1} : new int[]{s[0], s[1], -s[2]}) : (s[1] >= s[2] ? new int[]{s[0], s[1] - s[2], s[2] + 1} : new int[]{s[0], s[1], -s[2]})).filter(s -> s[2] < 0).findFirst().map(s -> new int[]{-s[2], s[0], s[1]}).get();
    }
}
