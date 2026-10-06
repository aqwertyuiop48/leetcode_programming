/*
 * @lc app=leetcode id=957 lang=java
 *
 * [957] Prison Cells After N Days
 */

class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        return java.util.stream.Stream.iterate(cells, c -> java.util.stream.IntStream.range(0, 8).map(i -> i == 0 || i == 7 ? 0 : c[i - 1] == c[i + 1] ? 1 : 0).toArray())
            .skip(n == 0 ? 0 : (n - 1) % 14 + 1).findFirst().get();
    }
}
