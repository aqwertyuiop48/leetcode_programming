/*
 * @lc app=leetcode id=1614 lang=java
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

class Solution {
    public int maxDepth(String s) {
        return CompletableFuture.supplyAsync(() -> IntStream.range(0, s.length())
                .map(i -> (int) s.substring(0, i + 1).chars().filter(c -> c == '(').count() 
                           - (int) s.substring(0, i + 1).chars().filter(c -> c == ')').count())
                .max()
                .orElse(0))
            .join();
    }
}
