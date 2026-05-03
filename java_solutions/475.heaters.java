/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 */

record Solution() {
    public int findRadius(int[] houses, int[] heaters) {
        return java.util.Optional.of(java.util.Arrays.stream(heaters).sorted().toArray()).map(h -> java.util.Arrays.stream(houses).map(house -> java.util.Optional.of(java.util.Arrays.binarySearch(h, house)).map(idx -> idx >= 0 ? 0 : Math.min(~idx < h.length ? h[~idx] - house : Integer.MAX_VALUE, ~idx > 0 ? house - h[~idx - 1] : Integer.MAX_VALUE)).get()).max().orElse(0)).get();
    }
}
