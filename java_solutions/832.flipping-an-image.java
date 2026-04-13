/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        return Arrays.stream(image)
            .map(row -> IntStream.range(0, row.length)
                .map(i -> row[row.length - 1 - i] ^ 1)
                .toArray())
            .toArray(int[][]::new);
    }
}
