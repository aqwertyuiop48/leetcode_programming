import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt() * 10) instanceof Integer W
            && Integer.valueOf(sc.nextInt() * 10) instanceof Integer H
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> sc.nextInt()).toArray() instanceof int[] wh
            && IntStream.range(0, n).map(i -> BigInteger.valueOf(wh[2 * i]).gcd(BigInteger.valueOf(wh[2 * i + 1])).intValue()).toArray() instanceof int[] gg
            && IntStream.range(0, n).map(i -> wh[2 * i] / gg[i]).toArray() instanceof int[] ga
            && IntStream.range(0, n).map(i -> wh[2 * i + 1] / gg[i]).toArray() instanceof int[] gb
            && IntStream.range(0, n).boxed().sorted((x, y) -> wh[2 * y] * wh[2 * y + 1] - wh[2 * x] * wh[2 * x + 1]).mapToInt(x -> x).toArray() instanceof int[] ordA
            && IntStream.range(0, n).toArray() instanceof int[] ordI
            && new int[n] instanceof int[] px1
            && new int[n] instanceof int[] py1
            && new int[n] instanceof int[] px2
            && new int[n] instanceof int[] py2
            && new int[n] instanceof int[] po
            && new int[4 * n] instanceof int[] rr
            && new int[4 * n] instanceof int[] best
            && new int[4] instanceof int[] st
            && new int[8] instanceof int[] bg
            && new int[5] instanceof int[] cd
            && (st[2] = -1) < 0
            && ((IntPredicate) z -> cd[0] >= 0 && cd[1] >= 0 && cd[2] <= W && cd[3] <= H
                && IntStream.range(0, st[0]).allMatch(j -> cd[2] <= px1[j] || px2[j] <= cd[0] || cd[3] <= py1[j] || py2[j] <= cd[1])) instanceof IntPredicate ok
            && ((IntUnaryOperator) z -> IntStream.range(0, st[0]).map(j ->
                Integer.valueOf(Math.min(cd[2], px2[j]) - Math.max(cd[0], px1[j])) instanceof Integer ox
                && Integer.valueOf(Math.min(cd[3], py2[j]) - Math.max(cd[1], py1[j])) instanceof Integer oy
                ? (po[j] != cd[4] ? 1 : -1) * (ox == 0 && oy > 0 ? oy : oy == 0 && ox > 0 ? ox : 0)
                : 0).sum()) instanceof IntUnaryOperator scr
            && ((IntPredicate) i ->
                (px1[st[0]] = cd[0]) >= 0 && (py1[st[0]] = cd[1]) >= 0 && (px2[st[0]] = cd[2]) >= 0 && (py2[st[0]] = cd[3]) >= 0 && (po[st[0]] = cd[4]) >= 0
                && (rr[4 * i] = cd[0]) >= 0 && (rr[4 * i + 1] = cd[1]) >= 0 && (rr[4 * i + 2] = cd[2]) >= 0 && (rr[4 * i + 3] = cd[3]) >= 0
                && (st[0]++) >= 0) instanceof IntPredicate put
            && ((IntUnaryOperator) v ->
                Integer.valueOf(v & 1) instanceof Integer ordm
                && Double.valueOf(new double[]{0.02, 0.05, 0.1, 0.2}[v >> 1]) instanceof Double frac
                && (ordm == 0 ? ordA : ordI) instanceof int[] order
                && (st[0] = 0) == 0 && (st[1] = 0) == 0
                && IntStream.range(0, 4 * n).allMatch(k -> (rr[k] = -1) < 0)
                && IntStream.range(0, n).allMatch(oi ->
                    Integer.valueOf(order[oi]) instanceof Integer i
                    && Integer.valueOf(gg[i]) instanceof Integer g
                    && (st[0] == 0
                        ? (Integer.valueOf(IntStream.rangeClosed(g, 20 * g).filter(m -> ga[i] * m <= W && gb[i] * m <= H && (double) ga[i] * m * gb[i] * m <= frac * W * H).max().orElse(-1)) instanceof Integer b0
                            && Integer.valueOf(IntStream.rangeClosed(g, 20 * g).filter(m -> gb[i] * m <= W && ga[i] * m <= H && (double) ga[i] * m * gb[i] * m <= frac * W * H).max().orElse(-1)) instanceof Integer b1
                            && (b0 > 0 || b1 > 0
                                ? Integer.valueOf(b0 > 0 ? 0 : 1) instanceof Integer o
                                    && Integer.valueOf(b0 > 0 ? b0 : b1) instanceof Integer m
                                    && (cd[0] = 0) == 0 && (cd[1] = 0) == 0 && (cd[2] = (o == 0 ? ga[i] : gb[i]) * m) > 0 && (cd[3] = (o == 0 ? gb[i] : ga[i]) * m) > 0 && (cd[4] = o) >= 0
                                    && put.test(i)
                                : true))
                        : ((bg[0] = 0) == 0 && (bg[5] = -1) < 0
                            && IntStream.range(0, st[0]).allMatch(j -> IntStream.range(0, 2).allMatch(o ->
                                Integer.valueOf(o == 0 ? ga[i] : gb[i]) instanceof Integer A
                                && Integer.valueOf(o == 0 ? gb[i] : ga[i]) instanceof Integer B
                                && IntStream.range(0, 5).allMatch(si ->
                                    Integer.valueOf(si < 3 ? g + 19 * g * si / 2 : si == 3 ? ((px2[j] - px1[j]) % A == 0 ? (px2[j] - px1[j]) / A : -1) : ((py2[j] - py1[j]) % B == 0 ? (py2[j] - py1[j]) / B : -1)) instanceof Integer m
                                    && (m < g || m > 20 * g
                                        || IntStream.range(0, 8).allMatch(pos ->
                                            Integer.valueOf(A * m) instanceof Integer cw
                                            && Integer.valueOf(B * m) instanceof Integer ch
                                            && (cd[0] = pos < 4 ? ((pos & 1) == 0 ? px1[j] : px2[j] - cw) : (pos < 6 ? px2[j] : px1[j] - cw)) > -1000000
                                            && (cd[1] = pos < 2 ? py2[j] : pos < 4 ? py1[j] - ch : ((pos & 1) == 0 ? py1[j] : py2[j] - ch)) > -1000000
                                            && (cd[2] = cd[0] + cw) > -1000000 && (cd[3] = cd[1] + ch) > -1000000 && (cd[4] = o) >= 0
                                            && (!ok.test(0)
                                                || (Integer.valueOf(scr.applyAsInt(0)) instanceof Integer gain
                                                    && (!(gain > bg[0] || (gain == bg[0] && gain > 0 && bg[5] >= 0 && cw * ch > (bg[3] - bg[1]) * (bg[4] - bg[2])))
                                                        || ((bg[0] = gain) >= 0 && (bg[1] = cd[0]) > -1000000 && (bg[2] = cd[1]) > -1000000 && (bg[3] = cd[2]) > -1000000 && (bg[4] = cd[3]) > -1000000 && (bg[5] = o) >= 0)))))))))
                            && (bg[5] < 0 || bg[0] <= 0
                                || ((cd[0] = bg[1]) > -1000000 && (cd[1] = bg[2]) > -1000000 && (cd[2] = bg[3]) > -1000000 && (cd[3] = bg[4]) > -1000000 && (cd[4] = bg[5]) >= 0
                                    && put.test(i) && (st[1] += bg[0]) > 0)))))
                ? st[1] : -1) instanceof IntUnaryOperator run
            && new long[]{System.nanoTime()} instanceof long[] t0
            && IntStream.range(0, 8).takeWhile(v -> v == 0 || System.nanoTime() - t0[0] < 1800000000L).allMatch(v ->
                Integer.valueOf(run.applyAsInt(v)) instanceof Integer res
                && (res <= st[2] || ((st[2] = res) >= 0 && IntStream.range(0, 4 * n).allMatch(k -> (best[k] = rr[k]) != -2))))
            && IntStream.range(0, n).mapToObj(i -> best[4 * i] < 0 ? "-1 -1 -1 -1"
                : best[4 * i] / 10 + "." + best[4 * i] % 10 + " " + best[4 * i + 1] / 10 + "." + best[4 * i + 1] % 10 + " " + best[4 * i + 2] / 10 + "." + best[4 * i + 2] % 10 + " " + best[4 * i + 3] / 10 + "." + best[4 * i + 3] % 10).collect(Collectors.joining("\n")) instanceof String out
            ? out : "");
    }
}

