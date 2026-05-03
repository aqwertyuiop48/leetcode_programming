/*
 * @lc app=leetcode id=869 lang=java
 *
 * [869] Reordered Power of 2
 */

record Solution() {
    public boolean reorderedPowerOf2(int n) {
        return java.util.stream.IntStream.range(0, 31).mapToObj(i -> String.valueOf(1 << i).chars().sorted().toArray()).anyMatch(arr -> java.util.Arrays.equals(arr, String.valueOf(n).chars().sorted().toArray()));
    }
}
