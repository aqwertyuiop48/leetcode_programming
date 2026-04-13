/*
 * @lc app=leetcode id=318 lang=java
 *
 * [318] Maximum Product of Word Lengths
 */

class Solution {
    public int maxProduct(String[] words) {
        return Optional.of(Arrays.stream(words).map(w -> new int[]{w.chars().reduce(0, (m, c) -> m | (1 << (c - 'a'))), w.length()}).toArray(int[][]::new)).map(data -> IntStream.range(0, data.length).flatMap(i -> IntStream.range(i + 1, data.length).filter(j -> (data[i][0] & data[j][0]) == 0).map(j -> data[i][1] * data[j][1])).max().orElse(0)).get();
    }
}
