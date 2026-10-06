/*
 * @lc app=leetcode id=835 lang=java
 *
 * [835] Image Overlap
 */

class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        return java.util.stream.IntStream.range(0, img1.length * img1.length).filter(a -> img1[a / img1.length][a % img1.length] == 1).boxed()
            .flatMap(a -> java.util.stream.IntStream.range(0, img1.length * img1.length).filter(b -> img2[b / img1.length][b % img1.length] == 1)
                .mapToObj(b -> (b / img1.length - a / img1.length) * 100 + (b % img1.length - a % img1.length)))
            .collect(java.util.stream.Collectors.groupingBy(v -> v, java.util.stream.Collectors.counting())).values().stream().mapToInt(Long::intValue).max().orElse(0);
    }
}
