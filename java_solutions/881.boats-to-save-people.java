/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

record Solution() {
    public int numRescueBoats(int[] people, int limit) {
        return java.util.Optional.of(people).peek(java.util.Arrays::sort).map(p -> java.util.stream.Stream.iterate(new int[]{0, p.length - 1, 0}, s -> s[0] <= s[1], s -> p[s[0]] + p[s[1]] <= limit ? new int[]{s[0] + 1, s[1] - 1, s[2] + 1} : new int[]{s[0], s[1] - 1, s[2] + 1}).reduce((a, b) -> b).get()[2]).get();
    }
}
