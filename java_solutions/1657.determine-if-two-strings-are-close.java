/*
 * @lc app=leetcode id=1657 lang=java
 *
 * [1657] Determine if Two Strings Are Close
 */

class Solution {
    public boolean closeStrings(String w1, String w2) {
        return w1.length() == w2.length() && java.util.Arrays.equals(w1.chars().distinct().sorted().toArray(), w2.chars().distinct().sorted().toArray()) && java.util.Arrays.equals(java.util.Arrays.stream(w1.chars().boxed().collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting())).values().toArray(new Long[0])).mapToLong(l -> l).sorted().toArray(), java.util.Arrays.stream(w2.chars().boxed().collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting())).values().toArray(new Long[0])).mapToLong(l -> l).sorted().toArray());
    }
}
