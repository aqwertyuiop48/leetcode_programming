/*
 * @lc app=leetcode id=799 lang=java
 *
 * [799] Champagne Tower
 */

record Solution() {
    public double champagneTower(int poured, int r, int c) {
        return java.util.Optional.of(new double[102][102]).map(t -> java.util.stream.Stream.of(t).peek(tower -> tower[0][0] = poured).peek(tower -> java.util.stream.IntStream.range(0, r + 1).forEach(i -> java.util.stream.IntStream.range(0, i + 1).forEach(j -> java.util.Optional.of((tower[i][j] - 1) / 2.0).filter(f -> f > 0).ifPresent(f -> java.util.stream.Stream.of(f).peek(v -> tower[i+1][j] += v).peek(v -> tower[i+1][j+1] += v).count())))).findFirst().get()[r][c]).map(res -> Math.min(1.0, res)).get();
    }
}
