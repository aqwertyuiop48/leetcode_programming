/*
 * @lc app=leetcode id=2363 lang=java
 *
 * [2363] Merge Similar Items
 */

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        return Stream.concat(Arrays.stream(items1), Arrays.stream(items2))
            .collect(Collectors.groupingBy(it -> it[0], TreeMap::new, Collectors.summingInt(it -> it[1])))
            .entrySet().stream()
            .map(e -> Arrays.asList(e.getKey(), e.getValue()))
            .collect(Collectors.toList());
    }
}
