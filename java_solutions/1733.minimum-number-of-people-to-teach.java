/*
 * @lc app=leetcode id=1733 lang=java
 *
 * [1733] Minimum Number of People to Teach
 */

class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        return java.util.Optional.of(java.util.Arrays.stream(friendships).filter(e -> java.util.Arrays.stream(languages[e[0] - 1]).noneMatch(l1 -> java.util.Arrays.stream(languages[e[1] - 1]).anyMatch(l2 -> l1 == l2))).flatMapToInt(e -> java.util.stream.IntStream.of(e[0], e[1])).distinct().toArray()).map(u -> u.length == 0 ? 0 : u.length - java.util.Arrays.stream(u).flatMap(user -> java.util.Arrays.stream(languages[user - 1])).boxed().collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting())).values().stream().mapToInt(Long::intValue).max().orElse(0)).get();
    }
}
