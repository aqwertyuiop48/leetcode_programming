/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 */

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        return java.util.Arrays.stream(words).collect(java.util.stream.Collectors.groupingBy(w -> w, java.util.stream.Collectors.counting())).entrySet().stream()
            .sorted(java.util.Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(java.util.Map.Entry.comparingByKey()))
            .limit(k).map(java.util.Map.Entry::getKey).toList();
    }
}
