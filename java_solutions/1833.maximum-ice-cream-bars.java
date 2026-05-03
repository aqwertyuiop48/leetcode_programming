/*
 * @lc app=leetcode id=1833 lang=java
 *
 * [1833] Maximum Ice Cream Bars
 */

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        return java.util.Optional.of(java.util.Arrays.stream(costs).sorted().toArray()).map(arr -> java.util.stream.Stream.iterate(new long[]{0, 0}, s -> s[0] < arr.length && s[1] + arr[(int)s[0]] <= coins ? new long[]{s[0] + 1, s[1] + arr[(int)s[0]]} : new long[]{s[0], -1}).filter(s -> s[1] < 0).findFirst().get()[0]).get().intValue();
    }
}
