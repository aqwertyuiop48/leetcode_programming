/*
 * @lc app=leetcode id=2053 lang=java
 *
 * [2053] Kth Distinct String in an Array
 */

class Solution {
    public String kthDistinct(String[] arr, int k) {
        return Arrays.stream(arr)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .skip(k - 1)
            .findFirst()
            .orElse("");
    }
}
