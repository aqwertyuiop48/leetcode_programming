/*
 * @lc app=leetcode id=1207 lang=java
 *
 * [1207] Unique Number of Occurrences
 */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        return Optional.of(Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .values())
            .map(vals -> vals.size() == new HashSet<>(vals).size())
            .get();
    }
}
