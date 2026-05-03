/*
 * @lc app=leetcode id=826 lang=java
 *
 * [826] Most Profit Assigning Work
 */

record Solution() {
    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        return java.util.Optional.of(java.util.stream.IntStream.range(0, d.length).mapToObj(i -> new int[]{d[i], p[i]}).sorted(java.util.Comparator.comparingInt(a -> a[0])).toArray(int[][]::new)).map(jobs -> java.util.Arrays.stream(w).sorted().boxed().reduce(new int[]{0, 0, 0}, (s, worker) -> java.util.stream.Stream.iterate(s[0], i -> i < jobs.length && jobs[i][0] <= worker, i -> i + 1).reduce((a, b) -> b).map(idx -> new int[]{idx, java.util.stream.IntStream.range(s[0], idx).map(j -> jobs[j][1]).reduce(s[1], Math::max), s[2] + java.util.stream.IntStream.range(s[0], idx).map(j -> jobs[j][1]).reduce(s[1], Math::max)}).orElse(new int[]{s[0], s[1], s[2] + s[1]}), (a, b) -> a)[2]).get();
    }
}
