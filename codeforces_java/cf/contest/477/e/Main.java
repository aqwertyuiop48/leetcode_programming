import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(2 * n + 3) instanceof Integer N
            && IntStream.range(0, N).map(i -> i == 0 || i == n + 1 || i == N - 1 ? -1 : i <= n ? g0[i] : g0[2 * n + 2 - i]).toArray() instanceof int[] X
            && new int[18][] instanceof int[][] sp
            && (sp[0] = X) != null
            && IntStream.range(1, 18).allMatch(t -> (sp[t] = IntStream.range(0, N).map(i ->
                i + (1 << t) <= N ? Math.min(sp[t - 1][i], sp[t - 1][i + (1 << (t - 1))]) : 1000000000).toArray()) != null)
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> rd
            && rd.getAndSet((pk, Y) -> (int) (pk >> 20) < 0 ? pk & 1048575L
                : (int) (pk & 1048575L) - (1 << (int) (pk >> 20)) + 1 >= 0 && sp[(int) (pk >> 20)][(int) (pk & 1048575L) - (1 << (int) (pk >> 20)) + 1] >= Y
                    ? rd.get().applyAsLong(((pk >> 20) - 1 << 20) | ((pk & 1048575L) - (1L << (int) (pk >> 20))), Y)
                    : rd.get().applyAsLong(((pk >> 20) - 1 << 20) | (pk & 1048575L), Y)) == null
            && ((IntBinaryOperator) ((pos0, Y) -> (int) rd.get().applyAsLong((17L << 20) | pos0, Y))) instanceof IntBinaryOperator pl
            && ((IntBinaryOperator) ((l, r) -> Math.min(sp[31 - Integer.numberOfLeadingZeros(r - l + 1)][l],
                sp[31 - Integer.numberOfLeadingZeros(r - l + 1)][r - (1 << (31 - Integer.numberOfLeadingZeros(r - l + 1))) + 1]))) instanceof IntBinaryOperator rmq
            && new int[18][] instanceof int[][] upL
            && new int[18][] instanceof int[][] mnL
            && (upL[0] = IntStream.range(0, N).map(i -> X[i] < 0 ? 0 : pl.applyAsInt(i - 1, X[i])).toArray()) != null
            && (mnL[0] = IntStream.range(0, N).map(i -> X[i] < 0 ? 1000000000 : X[i] - 2 * i).toArray()) != null
            && IntStream.range(1, 18).allMatch(t -> (upL[t] = IntStream.range(0, N).map(i -> upL[t - 1][upL[t - 1][i]]).toArray()) != null
                && (mnL[t] = IntStream.range(0, N).map(i -> Math.min(mnL[t - 1][i], mnL[t - 1][upL[t - 1][i]])).toArray()) != null)
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> lf
            && lf.getAndSet((pk, res) -> (int) (pk >> 40) < 0 ? Math.min(res, mnL[0][(int) (pk & 1048575L)])
                : upL[(int) (pk >> 40)][(int) (pk & 1048575L)] > (int) ((pk >> 20) & 1048575L)
                    ? lf.get().applyAsLong(((pk >> 40) - 1 << 40) | ((long) upL[(int) (pk >> 40)][(int) (pk & 1048575L)])
                        | (((pk >> 20) & 1048575L) << 20), Math.min(res, mnL[(int) (pk >> 40)][(int) (pk & 1048575L)]))
                    : lf.get().applyAsLong(((pk >> 40) - 1 << 40) | (pk & 1099511627775L), res)) == null
            && ((ToIntFunction<int[]>) (v -> (Integer) pl.applyAsInt(v[0] - 1, v[1]) instanceof Integer j1 && X[j1] >= 0
                ? v[1] <= v[3] ? 2 * (v[0] - j1) + v[2] + v[3] - X[j1]
                    : (Integer) pl.applyAsInt(v[0] - 1, v[3]) instanceof Integer jc
                        ? Math.min(X[jc] >= 0 ? 2 * (v[0] - jc) + v[2] + v[3] - X[jc] : 1000000000,
                            j1 > jc ? 2 * v[0] + (int) lf.get().applyAsLong((17L << 40) | ((long) jc << 20) | j1, 1000000000) + v[2] - v[3] : 1000000000)
                        : 1000000000
                : 1000000000)) instanceof ToIntFunction<int[]> ld
            && Integer.valueOf(g0[n + 1]) instanceof Integer qn
            ? IntStream.range(0, qn).mapToObj(t -> (Integer) (g0[n + 2 + 4 * t] <= g0[n + 4 + 4 * t] ? g0[n + 2 + 4 * t] : N - 1 - g0[n + 2 + 4 * t]) instanceof Integer p1
                && (Integer) (g0[n + 2 + 4 * t] <= g0[n + 4 + 4 * t] ? g0[n + 4 + 4 * t] : N - 1 - g0[n + 4 + 4 * t]) instanceof Integer p2
                && (Integer) g0[n + 3 + 4 * t] instanceof Integer c1
                && (Integer) g0[n + 5 + 4 * t] instanceof Integer c2
                && (Integer) (p2 - p1) instanceof Integer d
                && (Integer) rmq.applyAsInt(p1, p2) instanceof Integer m0
                && (Integer) Math.min(c1, m0) instanceof Integer yc
                && (Integer) (N - 1 - p2) instanceof Integer rho
                && (Integer) pl.applyAsInt(p2, c2 + 1) instanceof Integer pp
                && (Integer) IntStream.of(
                    d + 1 + Math.min(c2, X[p2] - c2),
                    d + Math.abs(yc - c2),
                    d + 1 + Math.abs(m0 - c2),
                    pp >= p1 ? d + 1 + Math.abs(X[pp] - c2) : 1000000000,
                    pp >= p1 && pp + 1 <= p2 ? d + 1 + Math.abs(rmq.applyAsInt(pp + 1, p2) - c2) : 1000000000).min().getAsInt() instanceof Integer base
                ? String.valueOf(Math.min(base, IntStream.of(
                    base <= d + 2 ? 1000000000 : d + ld.applyAsInt(new int[] {p1, yc, 0, c2}),
                    base <= d + 3 ? 1000000000 : d + ld.applyAsInt(new int[] {p1, m0, 1, c2}),
                    base <= d + 2 ? 1000000000 : d + ld.applyAsInt(new int[] {rho, yc, 0, c2}),
                    base <= d + 3 ? 1000000000 : d + ld.applyAsInt(new int[] {rho, m0, 1, c2}),
                    base <= d + 3 ? 1000000000 : d + ld.applyAsInt(new int[] {rho, X[p2], 1, c2})).min().getAsInt()))
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}
