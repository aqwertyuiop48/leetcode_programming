/*
 * @lc app=leetcode id=275 lang=java
 *
 * [275] H-Index II
 */

class Solution {
    public int hIndex(int[] citations) {
        return Optional.of(Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).toList()).map(list -> (int) IntStream.range(0, list.size()).filter(i -> list.get(i) >= i + 1).count()).get();
    }
}
