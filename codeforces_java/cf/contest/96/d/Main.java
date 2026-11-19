import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] tk
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf((int) tk[0]) instanceof Integer n
            && Integer.valueOf((int) tk[1]) instanceof Integer m
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] head
            && new int[2 * m] instanceof int[] nxt
            && new int[2 * m] instanceof int[] to
            && new long[2 * m] instanceof long[] len
            && IntStream.range(0, m).allMatch(e ->
                (to[2 * e] = (int) tk[5 + 3 * e] - 1) >= 0 && (to[2 * e + 1] = (int) tk[4 + 3 * e] - 1) >= 0
                && (len[2 * e] = tk[6 + 3 * e]) >= 0 && (len[2 * e + 1] = tk[6 + 3 * e]) >= 0
                && (nxt[2 * e] = head[(int) tk[4 + 3 * e] - 1]) >= -1 && (head[(int) tk[4 + 3 * e] - 1] = 2 * e) >= 0
                && (nxt[2 * e + 1] = head[(int) tk[5 + 3 * e] - 1]) >= -1 && (head[(int) tk[5 + 3 * e] - 1] = 2 * e + 1) >= 0)
            && new int[n] instanceof int[] stp
            && new long[n] instanceof long[] dd
            && new int[n + 1] instanceof int[] rl
            && new long[]{0, 0, 0, 0, 0, 0, 0} instanceof long[] cur
            && new long[2 * m + n + 8] instanceof long[] hp
            && new IntPredicate[2] instanceof IntPredicate[] sh
            && (sh[0] = i -> i == 0 || hp[(i - 1) >> 1] <= hp[i]
                || ((cur[5] = hp[i]) >= 0 && (hp[i] = hp[(i - 1) >> 1]) >= 0 && (hp[(i - 1) >> 1] = cur[5]) >= 0 && sh[0].test((i - 1) >> 1))) instanceof IntPredicate up
            && (sh[1] = i -> 2 * i + 1 >= cur[4]
                || (Integer.valueOf(2 * i + 2 < cur[4] && hp[2 * i + 2] < hp[2 * i + 1] ? 2 * i + 2 : 2 * i + 1) instanceof Integer c
                    && (hp[c] >= hp[i]
                        || ((cur[5] = hp[i]) >= 0 && (hp[i] = hp[c]) >= 0 && (hp[c] = cur[5]) >= 0 && sh[1].test(c))))) instanceof IntPredicate down
            && new IntPredicate[1] instanceof IntPredicate[] rh
            && (rh[0] = s -> s < 0 || (
                Integer.valueOf(to[s]) instanceof Integer w
                && (cur[1] + len[s] > cur[2]
                    || (stp[w] == cur[0] && dd[w] <= cur[1] + len[s])
                    || ((stp[w] = (int) cur[0]) >= 0 && (dd[w] = cur[1] + len[s]) >= 0 && ((hp[(int) cur[4]] = dd[w] << 10 | w) >= 0 && up.test((int) cur[4]++))))
                && rh[0].test(nxt[s]))) instanceof IntPredicate relax
            && ((LongBinaryOperator) (src, lim) ->
                ++cur[0] > 0 && (cur[2] = lim) >= 0 && (cur[3] = 0) == 0
                && (stp[(int) src] = (int) cur[0]) > 0 && (dd[(int) src] = 0) == 0
                && (hp[0] = src) >= 0 && (cur[4] = 1) > 0
                && IntStream.iterate(0, q -> cur[4] > 0, q -> q + 1).allMatch(q ->
                    (cur[6] = hp[0]) >= 0 && (hp[0] = hp[(int) --cur[4]]) >= 0 && down.test(0)
                    && Integer.valueOf((int) (cur[6] & 1023L)) instanceof Integer v
                    && (cur[6] >> 10 != dd[v] || ((rl[(int) cur[3]++] = v) >= 0 && (cur[1] = cur[6] >> 10) >= 0 && relax.test(head[v]))))
                ? cur[3] : 0L) instanceof LongBinaryOperator dj
            && new long[n] instanceof long[] ds
            && IntStream.range(0, n).allMatch(i -> (ds[i] = 1L << 52) > 0)
            && (ds[(int) tk[2] - 1] = 0) == 0
            && new boolean[n] instanceof boolean[] dn
            && IntStream.range(0, n).allMatch(step ->
                IntStream.range(0, n).filter(i -> !dn[i]).mapToLong(i -> ds[i] << 10 | i).min() instanceof OptionalLong mn
                && (mn.isEmpty() || mn.getAsLong() >> 10 >= 1L << 52
                    || (Integer.valueOf((int) (mn.getAsLong() & 1023L)) instanceof Integer u
                        && (dn[u] = true)
                        && dj.applyAsLong(u, tk[4 + 3 * m + 2 * u]) >= 0
                        && IntStream.range(0, (int) cur[3]).allMatch(k ->
                            ds[u] + tk[5 + 3 * m + 2 * u] >= ds[rl[k]] || (ds[rl[k]] = ds[u] + tk[5 + 3 * m + 2 * u]) >= 0))))
            ? ds[(int) tk[3] - 1] >= 1L << 52 ? -1 : ds[(int) tk[3] - 1]
            : 0L);
    }
}
