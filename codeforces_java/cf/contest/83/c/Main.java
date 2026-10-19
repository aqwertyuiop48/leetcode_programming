import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().getAsInt()) instanceof Integer nl
            && Arrays.stream(new String(raw, 0, nl).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && Integer.valueOf(h[0]) instanceof Integer n
            && Integer.valueOf(h[1]) instanceof Integer m
            && Integer.valueOf(h[2]) instanceof Integer k
            && Integer.valueOf(m + 2) instanceof Integer W
            && Integer.valueOf((n + 2) * W) instanceof Integer N
            && IntStream.range(nl, raw.length).filter(i -> raw[i] == 'S' || raw[i] == 'T' || raw[i] >= 'a' && raw[i] <= 'z').map(i -> raw[i]).toArray() instanceof int[] ch
            && new int[N] instanceof int[] code
            && IntStream.range(0, N).filter(i -> (code[i] = 28) < 0).count() >= 0
            && IntStream.range(0, n * m).filter(p -> (code[(p / m + 1) * W + p % m + 1] = ch[p] == 'S' ? 26 : ch[p] == 'T' ? 27 : ch[p] - 'a') < 0).count() >= 0
            && Integer.valueOf(IntStream.range(0, N).filter(i -> code[i] == 26).findFirst().getAsInt()) instanceof Integer S
            && Integer.valueOf(IntStream.range(0, N).filter(i -> code[i] == 27).findFirst().getAsInt()) instanceof Integer T
            && Integer.valueOf(IntStream.range(0, N).filter(i -> code[i] < 26).map(i -> 1 << code[i]).reduce(0, (x, y) -> x | y)) instanceof Integer present
            && Integer.valueOf(Integer.bitCount(present)) instanceof Integer P
            && Integer.valueOf(Math.min(k, P)) instanceof Integer kk
            && (kk == 0 ? new int[]{0}
                : IntStream.iterate((1 << kk) - 1, x -> x < 1 << P, x -> (((x + (x & -x)) ^ x) >>> 2) / (x & -x) | (x + (x & -x)))
                    .map(x -> Integer.expand(x, present)).toArray()) instanceof int[] masks
            && new int[N] instanceof int[] d
            && new int[N] instanceof int[] q
            && new int[N] instanceof int[] mark
            && new int[2][N] instanceof int[][] fr
            && new int[2] instanceof int[] fc
            && new int[1] instanceof int[] qn
            && new int[1] instanceof int[] mn
            && new int[1] instanceof int[] cmp
            && new int[]{Integer.MAX_VALUE} instanceof int[] bl
            && new int[8] instanceof int[] sc
            && new byte[N] instanceof byte[] cand
            && new byte[N] instanceof byte[] best
            && ((IntPredicate) v -> d[v] < sc[0] && (sc[1] >> code[v] & 1) == 1 && (d[v] = d[sc[2]] + 1) > 0 && (q[qn[0]++] = v) > 0) instanceof IntPredicate relax
            && ((IntPredicate) v -> d[v] == sc[4] && code[v] < mn[0] && (mn[0] = code[v]) >= 0) instanceof IntPredicate lower
            && ((IntPredicate) v -> d[v] == sc[4] && code[v] == mn[0] && mark[v] != sc[3] && (mark[v] = sc[3]) > 0
                && (fr[sc[5]][fc[sc[5]]++] = v) > 0) instanceof IntPredicate push
            && (sc[3] = 1) > 0
            && IntStream.range(0, masks.length).filter(j ->
                Integer.valueOf((j + 1) << 12) instanceof Integer base
                && (sc[0] = base) > 0
                && (sc[1] = masks[j] | 1 << 26) > 0
                && (q[0] = T) > 0
                && (qn[0] = 1) > 0
                && (d[T] = base) > 0
                && IntStream.range(0, N).filter(i -> i < qn[0] && d[S] < base && (sc[2] = q[i]) > 0
                    && (relax.test(sc[2] - 1) | relax.test(sc[2] + 1) | relax.test(sc[2] - W) | relax.test(sc[2] + W)) && false).count() >= 0
                && d[S] >= base
                && Integer.valueOf(d[S] - base) instanceof Integer len
                && len - 1 <= bl[0]
                && (cmp[0] = len - 1 < bl[0] ? -1 : 0) > -5
                && (fr[0][0] = S) > 0
                && (fc[0] = 1) > 0
                && IntStream.range(1, len).filter(s -> cmp[0] <= 0
                    && (sc[4] = base + len - s) > 0
                    && (mn[0] = 99) > 0
                    && (sc[5] = s & 1) >= 0
                    && (fc[s & 1] = 0) == 0
                    && ++sc[3] > 0
                    && IntStream.range(0, fc[(s - 1) & 1]).filter(f -> (sc[2] = fr[(s - 1) & 1][f]) > 0
                        && (lower.test(sc[2] - 1) | lower.test(sc[2] + 1) | lower.test(sc[2] - W) | lower.test(sc[2] + W)) && false).count() >= 0
                    && (cand[s - 1] = (byte) ('a' + mn[0])) > 0
                    && (cmp[0] = cmp[0] != 0 ? cmp[0] : Integer.compare(cand[s - 1], best[s - 1])) > -5
                    && (cmp[0] > 0 || IntStream.range(0, fc[(s - 1) & 1]).filter(f -> (sc[2] = fr[(s - 1) & 1][f]) > 0
                        && (push.test(sc[2] - 1) | push.test(sc[2] + 1) | push.test(sc[2] - W) | push.test(sc[2] + W)) && false).count() >= 0)
                    && false).count() >= 0
                && cmp[0] < 0
                && IntStream.range(0, len - 1).filter(i -> (best[i] = cand[i]) < 0).count() >= 0
                && (bl[0] = len - 1) > -5
                && false).count() >= 0
            ? bl[0] == Integer.MAX_VALUE ? "-1" : new String(best, 0, bl[0]) : "");
    }
}
