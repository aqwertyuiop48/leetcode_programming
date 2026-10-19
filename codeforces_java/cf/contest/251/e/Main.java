import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(2 * n) instanceof Integer N && Long.valueOf(1000000007L) instanceof Long M
            && new int[N - 1] instanceof int[] ea && new int[N - 1] instanceof int[] eb && new int[N + 2] instanceof int[] deg
            && IntStream.range(0, N - 1).allMatch(i -> (ea[i] = it.next()) > 0 && (eb[i] = it.next()) > 0 && ++deg[ea[i]] > 0 && ++deg[eb[i]] > 0)
            && IntStream.rangeClosed(1, N).allMatch(v -> deg[v] <= 3)
            && new int[N + 2] instanceof int[] st && IntStream.rangeClosed(1, N).allMatch(v -> (st[v + 1] = st[v] + deg[v]) >= 0)
            && st.clone() instanceof int[] fp && new int[2 * N] instanceof int[] to && new int[2 * N] instanceof int[] eid
            && IntStream.range(0, N - 1).allMatch(i -> (to[fp[ea[i]]] = eb[i]) > 0 && (eid[fp[ea[i]]++] = 2 * i) >= 0 && (to[fp[eb[i]]] = ea[i]) > 0 && (eid[fp[eb[i]]++] = 2 * i + 1) >= 0)
            && ((IntBinaryOperator) (a, b) -> to[st[a]] == b ? eid[st[a]] : to[st[a] + 1] == b ? eid[st[a] + 1] : eid[st[a] + 2]) instanceof IntBinaryOperator did
            && ((BiFunction<Integer, Integer, int[]>) (v, ex) -> Integer.valueOf(to[st[v]]) instanceof Integer a0 && Integer.valueOf(deg[v] > 1 ? to[st[v] + 1] : 0) instanceof Integer a1 && Integer.valueOf(deg[v] > 2 ? to[st[v] + 2] : 0) instanceof Integer a2
                ? a0.equals(ex) ? (deg[v] > 2 ? new int[]{a1, a2} : deg[v] > 1 ? new int[]{a1} : new int[0]) : a1.equals(ex) ? (deg[v] > 2 ? new int[]{a0, a2} : new int[]{a0}) : a2.equals(ex) ? new int[]{a0, a1} : (deg[v] > 2 ? new int[]{a0, a1, a2} : deg[v] > 1 ? new int[]{a0, a1} : new int[]{a0}) : null) instanceof BiFunction<Integer, Integer, int[]> oth
            && new int[4 * N + 8] instanceof int[] cv && new int[2 * N] instanceof int[] cpos && new int[2 * N] instanceof int[] cdir && new int[2 * N] instanceof int[] cl && new int[]{0} instanceof int[] top
            && IntStream.rangeClosed(1, N).filter(s -> deg[s] != 2).allMatch(s -> IntStream.range(st[s], st[s + 1]).allMatch(k -> Integer.valueOf(top[0]) instanceof Integer base
                && (cv[base] = s) > 0 && (cv[base + 1] = to[k]) > 0 && new int[]{s, to[k], 1} instanceof int[] w
                && IntStream.iterate(0, z -> deg[w[1]] == 2, z -> z + 1).allMatch(z -> Integer.valueOf(to[st[w[1]]] != w[0] ? to[st[w[1]]] : to[st[w[1]] + 1]) instanceof Integer nx
                    && (cv[base + w[2] + 1] = nx) > 0 && (w[0] = w[1]) > 0 && (w[1] = nx) > 0 && ++w[2] > 0)
                && IntStream.range(0, w[2]).allMatch(t -> Integer.valueOf(did.applyAsInt(cv[base + t], cv[base + t + 1])) instanceof Integer d
                    && (cpos[d] = base + t) >= 0 && (cdir[d] = 1) > 0 && (cl[d] = w[2] - t) > 0 && (cpos[d ^ 1] = base + t + 1) > 0 && (cdir[d ^ 1] = -1) < 0 && (cl[d ^ 1] = t + 1) > 0)
                && (top[0] += w[2] + 1) > 0))
            && ((IntBinaryOperator) (a, b) -> Integer.valueOf(did.applyAsInt(a, b)) instanceof Integer d && deg[cv[cpos[d] + cdir[d] * cl[d]]] == 1 ? cl[d] : -1) instanceof IntBinaryOperator pure
            && ((IntBinaryOperator) (d, k) -> cv[cpos[d] + cdir[d] * k]) instanceof IntBinaryOperator vat
            && new long[2 * N] instanceof long[] memo && IntStream.range(0, 2 * N).allMatch(i -> (memo[i] = -1) < 0)
            && ((Function<IntToLongFunction, Long>) f -> f.applyAsLong(0) + f.applyAsLong(1)) instanceof Function<IntToLongFunction, Long> pair
            && new AtomicReference<BiFunction<Integer, Integer, Long>>() instanceof AtomicReference<BiFunction<Integer, Integer, Long>> sf
            && ((BiFunction<Integer, Integer, Long>) (d, k) -> cl[d] >= k + 1 ? sf.get().apply(vat.applyAsInt(d, k), vat.applyAsInt(d, k + 1)) : 0L) instanceof BiFunction<Integer, Integer, Long> ex
            && sf.compareAndSet(null, (p, q) -> Long.valueOf(p > 0 ? memo[did.applyAsInt(p, q)] : -1L) instanceof Long mm && mm >= 0 ? mm
                : oth.apply(q, p) instanceof int[] hn
                && Long.valueOf((hn.length == 2
                    ? pair.apply(o -> Integer.valueOf(pure.applyAsInt(q, hn[o])) instanceof Integer Lp && Lp >= 0 && Integer.valueOf(hn[1 - o]) instanceof Integer xo
                        ? (Lp == 1 ? sf.get().apply(q, xo) : 0L) + (Lp >= 2 ? ex.apply(did.applyAsInt(q, xo), Lp - 1) : 0L) + ex.apply(did.applyAsInt(q, xo), Lp + 1) : 0L)
                        + (Integer.valueOf(pure.applyAsInt(q, hn[0])) instanceof Integer L0 && Integer.valueOf(pure.applyAsInt(q, hn[1])) instanceof Integer L1 && L0 >= 1 && L1 >= 1 && Math.abs(L0 - L1) == 1 ? 1L : 0L)
                    : hn.length == 1
                    ? Integer.valueOf(did.applyAsInt(q, hn[0])) instanceof Integer d1 && Integer.valueOf(cl[d1]) instanceof Integer D && Integer.valueOf(cv[cpos[d1] + cdir[d1] * D]) instanceof Integer y
                        ? (deg[hn[0]] == 2 ? sf.get().apply(hn[0], oth.apply(hn[0], q)[0]) : 0L) + (D == 1 && deg[hn[0]] == 1 ? 1L : 0L)
                            + (deg[y] == 3 && oth.apply(y, vat.applyAsInt(d1, D - 1)) instanceof int[] n12
                                ? pair.apply(o -> Integer.valueOf(n12[o]) instanceof Integer b_ && Integer.valueOf(n12[1 - o]) instanceof Integer c_
                                    ? (pure.applyAsInt(y, b_) == D + 1 ? sf.get().apply(y, c_) : 0L)
                                        + (D >= 2 && pure.applyAsInt(y, b_) == D - 1 ? sf.get().apply(y, c_) : 0L)
                                        + (deg[b_] == 3 && oth.apply(b_, y) instanceof int[] m12
                                            ? (Integer.valueOf(pure.applyAsInt(b_, m12[0])) instanceof Integer l0 && Integer.valueOf(pure.applyAsInt(b_, m12[1])) instanceof Integer l1 && l0 >= 0 && l1 >= 0 && (l0.equals(D) || l1.equals(D))
                                                && Integer.valueOf(l0.equals(D) ? l1 : l0) instanceof Integer lamR && lamR >= 1
                                                ? (l0.equals(D) && l1.equals(D) ? 2L : 1L) * (ex.apply(did.applyAsInt(y, c_), lamR) + (pure.applyAsInt(y, c_) == lamR ? 1L : 0L)) : 0L)
                                                + (Integer.valueOf(pure.applyAsInt(y, c_)) instanceof Integer pc && pc >= 1
                                                    ? pair.apply(o2 -> pure.applyAsInt(b_, m12[o2]) == D ? ex.apply(did.applyAsInt(b_, m12[1 - o2]), pc) : 0L) : 0L)
                                            : 0L) : 0L) : 0L)
                            + (deg[y] == 1 && D % 2 == 1 && D >= 3 ? 1L : 0L) : 0L
                    : 0L) % M) instanceof Long res && (p <= 0 || (memo[did.applyAsInt(p, q)] = res) >= 0) ? res : 0L)
            && new int[N + 1] instanceof int[] ord && new int[N + 1] instanceof int[] par && new int[N + 1] instanceof int[] sz && new int[]{1} instanceof int[] oc && (ord[0] = 1) == 1
            && IntStream.range(0, N).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v && (sz[v] = 1) > 0
                && IntStream.range(st[v], st[v + 1]).filter(s -> to[s] != par[v]).allMatch(s -> (par[to[s]] = v) > 0 && (ord[oc[0]++] = to[s]) > 0))
            && IntStream.iterate(N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && IntStream.range(0, 2 * (N - 1)).mapToLong(d -> ((long) (par[d % 2 == 0 ? eb[d / 2] : ea[d / 2]] == (d % 2 == 0 ? ea[d / 2] : eb[d / 2]) ? sz[d % 2 == 0 ? eb[d / 2] : ea[d / 2]] : N - sz[d % 2 == 0 ? ea[d / 2] : eb[d / 2]]) << 20) | d).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] by
            && Arrays.stream(by).allMatch(d -> sf.get().apply(d % 2 == 0 ? ea[d / 2] : eb[d / 2], d % 2 == 0 ? eb[d / 2] : ea[d / 2]) >= 0)
            ? LongStream.rangeClosed(1, N).map(q -> sf.get().apply(0, (int) q)).sum() % M : 0);
    }
}
