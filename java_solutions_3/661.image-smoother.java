/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */

class Solution {
    public int[][] imageSmoother(int[][] img) {
        return java.util.stream.IntStream.range(0, img.length).mapToObj(i -> java.util.stream.IntStream.range(0, img[0].length)
            .map(j -> (int) java.util.stream.IntStream.rangeClosed(Math.max(0, i - 1), Math.min(img.length - 1, i + 1))
                .flatMap(a -> java.util.stream.IntStream.rangeClosed(Math.max(0, j - 1), Math.min(img[0].length - 1, j + 1)).map(b -> img[a][b]))
                .average().getAsDouble()).toArray()).toArray(int[][]::new);
    }
}
