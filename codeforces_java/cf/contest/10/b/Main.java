import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nk ->
            System.out.println(
                new int[]{nk[1], (nk[1] + 1) / 2} instanceof int[] kc
                && new boolean[kc[0] + 2][kc[0] + 2] instanceof boolean[][] occ
                && new int[kc[0] + 2][kc[0] + 3] instanceof int[][] run
                && IntStream.rangeClosed(0, kc[0]).map(c -> c == 0 ? 0 : Math.abs(c - kc[1])).toArray() instanceof int[] ab
                && new int[kc[0] + 1] instanceof int[] pre
                && IntStream.rangeClosed(1, kc[0]).allMatch(c -> (pre[c] = pre[c - 1] + ab[c]) >= 0)
                && IntStream.rangeClosed(1, kc[0]).allMatch(row -> IntStream.iterate(kc[0], c -> c >= 1, c -> c - 1).allMatch(c -> (run[row][c] = 1 + run[row][c + 1]) > 0))
                && IntStream.range(0, nk[0]).mapToObj(i ->
                        (Integer) s.nextInt() instanceof Integer m
                        && IntStream.rangeClosed(1, kc[0]).mapToObj(row -> IntStream.rangeClosed(1, kc[0] - m + 1).filter(c -> run[row][c] >= m)
                            .mapToLong(c -> ((long) (m * Math.abs(row - kc[1]) + pre[c + m - 1] - pre[c - 1]) << 20) | (row << 10) | c)).flatMapToLong(x -> x).min() instanceof OptionalLong best
                        ? best.isEmpty()
                            ? "-1"
                            : (Integer) (int) ((best.getAsLong() >> 10) & 1023) instanceof Integer row
                                && (Integer) (int) (best.getAsLong() & 1023) instanceof Integer c0
                                && IntStream.range(c0, c0 + m).allMatch(c -> (occ[row][c] = true))
                                && IntStream.iterate(kc[0], c -> c >= 1, c -> c - 1).allMatch(c -> (run[row][c] = occ[row][c] ? 0 : 1 + run[row][c + 1]) >= 0)
                                ? row + " " + c0 + " " + (c0 + m - 1)
                                : "-1"
                        : "-1")
                    .collect(Collectors.joining("\n")) instanceof String out
                ? out
                : "")));
    }
}
