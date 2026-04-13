/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

class Solution {
    public int hIndex(int[] citations) {
        return Optional.of(Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).toList()).map(list -> IntStream.range(0, list.size()).filter(i -> list.get(i) < i + 1).findFirst().orElse(list.size())).get();
    }
}
