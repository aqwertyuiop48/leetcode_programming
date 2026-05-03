/*
 * @lc app=leetcode id=1637 lang=java
 *
 * [1637] Widest Vertical Area Between Two Points Containing No Points
 */

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        return new Object[]{java.util.Arrays.stream(points).mapToInt(p -> p[0]).sorted().toArray()} instanceof Object[] a ? java.util.stream.IntStream.range(0, ((int[])a[0]).length - 1).map(i -> ((int[])a[0])[i + 1] - ((int[])a[0])[i]).max().orElse(0) : 0;
    }
}
