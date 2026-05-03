/*
 * @lc app=leetcode id=406 lang=java
 *
 * [406] Queue Reconstruction by Height
 */

record Solution() {
    public int[][] reconstructQueue(int[][] people) {
        return java.util.Arrays.stream(people).sorted((a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]).reduce(new java.util.ArrayList<int[]>(), (l, p) -> java.util.stream.Stream.of(l).peek(list -> list.add(p[1], p)).findFirst().get(), (a, b) -> a).toArray(new int[0][0]);
    }
}
