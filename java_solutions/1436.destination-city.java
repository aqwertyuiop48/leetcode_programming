/*
 * @lc app=leetcode id=1436 lang=java
 *
 * [1436] Destination City
 */

class Solution {
    public String destCity(List<List<String>> paths) {
        return paths.stream()
            .map(path -> path.get(1))
            .filter(dest -> paths.stream().map(p -> p.get(0)).noneMatch(src -> src.equals(dest)))
            .findFirst()
            .orElse("");
    }
}
