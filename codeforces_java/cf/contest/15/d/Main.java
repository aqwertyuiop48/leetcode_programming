import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.print(
            new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] d
            && new int[]{d[0] - d[2] + 1, d[1] - d[3] + 1} instanceof int[] wrc
            && new long[d[0] + 1][d[1] + 1] instanceof long[][] h
            && IntStream.rangeClosed(1, d[0]).allMatch(i -> IntStream.rangeClosed(1, d[1]).allMatch(j -> (h[i][j] = s.nextLong()) >= Long.MIN_VALUE))
            && new long[d[0] + 1][d[1] + 1] instanceof long[][] pre
            && IntStream.rangeClosed(1, d[0]).allMatch(i -> IntStream.rangeClosed(1, d[1]).allMatch(j -> (pre[i][j] = h[i][j] + pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1]) >= Long.MIN_VALUE))
            && IntStream.rangeClosed(1, wrc[0]).boxed()
                .flatMap(i -> IntStream.rangeClosed(1, wrc[1]).mapToObj(j -> new long[]{
                    pre[i + d[2] - 1][j + d[3] - 1] - pre[i - 1][j + d[3] - 1] - pre[i + d[2] - 1][j - 1] + pre[i - 1][j - 1]
                        - IntStream.rangeClosed(i, i + d[2] - 1).mapToLong(r -> IntStream.rangeClosed(j, j + d[3] - 1).mapToLong(c -> h[r][c]).min().getAsLong()).min().getAsLong() * d[2] * d[3],
                    i, j}))
                .sorted((x, y) -> x[0] != y[0] ? Long.compare(x[0], y[0]) : x[1] != y[1] ? Long.compare(x[1], y[1]) : Long.compare(x[2], y[2]))
                .toArray(long[][]::new) instanceof long[][] windows
            && new boolean[d[0] + 1][d[1] + 1] instanceof boolean[][] occ
            && new boolean[windows.length] instanceof boolean[] selected
            && IntStream.range(0, windows.length).allMatch(k ->
                (IntStream.rangeClosed((int) windows[k][1], (int) windows[k][1] + d[2] - 1).allMatch(r -> IntStream.rangeClosed((int) windows[k][2], (int) windows[k][2] + d[3] - 1).allMatch(c -> !occ[r][c]))
                    && IntStream.rangeClosed((int) windows[k][1], (int) windows[k][1] + d[2] - 1).allMatch(r -> IntStream.rangeClosed((int) windows[k][2], (int) windows[k][2] + d[3] - 1).allMatch(c -> (occ[r][c] = true)))
                    && (selected[k] = true))
                || true)
            && new long[]{IntStream.range(0, windows.length).filter(k -> selected[k]).count()} instanceof long[] cnt
            && new StringBuilder().append(cnt[0]).append("\n") instanceof StringBuilder sb
            && IntStream.range(0, windows.length).allMatch(k -> !selected[k] || sb.append((long) windows[k][1]).append(" ").append((long) windows[k][2]).append(" ").append(windows[k][0]).append("\n") != null)
            ? sb.toString()
            : ""));
    }
}
