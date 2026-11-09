import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] buf
            && new int[buf.length / 2 + 4] instanceof int[] out
            && new int[300005] instanceof int[] cs
            && new int[4] instanceof int[] stt
            && IntStream.rangeClosed(0, buf.length).filter(p ->
                !((Integer) (p < buf.length ? (int) buf[p] : 10) instanceof Integer b
                  && (b >= 48 && b <= 57
                      ? (stt[0] = stt[0] * 10 + b - 48) >= 0 && (stt[1] = 1) == 1
                      : b >= 97
                          ? (cs[stt[3]++] = b - 96) >= 0
                          : stt[1] == 0 || ((out[stt[2]++] = stt[0]) >= 0 && (stt[0] = 0) == 0 && (stt[1] = 0) == 0)))).count() == 0
            && (Integer) out[0] instanceof Integer n
            && (Integer) out[2 * n - 1] instanceof Integer q
            && new int[2 * n + 2] instanceof int[] head
            && new int[2 * n + 2] instanceof int[] nxt
            && new int[2 * n + 2] instanceof int[] to
            && IntStream.range(0, n - 1).filter(j ->
                !((to[2 * j + 1] = out[2 + 2 * j]) > 0
                  && (nxt[2 * j + 1] = head[out[1 + 2 * j]]) >= 0
                  && (head[out[1 + 2 * j]] = 2 * j + 1) > 0
                  && (to[2 * j + 2] = out[1 + 2 * j]) > 0
                  && (nxt[2 * j + 2] = head[out[2 + 2 * j]]) >= 0
                  && (head[out[2 + 2 * j]] = 2 * j + 2) > 0)).count() == 0
            && new int[n + 2] instanceof int[] order
            && new int[n + 2] instanceof int[] par
            && new int[n + 2] instanceof int[] dep
            && new int[1] instanceof int[] bq
            && (order[0] = 1) == 1
            && (bq[0] = 1) == 1
            && IntStream.range(0, n).allMatch(qi ->
                (Integer) order[qi] instanceof Integer v
                && IntStream.iterate(head[v], e -> e != 0, e -> nxt[e]).allMatch(e ->
                    to[e] == par[v]
                    || ((par[to[e]] = v) > 0 && (dep[to[e]] = dep[v] + 1) > 0 && (order[bq[0]++] = to[e]) > 0)))
            && new int[n + 2] instanceof int[] sz
            && new int[n + 2] instanceof int[] heavy
            && IntStream.range(0, n + 1).filter(i -> (sz[i] = 1) < 0).count() == 0
            && IntStream.range(1, n).map(z -> n - z).allMatch(qi ->
                (Integer) order[qi] instanceof Integer v
                && (Integer) par[v] instanceof Integer pv
                && (sz[pv] += sz[v]) > 0
                && (heavy[pv] == 0 || sz[v] > sz[heavy[pv]] ? (heavy[pv] = v) > 0 : true))
            && new int[n + 2] instanceof int[] top
            && new int[n + 2] instanceof int[] pos
            && new int[1] instanceof int[] pc
            && IntStream.range(0, n).allMatch(qi ->
                (Integer) order[qi] instanceof Integer v
                && (v == 1 || heavy[par[v]] != v
                    ? IntStream.iterate(v, u -> u != 0, u -> heavy[u]).allMatch(u -> (top[u] = v) > 0 && (pos[u] = pc[0]++) >= 0)
                    : true))
            && new long[n + 1] instanceof long[] pw
            && (pw[0] = 1) == 1
            && ((LongUnaryOperator) r -> r - (2305843009213693951L & ((2305843009213693950L - r) >> 63))) instanceof LongUnaryOperator red
            && ((LongBinaryOperator) (a, b) -> red.applyAsLong((a * b & 2305843009213693951L) + ((a * b >>> 61) | (Math.multiplyHigh(a, b) << 3)))) instanceof LongBinaryOperator mul
            && (Long) ((System.nanoTime() * 0x9E3779B97F4A7C15L >>> 4) % 2305843009213692000L + 500) instanceof Long base
            && IntStream.range(1, n + 1).allMatch(k -> (pw[k] = mul.applyAsLong(pw[k - 1], base)) > 0)
            && new int[n] instanceof int[] tl
            && IntStream.rangeClosed(1, n).allMatch(v -> (tl[pos[v]] = cs[v - 1]) > 0)
            && new long[2 * n + 2] instanceof long[] hh
            && IntStream.range(0, n).allMatch(k ->
                (hh[k + 1] = red.applyAsLong(mul.applyAsLong(hh[k], base) + tl[k])) >= 0
                && (hh[n + 2 + k] = red.applyAsLong(mul.applyAsLong(hh[n + 1 + k], base) + tl[n - 1 - k])) >= 0)
            && new int[32] instanceof int[] S
            && new int[128] instanceof int[] segSt
            && new int[128] instanceof int[] segLen
            && ((IntBinaryOperator) (x0, x1) ->
                ((LongPredicate) d -> d == 0 || d == 2305843009213693951L || d == -2305843009213693951L).test(
                    hh[x0 + S[14]] - mul.applyAsLong(hh[x0], pw[S[14]]) - hh[x1 + S[14]] + mul.applyAsLong(hh[x1], pw[S[14]])) ? 1 : 0) instanceof IntBinaryOperator eq
            && new IntPredicate[3] instanceof IntPredicate[] lp
            && (lp[0] = w ->
                top[S[w * 4]] == top[S[w * 4 + 1]]
                || ((dep[top[S[w * 4]]] >= dep[top[S[w * 4 + 1]]]
                    ? (segSt[w * 64 + S[w * 4 + 2]] = 2 * n - pos[S[w * 4]]) > 0
                      && (segLen[w * 64 + S[w * 4 + 2]] = pos[S[w * 4]] - pos[top[S[w * 4]]] + 1) > 0
                      && (S[w * 4 + 2]++) >= 0
                      && (S[w * 4] = par[top[S[w * 4]]]) > 0
                    : (segSt[w * 64 + 63 - S[w * 4 + 3]] = pos[top[S[w * 4 + 1]]]) >= 0
                      && (segLen[w * 64 + 63 - S[w * 4 + 3]] = pos[S[w * 4 + 1]] - pos[top[S[w * 4 + 1]]] + 1) > 0
                      && (S[w * 4 + 3]++) >= 0
                      && (S[w * 4 + 1] = par[top[S[w * 4 + 1]]]) > 0) && lp[0].test(w))) != null
            && (lp[1] = w ->
                lp[0].test(w)
                && (pos[S[w * 4]] >= pos[S[w * 4 + 1]]
                    ? (segSt[w * 64 + S[w * 4 + 2]] = 2 * n - pos[S[w * 4]]) > 0 && (segLen[w * 64 + S[w * 4 + 2]] = pos[S[w * 4]] - pos[S[w * 4 + 1]] + 1) > 0
                    : (segSt[w * 64 + S[w * 4 + 2]] = pos[S[w * 4]]) >= 0 && (segLen[w * 64 + S[w * 4 + 2]] = pos[S[w * 4 + 1]] - pos[S[w * 4]] + 1) > 0)
                && (S[w * 4 + 2]++) >= 0) != null
            && (lp[2] = it ->
                S[8] >= S[2] + S[3] || S[9] >= S[6] + S[7]
                || ((S[16] = (S[8] < S[2] ? S[8] : 64 - S[3] + S[8] - S[2])) >= 0
                    && (S[17] = (64 + (S[9] < S[6] ? S[9] : 64 - S[7] + S[9] - S[6]))) >= 0
                    && (S[18] = Math.min(segLen[S[16]] - S[10], segLen[S[17]] - S[11])) >= 0
                    && (S[19] = (segSt[S[16]] + S[10])) >= 0
                    && (S[20] = (segSt[S[17]] + S[11])) >= 0
                    && (S[14] = S[18]) == S[18]
                    && (eq.applyAsInt(S[19], S[20]) == 1
                        ? (S[12] += S[18]) >= 0 && (S[10] += S[18]) >= 0 && (S[11] += S[18]) >= 0
                          && (S[10] < segLen[S[16]] || ((S[8]++) >= 0 && (S[10] = 0) == 0))
                          && (S[11] < segLen[S[17]] || ((S[9]++) >= 0 && (S[11] = 0) == 0))
                          && lp[2].test(0)
                        : IntStream.iterate(19, bt -> bt >= 0, bt -> bt - 1).allMatch(bt ->
                              S[13] + (1 << bt) > S[18] - 1
                              || ((S[14] = S[13] + (1 << bt)) > 0 && (eq.applyAsInt(S[19], S[20]) == 0 || (S[13] += 1 << bt) > 0)))
                          && (S[12] += S[13]) >= 0))) != null
            && new StringBuilder() instanceof StringBuilder sbd
            && IntStream.range(0, q).allMatch(qi ->
                (Integer) (2 * n + 4 * qi) instanceof Integer o
                && (S[0] = out[o]) > 0 && (S[1] = out[o + 1]) > 0 && (S[2] = 0) == 0 && (S[3] = 0) == 0
                && (S[4] = out[o + 2]) > 0 && (S[5] = out[o + 3]) > 0 && (S[6] = 0) == 0 && (S[7] = 0) == 0
                && (S[8] = 0) == 0 && (S[9] = 0) == 0 && (S[10] = 0) == 0 && (S[11] = 0) == 0 && (S[12] = 0) == 0 && (S[13] = 0) == 0
                && lp[1].test(0) && lp[1].test(1)
                && lp[2].test(0)
                && sbd.append(S[12]).append((char) 10) != null)
            ? sbd : "");
    }
}
