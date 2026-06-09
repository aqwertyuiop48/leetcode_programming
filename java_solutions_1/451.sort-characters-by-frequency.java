/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

class Solution {
    public String frequencySort(String s) {
        return java.util.stream.Stream.of(new int[128]).peek(counts -> s.chars().forEach(c -> counts[c]++)).map(counts -> s.chars().boxed().sorted((a, b) -> counts[b] == counts[a] ? Integer.compare(a, b) : Integer.compare(counts[b], counts[a])).reduce(new java.lang.StringBuilder(), java.lang.StringBuilder::appendCodePoint, java.lang.StringBuilder::append).toString()).findFirst().get();
    }
}
