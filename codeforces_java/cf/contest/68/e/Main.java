import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in).tokens().mapToInt(Integer::parseInt).toArray() instanceof int[] c
            && IntStream.range(0, 12).mapToDouble(e -> Math.sqrt(
                Math.pow(c[6 * (e / 3) + 2 * (e % 3 == 1 ? 1 : 0)] - c[6 * (e / 3) + 2 * (e % 3 == 0 ? 1 : 2)], 2)
                + Math.pow(c[6 * (e / 3) + 2 * (e % 3 == 1 ? 1 : 0) + 1] - c[6 * (e / 3) + 2 * (e % 3 == 0 ? 1 : 2) + 1], 2))).toArray() instanceof double[] L
            && new int[12] instanceof int[] grp
            && new int[13] instanceof int[] ngs
            && new int[]{9} instanceof int[] best
            && new int[12] instanceof int[] gc
            && ((IntBinaryOperator) (tri, ng) ->
                IntStream.range(0, ng).map(g -> gc[g] >= 2 ? (int) IntStream.range(0, g).filter(h -> gc[h] >= 2).count() : -1).toArray() instanceof int[] sg
                && IntStream.range(0, 3 * tri).map(v -> sg[grp[v]]).toArray() instanceof int[] sid
                && Integer.valueOf((int) IntStream.range(0, ng).filter(g -> gc[g] >= 2).count()) instanceof Integer n
                && (n < 2
                    || (new double[36] instanceof double[] lo
                        && DoubleStream.generate(() -> 1e18).limit(36).toArray() instanceof double[] hi
                        && IntStream.range(0, 3 * tri).allMatch(e ->
                            Integer.valueOf(sid[3 * (e / 3) + (e % 3 == 1 ? 1 : 0)]) instanceof Integer a
                            && Integer.valueOf(sid[3 * (e / 3) + (e % 3 == 0 ? 1 : 2)]) instanceof Integer b
                            && (a < 0 || b < 0
                                || (Math.max(lo[6 * a + b], L[e]) <= Math.min(hi[6 * a + b], L[e]) + 1e-7
                                    && (lo[6 * a + b] = lo[6 * b + a] = Math.max(lo[6 * a + b], L[e])) >= 0
                                    && (hi[6 * a + b] = hi[6 * b + a] = Math.min(hi[6 * a + b], L[e])) >= 0)))
                        && new boolean[6] instanceof boolean[] alive
                        && IntStream.range(0, n).allMatch(y -> (alive[y] = true))
                        && IntStream.range(0, n).allMatch(it ->
                            Integer.valueOf(IntStream.range(0, n).filter(y -> alive[y]
                                && IntStream.range(0, n).filter(z -> z != y && alive[z] && hi[6 * y + z] < 1e17).count() <= 2).findFirst().orElse(-1)) instanceof Integer x
                            && (x < 0
                                || (IntStream.range(0, n).filter(z -> z != x && alive[z] && hi[6 * x + z] < 1e17).toArray() instanceof int[] nb
                                    && (nb.length < 2
                                        || (Double.valueOf(Math.max(0, Math.max(lo[6 * x + nb[0]] - hi[6 * x + nb[1]], lo[6 * x + nb[1]] - hi[6 * x + nb[0]]))) instanceof Double nl
                                            && Double.valueOf(hi[6 * x + nb[0]] + hi[6 * x + nb[1]]) instanceof Double nh
                                            && Math.max(lo[6 * nb[0] + nb[1]], nl) <= Math.min(hi[6 * nb[0] + nb[1]], nh) + 1e-7
                                            && (lo[6 * nb[0] + nb[1]] = lo[6 * nb[1] + nb[0]] = Math.max(lo[6 * nb[0] + nb[1]], nl)) >= 0
                                            && (hi[6 * nb[0] + nb[1]] = hi[6 * nb[1] + nb[0]] = Math.min(hi[6 * nb[0] + nb[1]], nh)) >= 0))
                                    && !(alive[x] = false))))
                        && (IntStream.range(0, n).noneMatch(y -> alive[y])
                            || (Integer.valueOf(IntStream.range(0, n).filter(y -> alive[y]).findFirst().getAsInt()) instanceof Integer f0
                                && Integer.valueOf(IntStream.range(0, n).filter(y -> y != f0 && alive[y] && hi[6 * f0 + y] < 1e17 && hi[6 * f0 + y] - lo[6 * f0 + y] < 1e-7).findFirst().orElse(-1)) instanceof Integer s0
                                && (s0 < 0
                                    || (new double[6] instanceof double[] px
                                        && new double[6] instanceof double[] py
                                        && new boolean[6] instanceof boolean[] pl
                                        && (pl[f0] = true)
                                        && (pl[s0] = true)
                                        && (px[s0] = hi[6 * f0 + s0]) > 0
                                        && new IntPredicate[1] instanceof IntPredicate[] tr
                                        && (tr[0] = left -> left == 0
                                            ? IntStream.range(0, n * n).filter(q -> q / n < q % n && alive[q / n] && alive[q % n] && hi[6 * (q / n) + q % n] < 1e17).allMatch(q ->
                                                Double.valueOf(Math.hypot(px[q / n] - px[q % n], py[q / n] - py[q % n])) instanceof Double dd
                                                && dd >= lo[6 * (q / n) + q % n] - 1e-6 && dd <= hi[6 * (q / n) + q % n] + 1e-6)
                                            : Integer.valueOf(IntStream.range(0, n).filter(w -> alive[w] && !pl[w]
                                                && IntStream.range(0, n).filter(y -> pl[y] && alive[y] && hi[6 * w + y] < 1e17 && hi[6 * w + y] - lo[6 * w + y] < 1e-7).count() >= 2).findFirst().orElse(-1)) instanceof Integer w
                                            && (w < 0
                                                || (IntStream.range(0, n).filter(y -> pl[y] && alive[y] && hi[6 * w + y] < 1e17 && hi[6 * w + y] - lo[6 * w + y] < 1e-7).toArray() instanceof int[] nbs
                                                    && Integer.valueOf(nbs[0]) instanceof Integer a
                                                    && Integer.valueOf(nbs[1]) instanceof Integer b
                                                    && Double.valueOf(Math.hypot(px[b] - px[a], py[b] - py[a])) instanceof Double D
                                                    && (D < 1e-9 ? Math.abs(hi[6 * w + a] - hi[6 * w + b]) < 1e-6
                                                        : (Double.valueOf((hi[6 * w + a] * hi[6 * w + a] - hi[6 * w + b] * hi[6 * w + b] + D * D) / (2 * D)) instanceof Double t
                                                            && Double.valueOf(hi[6 * w + a] * hi[6 * w + a] - t * t) instanceof Double h2
                                                            && h2 >= -1e-6
                                                            && Double.valueOf(Math.sqrt(Math.max(0, h2))) instanceof Double h
                                                            && (pl[w] = true)
                                                            && Boolean.valueOf(IntStream.of(-1, 1).filter(s -> s < 0 || h >= 1e-9).anyMatch(s ->
                                                                (px[w] = px[a] + t * (px[b] - px[a]) / D - s * h * (py[b] - py[a]) / D) > -1e9
                                                                && (py[w] = py[a] + t * (py[b] - py[a]) / D + s * h * (px[b] - px[a]) / D) > -1e9
                                                                && tr[0].test(left - 1))) instanceof Boolean ok
                                                            && !(pl[w] = false)
                                                            && ok))))) != null
                                        && tr[0].test((int) IntStream.range(0, n).filter(y -> alive[y]).count() - 2)))))))
                ? 1 : 0) instanceof IntBinaryOperator feas
            && new IntPredicate[1] instanceof IntPredicate[] dfs
            && (dfs[0] = v -> ngs[v] >= best[0]
                || (v == 12
                    ? (best[0] = ngs[v]) < 0
                    : IntStream.rangeClosed(0, ngs[v]).filter(g ->
                        IntStream.range(3 * (v / 3), v).noneMatch(u -> grp[u] == g)
                        && (g == ngs[v] || v % 3 == 0 || IntStream.range(3 * (v / 3), v).allMatch(v2 -> IntStream.range(0, 3 * (v / 3)).filter(u1 -> grp[u1] == g).allMatch(u1 -> IntStream.range(0, 3 * (v / 3)).filter(u2 -> u2 / 3 == u1 / 3 && u2 != u1 && grp[u2] == grp[v2]).allMatch(u2 ->
                            Math.abs(L[3 * (v / 3) + (v % 3 + v2 % 3 == 1 ? 0 : v % 3 + v2 % 3 == 3 ? 1 : 2)] - L[3 * (u1 / 3) + (u1 % 3 + u2 % 3 == 1 ? 0 : u1 % 3 + u2 % 3 == 3 ? 1 : 2)]) < 1e-9))))
                        && (grp[v] = g) >= 0
                        && (ngs[v + 1] = Math.max(ngs[v], g + 1)) > 0
                        && ngs[v + 1] < best[0] && (gc[g]++ >= 0)
                        && ((((v != 8 && v != 11) || (v == 8 && ngs[v + 1] > 6) || feas.applyAsInt(v / 3 + 1, ngs[v + 1]) > 0) && dfs[0].test(v + 1)) | gc[g]-- < 0)).count() < 0)) != null
            && (dfs[0].test(0) || true)
            ? best[0]
            : -1);
    }


}

