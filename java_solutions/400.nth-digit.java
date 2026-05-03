/*
 * @lc app=leetcode id=400 lang=java
 *
 * [400] Nth Digit
 */

record Solution() {
    public int findNthDigit(int n) {
        return java.util.stream.Stream.iterate(new long[]{1, 9, 1, n}, s -> s[3] > s[1] * s[2] ? new long[]{s[0] * 10, s[1] * 10, s[2] + 1, s[3] - s[1] * s[2]} : s).filter(s -> s[3] <= s[1] * s[2]).findFirst().map(s -> String.valueOf(s[0] + (s[3] - 1) / s[2]).charAt((int)((s[3] - 1) % s[2])) - '0').get();
    }
}
