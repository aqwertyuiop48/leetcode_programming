import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw ? CompletableFuture.supplyAsync(() -> new int[raw.length / 2 + 4] instanceof int[] v && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[(int) st[1]++] = (int) st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && Integer.valueOf(Math.min(v[2], v[1])) instanceof Integer pp
            && new long[n + 1] instanceof long[] D && IntStream.rangeClosed(2, n).filter(h -> (D[h] = D[h - 1] + v[1 + h]) >= 0).count() >= 0
            && IntStream.range(0, m).mapToObj(i -> D[0] + v[2 + n + 2 * i + 1] - D[v[2 + n + 2 * i]]).sorted().mapToLong(Long::longValue).toArray() instanceof long[] a
            && new long[m + 1] instanceof long[] S && IntStream.rangeClosed(1, m).filter(i -> (S[i] = S[i - 1] + a[i - 1]) > Long.MIN_VALUE).count() >= 0
            && Long.valueOf(4000000000000000000L) instanceof Long INF
            && new long[2][m + 1] instanceof long[][] dpa && IntStream.rangeClosed(1, m).filter(i -> (dpa[0][i] = INF) > 0).count() >= 0
            && new long[m + 2] instanceof long[] qk && new long[m + 2] instanceof long[] qb && new int[1] instanceof int[] hd && new int[1] instanceof int[] tl && new long[3] instanceof long[] nl
            && new AtomicReference<IntSupplier>() instanceof AtomicReference<IntSupplier> pop && new AtomicReference<IntSupplier>() instanceof AtomicReference<IntSupplier> adv
            && pop.compareAndSet(null, () -> tl[0] - hd[0] >= 2 && Math.floorDiv(nl[1] - qb[tl[0] - 1], qk[tl[0] - 1] - nl[0]) <= Math.floorDiv(qb[tl[0] - 1] - qb[tl[0] - 2], qk[tl[0] - 2] - qk[tl[0] - 1])
                ? --tl[0] >= 0 ? pop.get().getAsInt() : 0 : 1)
            && adv.compareAndSet(null, () -> hd[0] + 1 < tl[0] && qk[hd[0] + 1] * nl[2] + qb[hd[0] + 1] <= qk[hd[0]] * nl[2] + qb[hd[0]] ? ++hd[0] >= 0 ? adv.get().getAsInt() : 0 : 1)
            && IntStream.rangeClosed(1, pp).allMatch(k -> dpa[k & 1] instanceof long[] cur && dpa[(k - 1) & 1] instanceof long[] prev && (hd[0] = 0) == 0 && (tl[0] = 0) == 0
                && IntStream.rangeClosed(k, m).filter(i -> (prev[i - 1] >= INF || (nl[0] = -(i - 1)) <= 0 && (nl[1] = prev[i - 1] + S[i - 1]) > Long.MIN_VALUE && pop.get().getAsInt() >= 0
                        && (qk[tl[0]] = nl[0]) <= 0 && (qb[tl[0]++] = nl[1]) > Long.MIN_VALUE)
                    && (nl[2] = a[i - 1]) > Long.MIN_VALUE && adv.get().getAsInt() >= 0 && (cur[i] = nl[2] * i - S[i] + qk[hd[0]] * nl[2] + qb[hd[0]]) > Long.MIN_VALUE).count() >= 0)
            ? (Object) dpa[pp & 1][m] : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
