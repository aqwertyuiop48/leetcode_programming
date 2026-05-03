/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

record Solution() {
    public int characterReplacement(String s, int k) {
        return java.util.stream.IntStream.range(0, s.length()).boxed().reduce(new int[29], (a, right) -> java.util.stream.Stream.of(a).peek(st -> st[3 + s.charAt(right) - 'A']++).peek(st -> st[1] = Math.max(st[1], st[3 + s.charAt(right) - 'A'])).peek(st -> java.util.stream.Stream.iterate(0, d -> right - st[0] + 1 - st[1] > k, d -> st[3 + s.charAt(st[0]++) - 'A']-- * 0).count()).peek(st -> st[2] = Math.max(st[2], right - st[0] + 1)).findFirst().get(), (x, y) -> x)[2];
    }
}
