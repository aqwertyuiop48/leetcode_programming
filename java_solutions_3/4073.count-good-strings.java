/*
 * @lc app=leetcode id=4073 lang=java
 *
 * [4073] Count Good Strings
 */

class Solution {
    public int countGoodStrings(long n) {
        return (int) (2 * Long.toBinaryString(n).chars().boxed().reduce(new long[]{0, 1}, (s, bit) -> java.util.stream.Stream.of(s[0] * ((2 * s[1] - s[0] + 1000000007L) % 1000000007L) % 1000000007L)
            .map(c -> java.util.stream.Stream.of((s[0] * s[0] + s[1] * s[1]) % 1000000007L).map(d -> bit == '1' ? new long[]{d, (c + d) % 1000000007L} : new long[]{c, d}).findFirst().get()).findFirst().get(), (a, b) -> a)[0] % 1000000007L);
    }
}
