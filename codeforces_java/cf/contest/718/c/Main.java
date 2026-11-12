import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && Integer.valueOf(tk.nextToken()) instanceof Integer q
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1)) * 2) instanceof Integer sz
            && new long[2 * sz] instanceof long[] s0 && new long[2 * sz] instanceof long[] s1
            && new long[2 * sz] instanceof long[] ta && new long[2 * sz] instanceof long[] tb
            && new long[2] instanceof long[] fx
            && new AtomicReference<Function<long[], Long>>() instanceof AtomicReference<Function<long[], Long>> rec
            && ((LongFunction<long[]>) x -> Stream.of(new long[]{0, 1}).peek(st -> IntStream.rangeClosed(0, 30).map(i -> 30 - i).allMatch(bit ->
                Long.valueOf(st[0]) instanceof Long fa && Long.valueOf(st[1]) instanceof Long fb
                && Long.valueOf(fa * ((2 * fb - fa + 1000000007L) % 1000000007L) % 1000000007L) instanceof Long fc
                && Long.valueOf((fa * fa + fb * fb) % 1000000007L) instanceof Long fd
                && ((x >> bit & 1) == 0 ? (st[0] = fc) >= 0 && (st[1] = fd) >= 0 : (st[0] = fd) >= 0 && (st[1] = (fc + fd) % 1000000007L) >= 0)
                || true)).findFirst().get()) instanceof LongFunction<long[]> fib
            && ((Function<long[], Long>) v ->
                Integer.valueOf((int) v[0]) instanceof Integer an
                && Long.valueOf(s0[an]) instanceof Long o0 && Long.valueOf(s1[an]) instanceof Long o1
                && (s0[an] = (o0 * (v[1] + v[2]) + o1 * v[2]) % 1000000007L) >= 0
                && (s1[an] = (o0 * v[2] + o1 * v[1]) % 1000000007L) >= 0
                && Long.valueOf(ta[an]) instanceof Long ga && Long.valueOf(tb[an]) instanceof Long gb
                && (ta[an] = (gb * v[2] + ga * v[1]) % 1000000007L) >= 0
                && (tb[an] = (ga * v[2] + gb * v[2] + gb * v[1]) % 1000000007L) >= 0
                ? 0L : 0L) instanceof Function<long[], Long> ap
            && IntStream.range(0, 2 * sz).allMatch(i -> (ta[i] = 1) >= 0 || true)
            && IntStream.range(0, n).allMatch(i -> fib.apply(Long.parseLong(tk.nextToken()) - 1) instanceof long[] p
                && (s1[sz + i] = p[0]) >= 0 && (s0[sz + i] = p[1]) >= 0 || true)
            && IntStream.range(1, sz).map(i -> sz - i).allMatch(nd ->
                (s0[nd] = (s0[2 * nd] + s0[2 * nd + 1]) % 1000000007L) >= 0
                && (s1[nd] = (s1[2 * nd] + s1[2 * nd + 1]) % 1000000007L) >= 0 || true)
            && rec.updateAndGet(rx -> v ->
                (v[3] >= v[2] || v[4] <= v[1]) ? 0L
                : (v[3] <= v[1] && v[2] <= v[4]) ? (v[5] == 1 ? ap.apply(new long[]{v[0], fx[0], fx[1]}) : Long.valueOf(s0[(int) v[0]]))
                : Integer.valueOf((int) v[0]) instanceof Integer nd
                && ap.apply(new long[]{2 * nd, ta[nd], tb[nd]}) instanceof Long z1
                && ap.apply(new long[]{2 * nd + 1, ta[nd], tb[nd]}) instanceof Long z2
                && (ta[nd] = 1) >= 0 && (tb[nd] = 0) >= 0
                && Long.valueOf((v[1] + v[2]) / 2) instanceof Long mid
                && rec.get().apply(new long[]{2 * nd, v[1], mid, v[3], v[4], v[5]}) instanceof Long u
                && rec.get().apply(new long[]{2 * nd + 1, mid, v[2], v[3], v[4], v[5]}) instanceof Long w
                && (v[5] == 0 || ((s0[nd] = (s0[2 * nd] + s0[2 * nd + 1]) % 1000000007L) >= 0
                    && (s1[nd] = (s1[2 * nd] + s1[2 * nd + 1]) % 1000000007L) >= 0))
                ? (v[5] == 1 ? 0L : (u + w) % 1000000007L) : 0L) != null
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(tk.nextToken()) instanceof Integer ty
                && Integer.valueOf(tk.nextToken()) instanceof Integer l && Integer.valueOf(tk.nextToken()) instanceof Integer r
                ? (ty == 1
                    ? (fib.apply(Long.parseLong(tk.nextToken()) - 1) instanceof long[] fp && (fx[0] = fp[0]) >= 0 && (fx[1] = fp[1]) >= 0
                        && rec.get().apply(new long[]{1, 0, sz, l - 1, r, 1}) instanceof Long zz ? "" : "")
                    : String.valueOf(rec.get().apply(new long[]{1, 0, sz, l - 1, r, 0})))
                : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
