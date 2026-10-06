/*
 * @lc app=leetcode id=646 lang=java
 *
 * [646] Maximum Length of Pair Chain
 */

class Solution {
    public int findLongestChain(int[][] pairs) {
        return java.util.Arrays.stream(pairs).sorted(java.util.Comparator.comparingInt(p -> p[1]))
            .reduce(new int[]{Integer.MIN_VALUE, 0}, (a, p) -> p[0] > a[0] ? new int[]{p[1], a[1] + 1} : a)[1];
    }
}
