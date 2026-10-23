import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Long) sc.nextLong() instanceof Long n
            && (Long) sc.nextLong() instanceof Long k0
            ? n > 10000000000L
                ? (LongStream.rangeClosed(1, 100000000000000L / n).map(i -> i * n).filter(m -> Long.toString(m) instanceof String s
                    && (s.length() <= 2 || IntStream.range(1, s.length() - 1).allMatch(i -> (s.charAt(i) - s.charAt(i - 1)) * (s.charAt(i) - s.charAt(i + 1)) > 0)))
                    .skip(k0 - 1).findFirst() instanceof OptionalLong o && o.isPresent() ? String.valueOf(o.getAsLong()) : "-1")
                : (((UnaryOperator<int[]>) a -> new int[a.length + 1] instanceof int[] off
                        && IntStream.range(0, a.length).allMatch(i -> (off[i + 1] = off[i] + ((a[i] & 3) == 1 ? (a[i] >> 2) & 15 : (a[i] & 3) == 2 ? 9 - ((a[i] >> 2) & 15) : 9)) >= 0)
                        && new int[off[a.length]] instanceof int[] out
                        && IntStream.range(0, 10).allMatch(d -> IntStream.range(0, a.length).reduce(0, (u, i) ->
                            d != ((a[i] >> 2) & 15) && ((a[i] & 3) == 0 || ((a[i] & 3) == 1 ? d < ((a[i] >> 2) & 15) : d > ((a[i] >> 2) & 15)))
                                && (out[off[i] + ((a[i] & 3) == 1 ? d : (a[i] & 3) == 2 ? d - ((a[i] >> 2) & 15) - 1 : d < ((a[i] >> 2) & 15) ? d : d - 1)]
                                    = (((a[i] >> 6) * 10 + d) << 6) | (d << 2) | (d > ((a[i] >> 2) & 15) ? 1 : 2)) < 0 ? 1 : 0) >= 0)
                        ? out : null) instanceof UnaryOperator<int[]> ext
                    && new int[8][] instanceof int[][] pl
                    && (pl[1] = IntStream.rangeClosed(1, 9).map(d -> (d << 6) | (d << 2)).toArray()) != null
                    && IntStream.rangeClosed(1, 6).allMatch(L -> (pl[L + 1] = ext.apply(pl[L])) != null)
                    && Stream.iterate(IntStream.rangeClosed(0, 9).map(d -> (d << 6) | (d << 2)).toArray(), ext).skip(6).findFirst().get() instanceof int[] ql
                    && Arrays.stream(ql).mapToLong(e -> (((((e >> 6) % n) * 2 + ((e >> 6) / 100000 % 10 > (e >> 6) / 1000000 ? 0 : 1)) * 10 + (e >> 6) / 1000000) << 24) | (e >> 6)).sorted().toArray() instanceof long[] qk
                    && ((IntUnaryOperator) (r -> r ^ (r >> 31))) instanceof IntUnaryOperator fx
                    && ((LongToIntFunction) (x -> fx.applyAsInt(Arrays.binarySearch(qk, x)))) instanceof LongToIntFunction lb
                    && ((IntFunction<long[]>) (e -> (Long) ((n - ((e >> 6) * 10000000L) % n) % n) instanceof Long need
                        && (Integer) ((e >> 2) & 15) instanceof Integer p
                        && (Integer) (e & 3) instanceof Integer dp
                        && (Integer) (dp != 2 ? lb.applyAsInt(((need * 2) * 10) << 24) : 0) instanceof Integer a0
                        && (Integer) (dp != 2 ? lb.applyAsInt(((need * 2) * 10 + p) << 24) : 0) instanceof Integer a1
                        && (Integer) (dp != 1 ? lb.applyAsInt(((need * 2 + 1) * 10 + p + 1) << 24) : 0) instanceof Integer b0
                        && (Integer) (dp != 1 ? lb.applyAsInt(((need * 2 + 1) * 10 + 10) << 24) : 0) instanceof Integer b1
                        ? new long[] {dp != 2 ? a1 - a0 : 0, a0, dp != 1 ? b1 - b0 : 0, b0} : null)) instanceof IntFunction<long[]> rg
                    && ((IntFunction<IntStream>) (L -> L == 2 ? IntStream.rangeClosed(10, 99) : Arrays.stream(pl[L]).map(e -> e >> 6))) instanceof IntFunction<IntStream> cand
                    && new long[] {k0, -1} instanceof long[] st
                    && IntStream.rangeClosed(1, 14).allMatch(L -> st[1] >= 0 ? true : L <= 7
                        ? (Long) cand.apply(L).filter(v -> v % n == 0).count() instanceof Long c
                            && (c < st[0] ? (st[0] -= c) >= 0 : (st[1] = cand.apply(L).filter(v -> v % n == 0).skip(st[0] - 1).findFirst().getAsInt()) >= 0)
                        : (Integer) (L - 7) instanceof Integer lp
                            && Arrays.stream(pl[lp]).mapToObj(rg).mapToLong(r -> r[0] + r[2]).toArray() instanceof long[] cp
                            && (Long) Arrays.stream(cp).sum() instanceof Long tot
                            && (tot < st[0] ? (st[0] -= tot) >= 0
                                : new long[1] instanceof long[] run
                                    && (Integer) IntStream.range(0, cp.length).filter(i -> (run[0] += cp[i]) >= st[0]).findFirst().getAsInt() instanceof Integer idx
                                    && rg.apply(pl[lp][idx]) instanceof long[] r
                                    && (Long) (st[0] - (run[0] - cp[idx])) instanceof Long kk
                                    && (st[1] = (pl[lp][idx] >> 6) * 10000000L + (qk[(int) (kk <= r[0] ? r[1] + kk - 1 : r[3] + kk - r[0] - 1)] & 16777215L)) >= 0))
                    ? String.valueOf(st[1]) : "")
            : "");
    }
}
