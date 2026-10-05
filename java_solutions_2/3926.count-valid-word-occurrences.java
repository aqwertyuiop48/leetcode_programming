/*
 * @lc app=leetcode id=3926 lang=java
 *
 * [3926] Count Valid Word Occurrences
 */

class Solution {
public int[] countWordOccurrences(String[] chunks, String[] queries) {
    return Stream.of(java.util.regex.Pattern.compile("[a-z]+(-[a-z]+)*").matcher(String.join("", chunks)).results().map(r -> r.group()).collect(Collectors.groupingBy(w -> w, Collectors.counting()))).flatMapToInt(freq -> Arrays.stream(queries).mapToInt(q -> freq.getOrDefault(q, 0L).intValue())).toArray();
}
}
