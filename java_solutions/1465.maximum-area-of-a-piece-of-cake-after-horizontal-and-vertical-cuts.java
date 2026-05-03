/*
 * @lc app=leetcode id=1465 lang=java
 *
 * [1465] Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
 */

class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        return (int) (java.util.stream.Stream.<int[][]>of(new int[][]{java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0, h), java.util.Arrays.stream(hc)).sorted().toArray(), java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0, w), java.util.Arrays.stream(vc)).sorted().toArray()}).mapToLong(a -> (long) java.util.stream.IntStream.range(1, a[0].length).map(i -> a[0][i] - a[0][i-1]).max().getAsInt() * java.util.stream.IntStream.range(1, a[1].length).map(i -> a[1][i] - a[1][i-1]).max().getAsInt() % 1000000007).findFirst().getAsLong());
    }
}
