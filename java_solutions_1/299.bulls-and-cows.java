/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        return java.util.stream.Stream.of(0).map(_v -> java.util.stream.IntStream.range(0, secret.length()).boxed().reduce(new int[21], (a, i) -> java.util.stream.Stream.of(0).map(_x -> a).peek(arr -> arr[20] += secret.charAt(i) == guess.charAt(i) ? 1 : 0).peek(arr -> arr[secret.charAt(i) - '0'] += secret.charAt(i) == guess.charAt(i) ? 0 : 1).peek(arr -> arr[guess.charAt(i) - '0' + 10] += secret.charAt(i) == guess.charAt(i) ? 0 : 1).findFirst().get(), (a, b) -> b)).map(arr -> arr[20] + "A" + java.util.stream.IntStream.range(0, 10).map(i -> Math.min(arr[i], arr[i + 10])).sum() + "B").findFirst().get();
    }
}
// @lc code=end
