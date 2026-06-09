/*
 * @lc app=leetcode id=386 lang=java
 *
 * [386] Lexicographical Numbers
 */

class Solution {
    public java.util.List<Integer> lexicalOrder(int n) {
        return java.util.stream.Stream.of(new java.util.ArrayList<Integer>()).peek(res -> java.util.stream.IntStream.range(0, n).boxed().reduce(1, (curr, i) -> java.util.stream.Stream.of(curr).peek(res::add).map(c -> c * 10 <= n ? c * 10 : java.util.stream.Stream.iterate(new int[]{c}, x -> true, x -> new int[]{x[0] / 10}).filter(x -> x[0] % 10 != 9 && x[0] < n).findFirst().get()[0] + 1).findFirst().get(), (a, b) -> b)).findFirst().get();
    }
}
