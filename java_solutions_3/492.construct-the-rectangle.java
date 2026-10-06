/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

class Solution {
    public int[] constructRectangle(int area) {
        return java.util.stream.IntStream.iterate((int) Math.sqrt(area), w -> w - 1).filter(w -> area % w == 0).limit(1)
            .mapToObj(w -> new int[]{area / w, w}).findFirst().get();
    }
}
