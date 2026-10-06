/*
 * @lc app=leetcode id=893 lang=java
 *
 * [893] Groups of Special-Equivalent Strings
 */

class Solution {
    public int numSpecialEquivGroups(String[] words) {
        return (int) java.util.Arrays.stream(words).map(w -> java.util.stream.IntStream.range(0, w.length()).filter(i -> i % 2 == 0).mapToObj(i -> "" + w.charAt(i)).sorted().collect(java.util.stream.Collectors.joining())
            + "|" + java.util.stream.IntStream.range(0, w.length()).filter(i -> i % 2 == 1).mapToObj(i -> "" + w.charAt(i)).sorted().collect(java.util.stream.Collectors.joining())).distinct().count();
    }
}
