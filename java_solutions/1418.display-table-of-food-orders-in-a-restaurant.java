/*
 * @lc app=leetcode id=1418 lang=java
 *
 * [1418] Display Table of Food Orders in a Restaurant
 */

class Solution {
    public java.util.List<java.util.List<String>> displayTable(java.util.List<java.util.List<String>> o) {
        return java.util.stream.Stream.concat(java.util.stream.Stream.of(java.util.stream.Stream.concat(java.util.stream.Stream.of("Table"), o.stream().map(x -> x.get(2)).distinct().sorted()).collect(java.util.stream.Collectors.toList())), o.stream().collect(java.util.stream.Collectors.groupingBy(x -> Integer.parseInt(x.get(1)), java.util.TreeMap::new, java.util.stream.Collectors.groupingBy(x -> x.get(2), java.util.stream.Collectors.counting()))).entrySet().stream().map(e -> java.util.stream.Stream.concat(java.util.stream.Stream.of(String.valueOf(e.getKey())), o.stream().map(x -> x.get(2)).distinct().sorted().map(i -> String.valueOf(e.getValue().getOrDefault(i, 0L)))).collect(java.util.stream.Collectors.toList()))).collect(java.util.stream.Collectors.toList());
    }
}
