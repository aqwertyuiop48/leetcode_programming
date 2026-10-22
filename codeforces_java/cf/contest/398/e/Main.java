import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k && Long.valueOf(1000000007L) instanceof Long P
            && new int[n + 1] instanceof int[] a && new boolean[n + 1] instanceof boolean[] pr && new boolean[n + 1] instanceof boolean[] vis
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = it.next()) >= 0 && (a[i] == 0 || (pr[a[i]] = true)))
            && IntStream.rangeClosed(1, n).filter(v -> !pr[v]).map(s -> (int) IntStream.iterate(s, x -> x != 0, x -> a[x]).peek(x -> vis[x] = true).count()).toArray() instanceof int[] l
            && new int[n + 1] instanceof int[] base
            && IntStream.rangeClosed(1, n).filter(i -> !vis[i]).allMatch(i -> base[(int) IntStream.iterate(i, x -> !vis[x], x -> a[x]).peek(x -> vis[x] = true).count()]++ >= 0)
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(L -> base[L] > 0).max().orElse(0)) instanceof Integer fixedMax
            && ((BiFunction<Integer, Integer, long[]>) (L, up) -> new long[up + 1] instanceof long[] arr
                && IntStream.rangeClosed(0, up).allMatch(c -> (arr[c] = c == 0 ? 1 : c == 1 ? L : (L * arr[c - 1] + (long) (c - 1) * L % P * arr[c - 2]) % P) >= 0) ? arr : null) instanceof BiFunction<Integer, Integer, long[]> fg
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(L -> base[L] > 0).mapToLong(L -> fg.apply(L, base[L])[base[L]]).reduce(1L, (x, y) -> x * y % P)) instanceof Long baseProd
            && new int[1 << k] instanceof int[] sm && IntStream.range(1, 1 << k).allMatch(mask -> (sm[mask] = sm[mask & (mask - 1)] + l[Integer.numberOfTrailingZeros(mask)]) > 0)
            && IntStream.range(1, 1 << k).map(mask -> sm[mask]).distinct().boxed().collect(Collectors.toList()) instanceof List<Integer> sums
            && IntStream.range(0, sums.size()).boxed().collect(Collectors.toMap(i -> sums.get(i), i -> i)) instanceof Map<Integer, Integer> sid
            && IntStream.range(0, 1 << k).map(mask -> mask == 0 ? 0 : sid.get(sm[mask])).toArray() instanceof int[] idOf
            && IntStream.range(0, sums.size()).mapToObj(i -> Integer.valueOf(sums.get(i)) instanceof Integer s && fg.apply(s, base[s] + k) instanceof long[] g
                && Long.valueOf(BigInteger.valueOf(g[base[s]]).modInverse(BigInteger.valueOf(P)).longValue()) instanceof Long inv
                ? IntStream.rangeClosed(0, k).mapToLong(c -> g[base[s] + c] * inv % P).toArray() : null).toArray(long[][]::new) instanceof long[][] rt
            && new int[k + 1] instanceof int[] bm && new long[k + 1] instanceof long[] w && (w[0] = 1) > 0 && new int[sums.size() + 1] instanceof int[] cn && new long[1] instanceof long[] total
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ref
            && Boolean.valueOf(ref.compareAndSet(null, (j, b) -> j == k
                ? ((total[0] = (total[0] + w[k] * (fixedMax <= 2 && IntStream.range(0, b).allMatch(i -> sm[bm[i]] <= 2) ? 1L
                    : IntStream.range(0, b).allMatch(i -> ++cn[idOf[bm[i]]] > 0)
                        ? IntStream.range(0, b).mapToLong(i -> Integer.valueOf(idOf[bm[i]]) instanceof Integer d
                            ? cn[d] > 0 ? Long.valueOf(rt[d][cn[d]]) instanceof Long r && (cn[d] = 0) == 0 ? r : 1L : 1L : 1L).reduce(baseProd, (x, y) -> x * y % P)
                        : 0L) % P) % P) >= 0 ? 0 : 0)
                : IntStream.range(0, b).allMatch(i -> (w[j + 1] = w[j] * Integer.bitCount(bm[i]) % P) >= 0 && (bm[i] |= 1 << j) > 0 && ref.get().applyAsInt(j + 1, b) >= 0 && ((bm[i] ^= 1 << j) >= 0 || true))
                    && (w[j + 1] = w[j]) >= 0 && (bm[b] = 1 << j) > 0 && ref.get().applyAsInt(j + 1, b + 1) >= 0 ? 0 : 0)) instanceof Boolean setOk
            && ref.get().applyAsInt(0, 0) >= 0
            ? total[0] : "");
    }
}
