/*
 * @lc app=leetcode id=4001 lang=java
 *
 * [4001] Aggregate Two Time Series
 */

class Solution {
    public java.util.List<java.util.List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        return java.util.stream.Stream.<java.util.List<java.util.List<Integer>>>of(new java.util.ArrayList<>())
            .peek(ans -> java.util.stream.Stream.<int[]>of(new int[]{0, 0})
                .forEach(p -> java.util.stream.Stream.generate(() -> p[0] < series1.length || p[1] < series2.length)
                    .takeWhile(b -> b)
                    .forEach(dummy -> ans.add(
                        (p[0] < series1.length && p[1] < series2.length)
                            ? (series1[p[0]][0] == series2[p[1]][0]
                                ? java.util.Arrays.asList(series1[p[0]][0], series1[p[0]++][1] + series2[p[1]++][1])
                                : (series1[p[0]][0] < series2[p[1]][0]
                                    ? java.util.Arrays.asList(series1[p[0]][0], series1[p[0]++][1] + series2[p[1]][1])
                                    : java.util.Arrays.asList(series2[p[1]][0], series2[p[1]++][1] + series1[p[0]][1])))
                            : (p[0] < series1.length
                                ? java.util.Arrays.asList(series1[p[0]][0], series1[p[0]++][1])
                                : java.util.Arrays.asList(series2[p[1]][0], series2[p[1]++][1]))
                    ))
                )
            ).findFirst().get();
    }
}
