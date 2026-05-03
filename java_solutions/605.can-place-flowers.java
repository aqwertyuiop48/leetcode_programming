/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

record Solution() {
    public boolean canPlaceFlowers(int[] bed, int n) {
        return java.util.stream.IntStream.range(0, bed.length).filter(i -> bed[i] == 0 && (i == 0 || bed[i - 1] == 0) && (i == bed.length - 1 || bed[i + 1] == 0)).peek(i -> bed[i] = 1).count() >= n;
    }
}
