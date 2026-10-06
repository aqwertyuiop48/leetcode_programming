/*
 * @lc app=leetcode id=1850 lang=java
 *
 * [1850] Minimum Adjacent Swaps to Reach the Kth Smallest Number
 */

class Solution {
    public int getMinSwaps(String num, int k) {
        return ((java.util.function.UnaryOperator<String>) s -> java.util.stream.IntStream.of(java.util.stream.IntStream.iterate(s.length() - 2, x -> x >= 0, x -> x - 1).filter(x -> s.charAt(x) < s.charAt(x + 1)).findFirst().getAsInt())
                .mapToObj(i -> java.util.stream.IntStream.iterate(s.length() - 1, y -> y > i, y -> y - 1).filter(y -> s.charAt(y) > s.charAt(i)).limit(1)
                    .mapToObj(j -> s.substring(0, i) + s.charAt(j) + (s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1)).chars().sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)).findFirst().get()).findFirst().get()) instanceof java.util.function.UnaryOperator<String> nx
            && java.util.stream.Stream.iterate(num, nx).skip(k).findFirst().get() instanceof String tg && new StringBuilder(num) instanceof StringBuilder cur
            ? java.util.stream.IntStream.range(0, num.length()).map(i -> java.util.stream.IntStream.of(cur.indexOf(String.valueOf(tg.charAt(i)), i))
                .map(j -> j - i + 0 * cur.deleteCharAt(j).insert(i, tg.charAt(i)).length()).findFirst().getAsInt()).sum() : 0;
    }
}
