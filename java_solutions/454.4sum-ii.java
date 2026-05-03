/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

record Solution() {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        return java.util.Optional.of(java.util.Arrays.stream(A).boxed().flatMap(a -> java.util.Arrays.stream(B).mapToObj(b -> a + b)).collect(java.util.stream.Collectors.groupingBy(x -> x, java.util.stream.Collectors.counting()))).map(map -> java.util.Arrays.stream(C).boxed().flatMap(c -> java.util.Arrays.stream(D).mapToObj(d -> c + d)).mapToInt(sum -> map.getOrDefault(-sum, 0L).intValue()).sum()).get();
    }
}
