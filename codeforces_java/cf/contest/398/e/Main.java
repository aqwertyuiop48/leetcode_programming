
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
            && IntStream.range(1, 1 << k).map(mask -> sm[mask]).sorted().distinct().boxed().collect(Collectors.toList()) instanceof List<Integer> sums
            && IntStream.range(0, sums.size()).boxed().collect(Collectors.toMap(i -> sums.get(i), i -> i)) instanceof Map<Integer, Integer> sid
            && IntStream.range(0, 1 << k).map(mask -> mask == 0 ? 0 : sid.get(sm[mask])).toArray() instanceof int[] idOf
            && Integer.valueOf(sums.size()) instanceof Integer D && Integer.valueOf(k + 1) instanceof Integer K1
            && new long[D * K1] instanceof long[] gU && new long[D * K1] instanceof long[] gD
            && sums.stream().mapToInt(s -> s > 2 ? 1 : 0).toArray() instanceof int[] isBig
            && IntStream.range(0, D).allMatch(d -> Integer.valueOf(sums.get(d)) instanceof Integer s && Integer.valueOf(base[s]) instanceof Integer b0 && fg.apply(s, b0 + k) instanceof long[] g
                && IntStream.rangeClosed(0, k).mapToLong(c -> inv.applyAsLong(g[b0 + c])).toArray() instanceof long[] iv
                && IntStream.rangeClosed(1, k).allMatch(c -> (gU[d * K1 + c] = g[b0 + c] * iv[c - 1] % 1000000007L) >= 0 && (gD[d * K1 + c] = g[b0 + c - 1] * iv[c] % 1000000007L) >= 0))
            && Integer.valueOf(1 << k) instanceof Integer N
            && new long[k + 1] instanceof long[] fact && IntStream.rangeClosed(0, k).allMatch(i -> (fact[i] = i == 0 ? 1L : fact[i - 1] * i % 1000000007L) > 0)
            && IntStream.rangeClosed(0, k).mapToLong(c -> c == 0 ? 0L : inv.applyAsLong(c)).toArray() instanceof long[] ic
            && IntStream.range(1, N).boxed().sorted(Comparator.comparingInt(x -> idOf[x])).mapToInt(x -> x).toArray() instanceof int[] ord
            && new int[D + 2] instanceof int[] cs && IntStream.range(1, N).allMatch(x -> ++cs[idOf[x] + 1] > 0)
            && IntStream.rangeClosed(1, D).allMatch(d -> (cs[d] += cs[d - 1]) >= 0)
            && new long[N] instanceof long[] FA && new long[N] instanceof long[] FW && (FA[0] = 1) == 1 && (FW[0] = 1) == 1 && new long[2] instanceof long[] snap
            && Integer.valueOf((int) sums.stream().filter(s -> s <= 2).count()) instanceof Integer ns
            && ((IntPredicate) d -> Integer.valueOf(cs[d]) instanceof Integer lo && Integer.valueOf(cs[d + 1]) instanceof Integer hi
                && (IntStream.range(lo, hi).anyMatch(x -> IntStream.range(x + 1, hi).anyMatch(y -> (ord[x] & ord[y]) == 0))
                    ? new long[k + 2][] instanceof long[][] LA && new long[k + 2][] instanceof long[][] LW && (LA[0] = FA.clone()) != null && (LW[0] = FW.clone()) != null && new int[1] instanceof int[] fl && (fl[0] = 1) == 1
                        && IntStream.rangeClosed(1, k).allMatch(c -> fl[0] == 0 || (LA[c] = new long[N]) != null && (LW[c] = new long[N]) != null && (fl[0] = 0) == 0
                            && Long.valueOf(gU[d * K1 + c] * ic[c] % 1000000007L) instanceof Long ca && Long.valueOf(ic[c]) instanceof Long cw
                            && IntStream.range(lo, hi).allMatch(bi -> Integer.valueOf(ord[bi]) instanceof Integer B && Long.valueOf(fact[Integer.bitCount(B) - 1]) instanceof Long om && Integer.valueOf((N - 1) ^ B) instanceof Integer cp
                                && IntStream.range(0, 1 << (k - Integer.bitCount(B))).allMatch(ix -> Integer.valueOf(Integer.expand(ix, cp)) instanceof Integer M
                                    && (LA[c - 1][M] == 0 && LW[c - 1][M] == 0 || (fl[0] = 1) == 1 && (LA[c][M | B] = (LA[c][M | B] + LA[c - 1][M] * om % 1000000007L * ca) % 1000000007L) >= 0 && (LW[c][M | B] = (LW[c][M | B] + LW[c - 1][M] * om % 1000000007L * cw) % 1000000007L) >= 0)))
                            && IntStream.range(0, N).allMatch(x -> (FA[x] = (FA[x] + LA[c][x]) % 1000000007L) >= 0 && (FW[x] = (FW[x] + LW[c][x]) % 1000000007L) >= 0))
                    : IntStream.range(lo, hi).allMatch(bi -> Integer.valueOf(ord[bi]) instanceof Integer B && Long.valueOf(fact[Integer.bitCount(B) - 1]) instanceof Long om && Integer.valueOf((N - 1) ^ B) instanceof Integer cp
                        && IntStream.range(0, 1 << (k - Integer.bitCount(B))).allMatch(ix -> Integer.valueOf(Integer.expand(ix, cp)) instanceof Integer M
                            && (FA[M | B] = (FA[M | B] + FA[M] * om % 1000000007L * gU[d * K1 + 1]) % 1000000007L) >= 0 && (FW[M | B] = (FW[M | B] + FW[M] * om) % 1000000007L) >= 0)))) instanceof IntPredicate proc
            && IntStream.range(0, ns).allMatch(proc) && (snap[0] = FA[N - 1]) >= 0 && (snap[1] = FW[N - 1]) >= 0 && IntStream.range(ns, D).allMatch(proc)
            ? (k == 0 ? (fixedMax <= 2 ? 1L : baseProd) : (baseProd * (fixedMax <= 2 ? (FA[N - 1] - snap[0] + 1000000007L) % 1000000007L : FA[N - 1]) + (fixedMax <= 2 ? snap[1] : 0L)) % 1000000007L) : "");
    }
}



