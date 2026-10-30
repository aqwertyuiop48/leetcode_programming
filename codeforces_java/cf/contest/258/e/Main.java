import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new long[3] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = (int) pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
            && Arrays.stream(vals, 0, (int) pr[1]).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(it.nextInt()) instanceof Integer a && Integer.valueOf(it.nextInt()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[m + 1] instanceof int[] oa && new int[m + 1] instanceof int[] ob && new int[n + 1] instanceof int[] oh && new int[2 * m + 2] instanceof int[] on
            && IntStream.rangeClosed(0, n).allMatch(i -> (oh[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (oa[i] = it.nextInt()) > 0 && (ob[i] = it.nextInt()) > 0 && (on[2 * i] = oh[oa[i]]) >= -1 && (oh[oa[i]] = 2 * i) >= 0 && (on[2 * i + 1] = oh[ob[i]]) >= -1 && (oh[ob[i]] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] tout && new int[n + 1] instanceof int[] order && head.clone() instanceof int[] ptr
            && new int[]{1, 1} instanceof int[] sp && (order[0] = 1) == 1 && (tin[1] = 0) == 0 && new int[n + 1] instanceof int[] stk && (stk[0] = 1) == 1
            && IntStream.iterate(0, z -> sp[0] > 0, z -> z + 1).allMatch(z -> Integer.valueOf(stk[sp[0] - 1]) instanceof Integer top
                && (ptr[top] >= 0 ? Integer.valueOf(to[ptr[top]]) instanceof Integer c && (ptr[top] = nxt[ptr[top]]) >= -1
                        && (c == par[top] || (par[c] = top) > 0 && (tin[c] = sp[1]++) > 0 && (order[tin[c]] = c) > 0 && (stk[sp[0]++] = c) > 0)
                    : (tout[top] = sp[1] - 1) >= 0 && --sp[0] >= 0))
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * n - 1))) instanceof Integer N
            && new int[2 * N] instanceof int[] cv && new int[2 * N] instanceof int[] len && new int[2 * N] instanceof int[] sz
            && IntStream.iterate(2 * N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (sz[i] = i >= N ? 1 : 2 * sz[2 * i]) > 0)
            && ((IntPredicate) i -> (len[i] = cv[i] > 0 ? sz[i] : i >= N ? 0 : len[2 * i] + len[2 * i + 1]) >= 0) instanceof IntPredicate pull
            && ((ToIntFunction<int[]>) a -> Integer.valueOf(a[0] + N) instanceof Integer l0 && Integer.valueOf(a[1] + 1 + N) instanceof Integer r0 && Integer.valueOf(a[2]) instanceof Integer d
                && ((l0) >= (r0) || ((l0 & 1) == 0 || (cv[l0] += d) > -10000000 && pull.test(l0)) && ((r0 & 1) == 0 || (cv[r0 - 1] += d) > -10000000 && pull.test(r0 - 1)))
                && (((l0 + 1 >> 1)) >= ((r0 >> 1)) || (((l0 + 1 >> 1) & 1) == 0 || (cv[(l0 + 1 >> 1)] += d) > -10000000 && pull.test((l0 + 1 >> 1))) && (((r0 >> 1) & 1) == 0 || (cv[(r0 >> 1) - 1] += d) > -10000000 && pull.test((r0 >> 1) - 1)))
                && (((l0 + 3 >> 2)) >= ((r0 >> 2)) || (((l0 + 3 >> 2) & 1) == 0 || (cv[(l0 + 3 >> 2)] += d) > -10000000 && pull.test((l0 + 3 >> 2))) && (((r0 >> 2) & 1) == 0 || (cv[(r0 >> 2) - 1] += d) > -10000000 && pull.test((r0 >> 2) - 1)))
                && (((l0 + 7 >> 3)) >= ((r0 >> 3)) || (((l0 + 7 >> 3) & 1) == 0 || (cv[(l0 + 7 >> 3)] += d) > -10000000 && pull.test((l0 + 7 >> 3))) && (((r0 >> 3) & 1) == 0 || (cv[(r0 >> 3) - 1] += d) > -10000000 && pull.test((r0 >> 3) - 1)))
                && (((l0 + 15 >> 4)) >= ((r0 >> 4)) || (((l0 + 15 >> 4) & 1) == 0 || (cv[(l0 + 15 >> 4)] += d) > -10000000 && pull.test((l0 + 15 >> 4))) && (((r0 >> 4) & 1) == 0 || (cv[(r0 >> 4) - 1] += d) > -10000000 && pull.test((r0 >> 4) - 1)))
                && (((l0 + 31 >> 5)) >= ((r0 >> 5)) || (((l0 + 31 >> 5) & 1) == 0 || (cv[(l0 + 31 >> 5)] += d) > -10000000 && pull.test((l0 + 31 >> 5))) && (((r0 >> 5) & 1) == 0 || (cv[(r0 >> 5) - 1] += d) > -10000000 && pull.test((r0 >> 5) - 1)))
                && (((l0 + 63 >> 6)) >= ((r0 >> 6)) || (((l0 + 63 >> 6) & 1) == 0 || (cv[(l0 + 63 >> 6)] += d) > -10000000 && pull.test((l0 + 63 >> 6))) && (((r0 >> 6) & 1) == 0 || (cv[(r0 >> 6) - 1] += d) > -10000000 && pull.test((r0 >> 6) - 1)))
                && (((l0 + 127 >> 7)) >= ((r0 >> 7)) || (((l0 + 127 >> 7) & 1) == 0 || (cv[(l0 + 127 >> 7)] += d) > -10000000 && pull.test((l0 + 127 >> 7))) && (((r0 >> 7) & 1) == 0 || (cv[(r0 >> 7) - 1] += d) > -10000000 && pull.test((r0 >> 7) - 1)))
                && (((l0 + 255 >> 8)) >= ((r0 >> 8)) || (((l0 + 255 >> 8) & 1) == 0 || (cv[(l0 + 255 >> 8)] += d) > -10000000 && pull.test((l0 + 255 >> 8))) && (((r0 >> 8) & 1) == 0 || (cv[(r0 >> 8) - 1] += d) > -10000000 && pull.test((r0 >> 8) - 1)))
                && (((l0 + 511 >> 9)) >= ((r0 >> 9)) || (((l0 + 511 >> 9) & 1) == 0 || (cv[(l0 + 511 >> 9)] += d) > -10000000 && pull.test((l0 + 511 >> 9))) && (((r0 >> 9) & 1) == 0 || (cv[(r0 >> 9) - 1] += d) > -10000000 && pull.test((r0 >> 9) - 1)))
                && (((l0 + 1023 >> 10)) >= ((r0 >> 10)) || (((l0 + 1023 >> 10) & 1) == 0 || (cv[(l0 + 1023 >> 10)] += d) > -10000000 && pull.test((l0 + 1023 >> 10))) && (((r0 >> 10) & 1) == 0 || (cv[(r0 >> 10) - 1] += d) > -10000000 && pull.test((r0 >> 10) - 1)))
                && (((l0 + 2047 >> 11)) >= ((r0 >> 11)) || (((l0 + 2047 >> 11) & 1) == 0 || (cv[(l0 + 2047 >> 11)] += d) > -10000000 && pull.test((l0 + 2047 >> 11))) && (((r0 >> 11) & 1) == 0 || (cv[(r0 >> 11) - 1] += d) > -10000000 && pull.test((r0 >> 11) - 1)))
                && (((l0 + 4095 >> 12)) >= ((r0 >> 12)) || (((l0 + 4095 >> 12) & 1) == 0 || (cv[(l0 + 4095 >> 12)] += d) > -10000000 && pull.test((l0 + 4095 >> 12))) && (((r0 >> 12) & 1) == 0 || (cv[(r0 >> 12) - 1] += d) > -10000000 && pull.test((r0 >> 12) - 1)))
                && (((l0 + 8191 >> 13)) >= ((r0 >> 13)) || (((l0 + 8191 >> 13) & 1) == 0 || (cv[(l0 + 8191 >> 13)] += d) > -10000000 && pull.test((l0 + 8191 >> 13))) && (((r0 >> 13) & 1) == 0 || (cv[(r0 >> 13) - 1] += d) > -10000000 && pull.test((r0 >> 13) - 1)))
                && (((l0 + 16383 >> 14)) >= ((r0 >> 14)) || (((l0 + 16383 >> 14) & 1) == 0 || (cv[(l0 + 16383 >> 14)] += d) > -10000000 && pull.test((l0 + 16383 >> 14))) && (((r0 >> 14) & 1) == 0 || (cv[(r0 >> 14) - 1] += d) > -10000000 && pull.test((r0 >> 14) - 1)))
                && (((l0 + 32767 >> 15)) >= ((r0 >> 15)) || (((l0 + 32767 >> 15) & 1) == 0 || (cv[(l0 + 32767 >> 15)] += d) > -10000000 && pull.test((l0 + 32767 >> 15))) && (((r0 >> 15) & 1) == 0 || (cv[(r0 >> 15) - 1] += d) > -10000000 && pull.test((r0 >> 15) - 1)))
                && (((l0 + 65535 >> 16)) >= ((r0 >> 16)) || (((l0 + 65535 >> 16) & 1) == 0 || (cv[(l0 + 65535 >> 16)] += d) > -10000000 && pull.test((l0 + 65535 >> 16))) && (((r0 >> 16) & 1) == 0 || (cv[(r0 >> 16) - 1] += d) > -10000000 && pull.test((r0 >> 16) - 1)))
                && (((l0 + 131071 >> 17)) >= ((r0 >> 17)) || (((l0 + 131071 >> 17) & 1) == 0 || (cv[(l0 + 131071 >> 17)] += d) > -10000000 && pull.test((l0 + 131071 >> 17))) && (((r0 >> 17) & 1) == 0 || (cv[(r0 >> 17) - 1] += d) > -10000000 && pull.test((r0 >> 17) - 1)))
                && ((l0 >> 1) < 1 || pull.test(l0 >> 1))
                && ((r0 - 1 >> 1) < 1 || (r0 - 1 >> 1) == (l0 >> 1) || pull.test(r0 - 1 >> 1))
                && ((l0 >> 2) < 1 || pull.test(l0 >> 2))
                && ((r0 - 1 >> 2) < 1 || (r0 - 1 >> 2) == (l0 >> 2) || pull.test(r0 - 1 >> 2))
                && ((l0 >> 3) < 1 || pull.test(l0 >> 3))
                && ((r0 - 1 >> 3) < 1 || (r0 - 1 >> 3) == (l0 >> 3) || pull.test(r0 - 1 >> 3))
                && ((l0 >> 4) < 1 || pull.test(l0 >> 4))
                && ((r0 - 1 >> 4) < 1 || (r0 - 1 >> 4) == (l0 >> 4) || pull.test(r0 - 1 >> 4))
                && ((l0 >> 5) < 1 || pull.test(l0 >> 5))
                && ((r0 - 1 >> 5) < 1 || (r0 - 1 >> 5) == (l0 >> 5) || pull.test(r0 - 1 >> 5))
                && ((l0 >> 6) < 1 || pull.test(l0 >> 6))
                && ((r0 - 1 >> 6) < 1 || (r0 - 1 >> 6) == (l0 >> 6) || pull.test(r0 - 1 >> 6))
                && ((l0 >> 7) < 1 || pull.test(l0 >> 7))
                && ((r0 - 1 >> 7) < 1 || (r0 - 1 >> 7) == (l0 >> 7) || pull.test(r0 - 1 >> 7))
                && ((l0 >> 8) < 1 || pull.test(l0 >> 8))
                && ((r0 - 1 >> 8) < 1 || (r0 - 1 >> 8) == (l0 >> 8) || pull.test(r0 - 1 >> 8))
                && ((l0 >> 9) < 1 || pull.test(l0 >> 9))
                && ((r0 - 1 >> 9) < 1 || (r0 - 1 >> 9) == (l0 >> 9) || pull.test(r0 - 1 >> 9))
                && ((l0 >> 10) < 1 || pull.test(l0 >> 10))
                && ((r0 - 1 >> 10) < 1 || (r0 - 1 >> 10) == (l0 >> 10) || pull.test(r0 - 1 >> 10))
                && ((l0 >> 11) < 1 || pull.test(l0 >> 11))
                && ((r0 - 1 >> 11) < 1 || (r0 - 1 >> 11) == (l0 >> 11) || pull.test(r0 - 1 >> 11))
                && ((l0 >> 12) < 1 || pull.test(l0 >> 12))
                && ((r0 - 1 >> 12) < 1 || (r0 - 1 >> 12) == (l0 >> 12) || pull.test(r0 - 1 >> 12))
                && ((l0 >> 13) < 1 || pull.test(l0 >> 13))
                && ((r0 - 1 >> 13) < 1 || (r0 - 1 >> 13) == (l0 >> 13) || pull.test(r0 - 1 >> 13))
                && ((l0 >> 14) < 1 || pull.test(l0 >> 14))
                && ((r0 - 1 >> 14) < 1 || (r0 - 1 >> 14) == (l0 >> 14) || pull.test(r0 - 1 >> 14))
                && ((l0 >> 15) < 1 || pull.test(l0 >> 15))
                && ((r0 - 1 >> 15) < 1 || (r0 - 1 >> 15) == (l0 >> 15) || pull.test(r0 - 1 >> 15))
                && ((l0 >> 16) < 1 || pull.test(l0 >> 16))
                && ((r0 - 1 >> 16) < 1 || (r0 - 1 >> 16) == (l0 >> 16) || pull.test(r0 - 1 >> 16))
                && ((l0 >> 17) < 1 || pull.test(l0 >> 17))
                && ((r0 - 1 >> 17) < 1 || (r0 - 1 >> 17) == (l0 >> 17) || pull.test(r0 - 1 >> 17)) ? 0 : 1) instanceof ToIntFunction<int[]> upd
            && ((BiPredicate<Integer, Integer>) (v, d) -> Stream.iterate(oh[v], e -> e >= 0, e -> on[e]).allMatch(e -> upd.applyAsInt(new int[]{tin[oa[e / 2]], tout[oa[e / 2]], d}) == 0 && upd.applyAsInt(new int[]{tin[ob[e / 2]], tout[ob[e / 2]], d}) == 0)) instanceof BiPredicate<Integer, Integer> toggle
            && new int[n + 1] instanceof int[] ans && new int[n + 1] instanceof int[] ps && new int[]{0} instanceof int[] pp
            && IntStream.range(0, n).allMatch(p -> Integer.valueOf(order[p]) instanceof Integer v
                && IntStream.iterate(0, z -> pp[0] > 0 && tout[ps[pp[0] - 1]] < p, z -> z + 1).allMatch(z -> toggle.test(ps[--pp[0]], -1))
                && (ps[pp[0]++] = v) > 0 && toggle.test(v, 1) && (ans[v] = len[1] - (len[1] > 0 ? 1 : 0)) >= 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining(" ")) : "");
    }
}
