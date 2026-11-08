import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer q
            && new long[n + 1] instanceof long[] a && new int[n + 1] instanceof int[] f && new int[n + 2] instanceof int[] cnt && new long[n + 1] instanceof long[] S && new long[n + 1] instanceof long[] Uc
            && new long[n + 1] instanceof long[] rmin && new long[n + 1] instanceof long[] rmax
            && IntStream.rangeClosed(1, n).filter(i -> (a[i] = Long.parseLong(tk.nextToken())) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> ++cnt[f[i] = Integer.parseInt(tk.nextToken())] > 0).count() >= 0
            && ((IntToLongFunction) x -> a[x] / (cnt[x] + 2)) instanceof IntToLongFunction sh
            && ((IntToLongFunction) x -> a[x] - sh.applyAsLong(x) * (cnt[x] + 1) + S[x]) instanceof IntToLongFunction U
            && IntStream.rangeClosed(1, n).filter(i -> (S[f[i]] += sh.applyAsLong(i)) >= 0).count() >= 0
            && Stream.of(0).peek(z -> Arrays.fill(rmin, Long.MIN_VALUE)).findFirst().isPresent()
            && Stream.of(0).peek(z -> Arrays.fill(rmax, Long.MIN_VALUE)).findFirst().isPresent()
            && Stream.generate(TreeMap<Long, Integer>::new).limit(n + 1).collect(Collectors.toList()) instanceof List<TreeMap<Long, Integer>> gr
            && new TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> gmin && new TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> gmax
            && ((BiFunction<Integer, Integer, Integer>) (u, v) -> u + v == 0 ? null : u + v) instanceof BiFunction<Integer, Integer, Integer> dec
            && ((IntPredicate) x -> gr.get(f[x]).merge(Uc[x], -1, dec) == null || true) instanceof IntPredicate rem
            && ((IntPredicate) x -> gr.get(f[x]).merge(Uc[x], 1, Integer::sum) > 0) instanceof IntPredicate add
            && ((IntPredicate) g -> (gr.get(g).isEmpty() ? Long.valueOf(Long.MIN_VALUE) : Long.valueOf(gr.get(g).firstKey() + sh.applyAsLong(g))) instanceof Long nm
                && (gr.get(g).isEmpty() ? Long.valueOf(Long.MIN_VALUE) : Long.valueOf(gr.get(g).lastKey() + sh.applyAsLong(g))) instanceof Long nx
                && (nm == rmin[g] || ((rmin[g] == Long.MIN_VALUE || (gmin.merge(rmin[g], -1, dec) == null | true)) && (nm == Long.MIN_VALUE || gmin.merge(nm, 1, Integer::sum) > 0) && (rmin[g] = nm) == nm))
                && (nx == rmax[g] || ((rmax[g] == Long.MIN_VALUE || (gmax.merge(rmax[g], -1, dec) == null | true)) && (nx == Long.MIN_VALUE || gmax.merge(nx, 1, Integer::sum) > 0) && (rmax[g] = nx) == nx))) instanceof IntPredicate refresh
            && IntStream.rangeClosed(1, n).filter(i -> (Uc[i] = U.applyAsLong(i)) >= 0 & add.test(i)).count() >= 0
            && IntStream.rangeClosed(1, n).filter(g -> refresh.test(g)).count() >= 0
            ? IntStream.range(0, q).mapToObj(z -> Integer.valueOf(tk.nextToken()) instanceof Integer ty
                ? (ty == 1
                    ? (Integer.valueOf(tk.nextToken()) instanceof Integer i && Integer.valueOf(tk.nextToken()) instanceof Integer x && Integer.valueOf(f[i]) instanceof Integer p
                        && new int[]{i, p, x, f[p], f[x]} instanceof int[] raw && IntStream.range(0, 5).filter(t -> IntStream.range(0, t).noneMatch(u -> raw[u] == raw[t])).map(t -> raw[t]).toArray() instanceof int[] X && Arrays.stream(X).map(y -> f[y]).toArray() instanceof int[] oldG
                        && Arrays.stream(X).allMatch(rem) && Long.valueOf(sh.applyAsLong(i)) instanceof Long si
                        && Long.valueOf(sh.applyAsLong(p)) instanceof Long op && (S[p] -= si) != Long.MIN_VALUE && --cnt[p] >= 0 && (S[f[p]] += sh.applyAsLong(p) - op) != Long.MIN_VALUE
                        && Long.valueOf(sh.applyAsLong(x)) instanceof Long oq && (S[x] += si) != Long.MIN_VALUE && ++cnt[x] > 0 && (S[f[x]] += sh.applyAsLong(x) - oq) != Long.MIN_VALUE && (f[i] = x) > 0
                        && Arrays.stream(X).allMatch(y -> (Uc[y] = U.applyAsLong(y)) >= 0 && add.test(y))
                        && Arrays.stream(oldG).allMatch(refresh) && Arrays.stream(X).map(y -> f[y]).allMatch(refresh) && refresh.test(p) && refresh.test(x) ? "" : "!")
                    : ty == 2 ? Integer.valueOf(tk.nextToken()) instanceof Integer c ? String.valueOf(Uc[c] + sh.applyAsLong(f[c])) : ""
                    : gmin.firstKey() + " " + gmax.lastKey())
                : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
