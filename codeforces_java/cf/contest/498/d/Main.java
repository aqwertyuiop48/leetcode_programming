import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).allMatch(i -> (raw[i] = (byte) (raw[i] == 'A' ? '0' : raw[i] == 'C' ? '1' : raw[i])) >= 0)
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(Integer.highestOneBit(Math.max(n, 2) - 1) * 2) instanceof Integer size
            && new long[size * 60] instanceof long[] c
            && new int[size + 1] instanceof int[] ver
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ref
            && ref.getAndSet((v, t) -> v >= size
                ? (Integer.valueOf(v - size < n ? g[1 + v - size] : 2) instanceof Integer aa
                    ? ((t % aa == 0 ? 2 : 1) << 6) | ((t + (t % aa == 0 ? 2 : 1)) % 60)
                    : 0)
                : (c[v * 60 + t] >>> 32) == ver[v] + 1
                    ? (int) c[v * 60 + t]
                    : (Integer.valueOf(ref.get().applyAsInt(2 * v, t)) instanceof Integer l
                        && Integer.valueOf(ref.get().applyAsInt(2 * v + 1, l & 63)) instanceof Integer r
                        && (c[v * 60 + t] = ((long) (ver[v] + 1) << 32) | ((((l >> 6) + (r >> 6)) << 6) | (r & 63))) != 0
                            ? (int) c[v * 60 + t]
                            : 0)) == null
            && ref.get() instanceof IntBinaryOperator E
            && Integer.valueOf(g[n + 1]) instanceof Integer q
            && new StringBuilder() instanceof StringBuilder sb
            && new int[40] instanceof int[] stk
            && IntStream.range(0, q).allMatch(k ->
                Integer.valueOf(n + 2 + 3 * k) instanceof Integer b
                && (g[b] == 1
                    ? (g[g[b + 1]] = g[b + 2]) > 0
                        && IntStream.iterate((size + g[b + 1] - 1) >> 1, v -> v >= 1, v -> v >> 1).allMatch(v -> ++ver[v] > 0)
                    : new int[]{0, 0} instanceof int[] tt
                        && LongStream.iterate(((long) (size + g[b + 1] - 1) << 32) | (size + g[b + 2] - 1), st -> (int) (st >>> 32) < (int) st, st ->
                            Integer.valueOf((int) (st >>> 32)) instanceof Integer lo
                            && Integer.valueOf((int) st) instanceof Integer hi
                            && ((lo & 1) == 0 || (tt[0] += E.applyAsInt(lo, tt[0] % 60) >> 6) >= 0)
                            && ((hi & 1) == 0 || (stk[tt[1]++] = hi - 1) >= 0)
                                ? ((long) ((lo + (lo & 1)) >> 1) << 32) | (hi >> 1)
                                : 0L).count() >= 0
                        && IntStream.iterate(tt[1] - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (tt[0] += E.applyAsInt(stk[i], tt[0] % 60) >> 6) >= 0)
                        && sb.append(tt[0]).append('\n') != null))
            ? sb
            : "");
    }
}
