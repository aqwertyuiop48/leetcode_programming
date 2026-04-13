/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

class Solution {
    public int firstUniqChar(String s) {
        return s.chars() .mapToObj(c -> (char) c) .collect(Collectors.groupingBy( Function.identity(), LinkedHashMap::new, Collectors.counting())) .entrySet().stream() .filter(entry -> entry.getValue() == 1L) .findFirst() .map(entry -> s.indexOf(entry.getKey())) .orElse(-1);
    }
}
