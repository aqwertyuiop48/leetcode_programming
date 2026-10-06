/*
 * @lc app=leetcode id=738 lang=java
 *
 * [738] Monotone Increasing Digits
 */

class Solution {
    public int monotoneIncreasingDigits(int n) {
        return String.valueOf(n).toCharArray() instanceof char[] c && new int[]{c.length} instanceof int[] mk
            && java.util.stream.IntStream.iterate(c.length - 1, i -> i > 0, i -> i - 1).filter(i -> c[i - 1] > c[i]).peek(i -> mk[0] = i + 0 * c[i - 1]--).allMatch(x -> true)
            && java.util.stream.IntStream.range(mk[0], c.length).peek(i -> c[i] = '9').allMatch(x -> true)
            ? Integer.parseInt(new String(c)) : 0;
    }
}
