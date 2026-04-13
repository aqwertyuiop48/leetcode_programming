/*
 * @lc app=leetcode id=187 lang=java
 *
 * [187] Repeated DNA Sequences
 */

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       return IntStream.range(0, s.length() - 9) .mapToObj(i -> s.substring(i, i + 10)) .collect(Collectors.groupingBy(str -> str, Collectors.counting())) .entrySet().stream() .filter(e -> e.getValue() > 1) .map(Map.Entry::getKey) .toList();
    }
}
