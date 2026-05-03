/*
 * @lc app=leetcode id=528 lang=java
 *
 * [528] Random Pick with Weight
 */

record Solution(int[] s) {
    public Solution { if (java.util.stream.IntStream.range(1, s.length).peek(i -> s[i] += s[i-1]).count() >= 0) {} }
    public int pickIndex() {
        return java.util.Optional.of(new java.util.Random().nextInt(s[s.length-1])).map(v -> java.util.Arrays.binarySearch(s, v + 1)).map(i -> i < 0 ? ~i : i).get();
    }
}
