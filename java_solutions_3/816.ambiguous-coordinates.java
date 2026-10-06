/*
 * @lc app=leetcode id=816 lang=java
 *
 * [816] Ambiguous Coordinates
 */

class Solution {
    public List<String> ambiguousCoordinates(String s) {
        return ((java.util.function.Function<String, java.util.List<String>>) x -> x.length() == 1 ? java.util.List.of(x)
                : x.charAt(0) == '0' ? (x.endsWith("0") ? java.util.List.<String>of() : java.util.List.of("0." + x.substring(1)))
                : x.endsWith("0") ? java.util.List.of(x)
                : java.util.stream.Stream.concat(java.util.stream.Stream.of(x), java.util.stream.IntStream.range(1, x.length()).mapToObj(k -> x.substring(0, k) + "." + x.substring(k))).toList())
            instanceof java.util.function.Function<String, java.util.List<String>> c
            ? java.util.stream.IntStream.range(2, s.length() - 1).boxed().flatMap(i -> c.apply(s.substring(1, i)).stream()
                .flatMap(l -> c.apply(s.substring(i, s.length() - 1)).stream().map(r -> "(" + l + ", " + r + ")"))).toList()
            : null;
    }
}
