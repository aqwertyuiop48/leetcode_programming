/*
 * @lc app=leetcode id=880 lang=java
 *
 * [880] Decoded String at Index
 */

class Solution {
    public String decodeAtIndex(String s, int k) {
        return new long[s.length() + 1] instanceof long[] sz && new long[]{k} instanceof long[] kk
            ? java.util.stream.IntStream.of((int) java.util.stream.IntStream.range(0, s.length()).takeWhile(i -> sz[i] < k)
                    .peek(i -> sz[i + 1] = Character.isDigit(s.charAt(i)) ? sz[i] * (s.charAt(i) - '0') : sz[i] + 1).count())
                .mapToObj(m -> java.util.stream.IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).filter(i -> (kk[0] %= sz[i + 1]) == 0 && Character.isLetter(s.charAt(i)))
                    .mapToObj(i -> String.valueOf(s.charAt(i))).findFirst().get()).findFirst().get()
            : "";
    }
}
