import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw0 && Arrays.copyOf(raw0, raw0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] tk && new int[3] instanceof int[] ts
            && IntStream.range(0, raw.length).allMatch(i -> (raw[i] >= 48 ? (ts[1] = ts[1] * 10 + raw[i] - 48) + (ts[2] = 1) : ts[2] == 1 ? (tk[ts[0]++] = ts[1]) + (ts[1] = ts[2] = 0) : 0) >= 0)
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer k
            && Arrays.copyOfRange(tk, 2, n + 2) instanceof int[] a0 && IntStream.concat(IntStream.of(0), Arrays.stream(a0)).toArray() instanceof int[] a
            && new boolean[n + 1] instanceof boolean[] pr && new boolean[n + 1] instanceof boolean[] vis
            && IntStream.rangeClosed(1, n).allMatch(i -> a[i] == 0 || (pr[a[i]] = true))
            && new int[k] instanceof int[] l && new int[n + 1] instanceof int[] base && new int[5] instanceof int[] st
            && ((IntPredicate) i -> st[1] == 0
                ? (++st[0] <= n && !vis[st[0]] && (st[4] == 1 || !pr[st[0]]) ? (st[1] = st[0]) + (st[2] = 0) >= 0 : true)
                : (vis[st[1]] = true) && ++st[2] > 0 && (a[st[1]] == 0 ? (l[st[3]++] = st[2]) > 0 && (st[1] = 0) == 0
                    : vis[a[st[1]]] ? ++base[st[2]] > 0 && (st[1] = 0) == 0 : (st[1] = a[st[1]]) > 0)) instanceof IntPredicate step
            && IntStream.range(0, 2 * n + 3).allMatch(step) && (st[0] = 0) == 0 && (st[4] = 1) == 1 && IntStream.range(0, 2 * n + 3).allMatch(step)
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(L -> base[L] > 0).max().orElse(0)) instanceof Integer fixedMax
            && ((BiFunction<Integer, Integer, long[]>) (L, up) -> new long[up + 1] instanceof long[] arr
                && IntStream.rangeClosed(0, up).allMatch(c -> (arr[c] = c == 0 ? 1 : c == 1 ? L : (L * arr[c - 1] + (long) (c - 1) * L % 1000000007L * arr[c - 2]) % 1000000007L) >= 0) ? arr : null) instanceof BiFunction<Integer, Integer, long[]> fg
            && ((LongUnaryOperator) x -> new long[]{1} instanceof long[] r && IntStream.rangeClosed(0, 29).allMatch(i -> (r[0] = r[0] * r[0] % 1000000007L * ((1000000005 >> (29 - i) & 1) == 1 ? x : 1L) % 1000000007L) >= 0) ? r[0] : 0L) instanceof LongUnaryOperator inv
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(L -> base[L] > 0).mapToLong(L -> fg.apply(L, base[L])[base[L]]).reduce(1L, (x, y) -> x * y % 1000000007L)) instanceof Long baseProd
            && new int[1 << k] instanceof int[] sm && IntStream.range(1, 1 << k).allMatch(mask -> (sm[mask] = sm[mask & (mask - 1)] + l[Integer.numberOfTrailingZeros(mask)]) > 0)
            && IntStream.range(1, 1 << k).map(mask -> sm[mask]).distinct().boxed().collect(Collectors.toList()) instanceof List<Integer> sums
            && IntStream.range(0, sums.size()).boxed().collect(Collectors.toMap(i -> sums.get(i), i -> i)) instanceof Map<Integer, Integer> sid
            && IntStream.range(0, 1 << k).map(mask -> mask == 0 ? 0 : sid.get(sm[mask])).toArray() instanceof int[] idOf
            && Integer.valueOf(sums.size()) instanceof Integer D && Integer.valueOf(k + 1) instanceof Integer K1
            && new long[D * K1] instanceof long[] gU && new long[D * K1] instanceof long[] gD
            && sums.stream().mapToInt(s -> s > 2 ? 1 : 0).toArray() instanceof int[] isBig
            && IntStream.range(0, D).allMatch(d -> Integer.valueOf(sums.get(d)) instanceof Integer s && Integer.valueOf(base[s]) instanceof Integer b0 && fg.apply(s, b0 + k) instanceof long[] g
                && IntStream.rangeClosed(0, k).mapToLong(c -> inv.applyAsLong(g[b0 + c])).toArray() instanceof long[] iv
                && IntStream.rangeClosed(1, k).allMatch(c -> (gU[d * K1 + c] = g[b0 + c] * iv[c - 1] % 1000000007L) >= 0 && (gD[d * K1 + c] = g[b0 + c - 1] * iv[c] % 1000000007L) >= 0))
            && new int[k + 1] instanceof int[] bm && new int[D + 1] instanceof int[] cn && new long[k + 1] instanceof long[] wA && new long[k + 1] instanceof long[] rA && new int[k + 1] instanceof int[] bg
            && new int[k + 1] instanceof int[] dA && new int[k + 1] instanceof int[] oA && new int[k + 1] instanceof int[] d0A && new int[k + 1] instanceof int[] d1A && new int[8] instanceof int[] rg
            && (wA[0] = 1) > 0 && (rA[0] = 1) > 0 && new long[2] instanceof long[] tot
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ref
            && Boolean.valueOf(ref.compareAndSet(null, (j, b) -> j == k - 1
                ? ((rg[0] = idOf[1 << j]) >= 0 && (rg[1] = fixedMax <= 2 && bg[j] + isBig[rg[0]] == 0 ? 1 : 0) >= 0
                    && (tot[rg[1]] += rg[1] == 1 ? wA[j] : wA[j] * (rA[j] * gU[rg[0] * K1 + cn[rg[0]] + 1] % 1000000007L)) >= 0
                    && IntStream.range(0, b).allMatch(i -> (rg[2] = bm[i]) > 0 && (rg[3] = idOf[rg[2]]) >= 0 && (rg[4] = idOf[rg[2] | 1 << j]) >= 0
                        && (rg[5] = fixedMax <= 2 && bg[j] - isBig[rg[3]] + isBig[rg[4]] == 0 ? 1 : 0) >= 0
                        && (tot[rg[5]] += rg[5] == 1 ? wA[j] * Integer.bitCount(rg[2]) : wA[j] * Integer.bitCount(rg[2]) * (rA[j] * (gD[rg[3] * K1 + cn[rg[3]]] * gU[rg[4] * K1 + cn[rg[4]] + 1] % 1000000007L) % 1000000007L)) >= 0)
                    && (tot[0] %= 1000000007L) >= 0 ? 0 : 0)
                : ((dA[j] = idOf[1 << j]) >= 0 && (bm[b] = 1 << j) > 0 && (wA[j + 1] = wA[j]) > 0 && (rA[j + 1] = rA[j] * gU[dA[j] * K1 + cn[dA[j]] + 1] % 1000000007L) >= 0 && (bg[j + 1] = bg[j] + isBig[dA[j]]) >= 0
                    && ++cn[dA[j]] > 0 && ref.get().applyAsInt(j + 1, b + 1) >= 0 && --cn[dA[j]] >= 0
                    && IntStream.range(0, b).allMatch(i -> (oA[j] = bm[i]) > 0 && (d0A[j] = idOf[oA[j]]) >= 0 && (d1A[j] = idOf[oA[j] | 1 << j]) >= 0
                        && (wA[j + 1] = wA[j] * Integer.bitCount(oA[j])) > 0 && (rA[j + 1] = rA[j] * (gD[d0A[j] * K1 + cn[d0A[j]]] * gU[d1A[j] * K1 + cn[d1A[j]] + 1] % 1000000007L) % 1000000007L) >= 0
                        && (bg[j + 1] = bg[j] - isBig[d0A[j]] + isBig[d1A[j]]) >= -1000
                        && --cn[d0A[j]] >= 0 && ++cn[d1A[j]] > 0 && (bm[i] = oA[j] | 1 << j) > 0 && ref.get().applyAsInt(j + 1, b) >= 0 && --cn[d1A[j]] >= 0 && ++cn[d0A[j]] > 0 && (bm[i] = oA[j]) > 0)
                    ? 0 : 0))) instanceof Boolean setOk
            && (k == 0 || ref.get().applyAsInt(0, 0) >= 0)
            ? (k == 0 ? (fixedMax <= 2 ? 1L : baseProd) : (baseProd * (tot[0] % 1000000007L) + tot[1]) % 1000000007L) : "");
    }
}
