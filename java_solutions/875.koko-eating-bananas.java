/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

record Solution() {
    public int minEatingSpeed(int[] p, int h) {
        return java.util.stream.Stream.iterate(new int[]{1, 1000000000}, b -> b[0] < b[1], b -> java.util.Optional.of((b[0] + b[1]) / 2).map(m -> java.util.Arrays.stream(p).mapToLong(x -> (x + m - 1) / m).sum() <= h ? new int[]{b[0], m} : new int[]{m + 1, b[1]}).get()).reduce((a, b) -> b).get()[0];
    }
}
