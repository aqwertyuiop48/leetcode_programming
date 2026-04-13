/*
 * @lc app=leetcode id=1417 lang=java
 *
 * [1417] Reformat The String
 */

class Solution {
    public String reformat(String s) {
        return Optional.of(s.chars().mapToObj(c -> (char) c).collect(Collectors.partitioningBy(Character::isDigit)))
            .filter(map -> Math.abs(map.get(true).size() - map.get(false).size()) <= 1)
            .map(map -> Stream.of(map.get(true).size() >= map.get(false).size() ? map.get(true) : map.get(false), 
                                 map.get(true).size() >= map.get(false).size() ? map.get(false) : map.get(true))
                .collect(Collectors.toList()))
            .map(lists -> IntStream.range(0, s.length())
                .mapToObj(i -> String.valueOf(lists.get(i % 2).get(i / 2)))
                .collect(Collectors.joining()))
            .orElse("");
    }
}
