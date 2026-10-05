/*
 * @lc app=leetcode id=3999 lang=java
 *
 * [3999] Minimum Number of String Groups Through Transformations
 */

class Solution {
    public int minimumGroups(String[] words) {
        return (int) java.util.Arrays.stream(words)
            .map(w -> java.util.stream.Stream.of(
                java.util.stream.IntStream.range(0, w.length()).filter(i -> (i & 1) == 0).mapToObj(i -> String.valueOf(w.charAt(i))).collect(java.util.stream.Collectors.joining()),
                java.util.stream.IntStream.range(0, w.length()).filter(i -> (i & 1) != 0).mapToObj(i -> String.valueOf(w.charAt(i))).collect(java.util.stream.Collectors.joining())
            )
            .map(s -> s.length() <= 1 
                ? s 
                : java.util.stream.Stream.of(s + s)
                    .map(t -> java.util.stream.Stream.of(
                        java.util.stream.IntStream.range(0, 2 * s.length())
                            .boxed()
                            .reduce(new int[]{0, 1, 0}, (p, step) -> (p[0] >= s.length() || p[1] >= s.length() || p[2] >= s.length())
                                ? p
                                : (t.charAt(p[0] + p[2]) == t.charAt(p[1] + p[2])
                                    ? new int[]{p[0], p[1], p[2] + 1}
                                    : (t.charAt(p[0] + p[2]) > t.charAt(p[1] + p[2])
                                        ? new int[]{Math.max(p[0] + p[2] + 1, p[1] + 1), p[1], 0}
                                        : new int[]{p[0], Math.max(p[1] + p[2] + 1, p[0] + 1), 0})),
                                (a, b) -> a)
                        )
                        .map(p -> t.substring(Math.min(p[0], p[1]), Math.min(p[0], p[1]) + s.length()))
                        .findFirst().get()
                    )
                    .findFirst().get()
            )
            .collect(java.util.stream.Collectors.joining("|")))
            .distinct()
            .count();
    }
}
