/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        return s.length() < p.length() ? new ArrayList<>() : Optional.of(new int[26]).map(d -> IntStream.range(0, s.length()).filter(i -> (i < p.length() ? d[p.charAt(i) - 'a']-- < 100 : true) && (d[s.charAt(i) - 'a']++ < 100) && (i >= p.length() ? d[s.charAt(i - p.length()) - 'a']-- < 100 : true) && i >= p.length() - 1 && Arrays.stream(d).allMatch(v -> v == 0)).mapToObj(i -> i - p.length() + 1).collect(Collectors.toList())).get();
    }
}
