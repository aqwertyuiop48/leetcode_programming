/*
 * @lc app=leetcode id=1093 lang=java
 *
 * [1093] Statistics from a Large Sample
 */

class Solution {
    public double[] sampleStats(int[] count) {
        return new double[]{java.util.stream.IntStream.range(0, 256).filter(i -> count[i] > 0).findFirst().getAsInt(), java.util.stream.IntStream.range(0, 256).filter(i -> count[i] > 0).max().getAsInt(), java.util.stream.IntStream.range(0, 256).mapToDouble(i -> (double) i * count[i]).sum() / java.util.Arrays.stream(count).asLongStream().sum(), (java.util.stream.Stream.iterate(new int[]{0, 0}, s -> s[1] <= (int)((java.util.Arrays.stream(count).asLongStream().sum() - 1) / 2) ? new int[]{s[0] + 1, s[1] + count[s[0]]} : s).filter(s -> s[1] > (int)((java.util.Arrays.stream(count).asLongStream().sum() - 1) / 2)).findFirst().get()[0] - 1 + java.util.stream.Stream.iterate(new int[]{0, 0}, s -> s[1] <= (int)(java.util.Arrays.stream(count).asLongStream().sum() / 2) ? new int[]{s[0] + 1, s[1] + count[s[0]]} : s).filter(s -> s[1] > (int)(java.util.Arrays.stream(count).asLongStream().sum() / 2)).findFirst().get()[0] - 1) / 2.0, java.util.stream.IntStream.range(0, 256).reduce((a, b) -> count[a] >= count[b] ? a : b).getAsInt()};
    }
}
