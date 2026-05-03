/*
 * @lc app=leetcode id=481 lang=java
 *
 * [481] Magical String
 */

record Solution() {
    public int magicalString(int n) {
        return n <= 3 ? (n > 0 ? 1 : 0) : java.util.Optional.of(new int[n + 1]).map(a -> java.util.stream.IntStream.range(0, 3).peek(i -> a[i] = new int[]{1, 2, 2}[i]).count() * 0 + java.util.stream.Stream.iterate(new int[]{2, 3}, s -> s[1] < n, s -> new int[]{s[0] + 1, s[1] + a[s[0]]}).peek(s -> java.util.stream.IntStream.range(0, a[s[0]]).filter(i -> s[1] + i < n).forEach(i -> a[s[1] + i] = 3 - a[s[1] - 1])).count() * 0 + (int) java.util.stream.IntStream.range(0, n).filter(i -> a[i] == 1).count()).get();
    }
}
