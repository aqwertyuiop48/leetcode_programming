/*
 * @lc app=leetcode id=997 lang=java
 *
 * [997] Find the Town Judge
 */

record Solution() {
    public int findJudge(int n, int[][] trust) {
        return java.util.stream.IntStream.rangeClosed(1, n).filter(i -> java.util.stream.IntStream.range(0, trust.length).filter(t -> trust[t][1] == i).count() == n - 1 && java.util.stream.IntStream.range(0, trust.length).noneMatch(t -> trust[t][0] == i)).findFirst().orElse(-1);
    }
}
