/*
 * @lc app=leetcode id=868 lang=java
 *
 * [868] Binary Gap
 */

class Solution {
    public int binaryGap(int n) {
        return Optional.of(IntStream.range(0, Integer.toBinaryString(n).length()).filter(i -> Integer.toBinaryString(n).charAt(i) == '1').boxed().collect(Collectors.toList())).map(list -> IntStream.range(1, list.size()).map(i -> list.get(i) - list.get(i - 1)).max().orElse(0)).get();
    }
}
