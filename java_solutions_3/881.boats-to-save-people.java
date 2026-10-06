/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        return java.util.Arrays.stream(people).sorted().toArray() instanceof int[] a && new int[]{0, a.length - 1, 0} instanceof int[] s
            && java.util.stream.Stream.of(0).peek(z -> {
                while (s[0] <= s[1] && (a[s[0]] + a[s[1]] <= limit ? s[0]++ : s[0]) >= 0 && s[1]-- >= 0 && s[2]++ >= 0) {}
            }).anyMatch(z -> true)
            ? s[2] : 0;
    }
}
