/*
 * @lc app=leetcode id=991 lang=java
 *
 * [991] Broken Calculator
 */

class Solution {
    public int brokenCalc(int startValue, int target) {
        return new int[]{target, 0} instanceof int[] s
            && java.util.stream.Stream.of(0).peek(z -> {
                while (s[0] > startValue && (s[0] % 2 == 1 ? ++s[0] > 0 : (s[0] /= 2) > 0) && ++s[1] > 0) {}
            }).anyMatch(z -> true)
            ? s[1] + startValue - s[0] : 0;
    }
}
