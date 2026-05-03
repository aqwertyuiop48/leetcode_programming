/*
 * @lc app=leetcode id=888 lang=java
 *
 * [888] Fair Candy Swap
 */

record Solution() {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        return java.util.Optional.of((java.util.stream.IntStream.of(bobSizes).sum() - java.util.stream.IntStream.of(aliceSizes).sum()) / 2).map(d -> java.util.Optional.of(java.util.Arrays.stream(bobSizes).boxed().collect(java.util.stream.Collectors.toSet())).map(s -> java.util.Arrays.stream(aliceSizes).filter(x -> s.contains(x + d)).mapToObj(x -> new int[]{x, x + d}).findFirst().get()).get()).get();
    }
}
