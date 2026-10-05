/*
 * @lc app=leetcode id=3963 lang=java
 *
 * [3963] Create Grid With Exactly One Path
 */

class Solution {
    public String[] createGrid(int m, int n) {
        return IntStream.range(0, m)
                .mapToObj(i -> IntStream.range(0, n)
                        .mapToObj(j -> i == 0 || j == n - 1 ? "." : "#")
                        .collect(Collectors.joining()))
                .toArray(String[]::new);
    }
}
