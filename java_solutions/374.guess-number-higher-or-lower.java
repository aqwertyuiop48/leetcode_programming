/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return Stream.iterate(new long[]{1, (long)n, 0, -2}, p -> Optional.of(p[0] + (p[1] - p[0]) / 2).map(m -> Optional.of((long)guess(m.intValue())).map(g -> new long[]{g == 1 ? m + 1 : p[0], g == -1 ? m - 1 : p[1], m, g}).get()).get()).filter(p -> p[3] == 0).findFirst().map(p -> (int)p[2]).get();
    }
}
