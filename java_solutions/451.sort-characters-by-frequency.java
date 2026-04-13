/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

class Solution {
    public String frequencySort(String s) {
        return s.chars().boxed().collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting())).entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).map(e -> String.valueOf(e.getKey()).repeat(e.getValue().intValue())).collect(Collectors.joining());
    }
}
