import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1 + 3 * n] instanceof Integer q
            && new BitSet(n + 2) instanceof BitSet bs
            && new int[n + 2] instanceof int[] en
            && new long[n + 2] instanceof long[] t0
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.of(i).peek(x -> bs.set(x)).findFirst().isPresent() && (en[i] = i) > 0 && (t0[i] = -1) < 0)
            && new long[q] instanceof long[] ans
            && new int[n + q * 4 + 8] instanceof int[] ta
            && new int[n + q * 4 + 8] instanceof int[] tb
            && new int[n + q * 4 + 8] instanceof int[] tq
            && new long[n + q * 4 + 8] instanceof long[] td
            && new int[1] instanceof int[] tc
            && ((IntUnaryOperator) pos ->
                pos > n ? 0
                : (Integer) bs.previousSetBit(pos) instanceof Integer s && s < pos
                    ? (IntStream.of(pos).peek(x -> bs.set(x)).findFirst().isPresent() && (en[pos] = en[s]) >= 0 && (t0[pos] = t0[s]) >= -1 && (en[s] = pos - 1) >= 0 ? 0 : -1)
                    : 0) instanceof IntUnaryOperator split
            && IntStream.range(0, q).allMatch(qi ->
                (Long) (long) tk[2 + 3 * n + 3 * qi] instanceof Long t
                && (Integer) tk[3 + 3 * n + 3 * qi] instanceof Integer l
                && (Integer) tk[4 + 3 * n + 3 * qi] instanceof Integer r
                && split.applyAsInt(l) >= 0
                && split.applyAsInt(r + 1) >= 0
                && IntStream.iterate(l, a -> a <= r, a -> en[a] + 1).allMatch(a ->
                    t0[a] < 0
                        ? (ans[qi] += Math.min((long) tk[2 + 3 * (a - 1)], (long) tk[1 + 3 * (a - 1)] + (long) tk[3 + 3 * (a - 1)] * t)) >= 0
                        : (ta[tc[0]] = a) > 0 && (tb[tc[0]] = en[a]) > 0 && (tq[tc[0]] = qi) >= 0 && (td[tc[0]++] = t - t0[a]) >= 0)
                && IntStream.of(l).peek(x -> bs.clear(x, r + 1)).findFirst().isPresent()
                && IntStream.of(l).peek(x -> bs.set(x)).findFirst().isPresent()
                && (en[l] = r) > 0
                && (t0[l] = t) >= 0)
            && new long[n + 1] instanceof long[] totR
            && IntStream.rangeClosed(1, n).allMatch(i -> (totR[i] = totR[i - 1] + tk[3 + 3 * (i - 1)]) >= 0)
            && LongStream.concat(
                IntStream.range(0, n).mapToLong(i -> ((Math.min(2147483647L, tk[3 + 3 * i] == 0 ? 2147483647L : ((long) tk[2 + 3 * i] + tk[3 + 3 * i] - 1) / tk[3 + 3 * i]) * 2) << 20) | i),
                IntStream.range(0, tc[0]).mapToLong(i -> ((td[i] * 2 + 1) << 20) | i)).sorted().toArray() instanceof long[] ev
            && new long[n + 2] instanceof long[] fm
            && new long[n + 2] instanceof long[] fr
            && new long[5] instanceof long[] acc
            && new LongUnaryOperator[2] instanceof LongUnaryOperator[] fn
            && (fn[0] = i -> i > n ? 0 : (fm[(int) i] += acc[3]) >= 0 && (fr[(int) i] += acc[4]) >= 0 ? fn[0].applyAsLong(i + (i & -i)) : -1) != null
            && (fn[1] = i -> i <= 0 ? 0 : (acc[0] += acc[2] * fm[(int) i]) > Long.MIN_VALUE && (acc[1] += acc[2] * fr[(int) i]) > Long.MIN_VALUE ? fn[1].applyAsLong(i - (i & -i)) : -1) != null
            && Arrays.stream(ev).allMatch(e ->
                (Integer) (int) (e & 1048575) instanceof Integer id
                && (((e >> 20) & 1) == 0
                    ? (acc[3] = tk[2 + 3 * id]) >= 0 && (acc[4] = tk[3 + 3 * id]) >= 0 && fn[0].applyAsLong(id + 1) >= 0
                    : (acc[0] = 0) == 0 && (acc[1] = 0) == 0
                    && (acc[2] = 1) == 1 && fn[1].applyAsLong(tb[id]) >= 0
                    && (acc[2] = -1) == -1 && fn[1].applyAsLong(ta[id] - 1) >= 0
                    && (ans[tq[id]] += acc[0] + td[id] * ((totR[tb[id]] - totR[ta[id] - 1]) - acc[1])) >= 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
