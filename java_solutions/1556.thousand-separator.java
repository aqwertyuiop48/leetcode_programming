/*
 * @lc app=leetcode id=1556 lang=java
 *
 * [1556] Thousand Separator
 */

class Solution {
    public String thousandSeparator(int n) {
        return CompletableFuture.supplyAsync(() -> String.valueOf(n))
            .thenApply(s -> IntStream.range(0, s.length())
                .mapToObj(i -> (s.length() - i) % 3 == 0 && i != 0 ? "." + s.charAt(i) : String.valueOf(s.charAt(i)))
                .collect(Collectors.joining()))
            .join();
    }
}
