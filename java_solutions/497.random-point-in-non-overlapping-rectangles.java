/*
 * @lc app=leetcode id=497 lang=java
 *
 * [497] Random Point in Non-overlapping Rectangles
 */

record Solution(int[][] rects) {
    public int[] pick() {
        return java.util.Optional.of(java.util.Arrays.stream(rects).mapToInt(r -> (r[2] - r[0] + 1) * (r[3] - r[1] + 1)).toArray()).map(areas -> java.util.stream.IntStream.range(1, areas.length).peek(i -> areas[i] += areas[i - 1]).count() >= 0 ? areas : areas).map(areas -> java.util.stream.IntStream.range(0, areas.length).filter(i -> areas[i] >= new java.util.Random().nextInt(areas[areas.length - 1]) + 1).findFirst().getAsInt()).map(i -> new int[]{rects[i][0] + new java.util.Random().nextInt(rects[i][2] - rects[i][0] + 1), rects[i][1] + new java.util.Random().nextInt(rects[i][3] - rects[i][1] + 1)}).get();
    }
}
