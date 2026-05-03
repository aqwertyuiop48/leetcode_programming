/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

record Solution() {
    public int[] constructRectangle(int area) {
        return java.util.stream.IntStream.iterate((int) Math.sqrt(area), i -> i > 0, i -> i - 1).filter(i -> area % i == 0).findFirst().map(i -> new int[]{area / i, i}).get();
    }
}
